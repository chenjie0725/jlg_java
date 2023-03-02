package com.sankuai.inf.leaf.server.grpcService;


import com.sankuai.inf.leaf.LeafReq;
import com.sankuai.inf.leaf.LeafResult;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.server.service.SegmentService;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;


@GrpcService
@Slf4j
public class LeafSegmentServiceGrpc extends com.sankuai.inf.leaf.LeafSegmentServiceGrpc.LeafSegmentServiceImplBase {


    @Autowired
    SegmentService segmentService;

    @Override
    public void getLeafSegment(LeafReq request, StreamObserver<LeafResult> responseObserver) {
        Result result = new Result();
        LeafResult.Builder builder = LeafResult.newBuilder();
        builder.setCode(0).setSuccess(true).setMsg("success");
        try {
            if (request.getNum() <= 1) {
                result = segmentService.getId(request.getKey());
                builder.setData(LeafResult.Data.newBuilder().addId(result.getId()).build());
            } else {
                result = segmentService.getId(request.getKey(), request.getNum());
                builder.setData(LeafResult.Data.newBuilder().addAllId(result.getIds()).build());
            }
        } catch (Exception e) {
            log.error("grpc服务异常：>>>", e);
            builder.setCode(-1).setSuccess(false).setMsg(e.getMessage());
        } finally {
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        }
    }
}
