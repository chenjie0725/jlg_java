package com.sankuai.inf.leaf;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 *根据业务类型和id数量获取id
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: leaf.proto")
public class LeafSegmentServiceGrpc {

  private LeafSegmentServiceGrpc() {}

  public static final String SERVICE_NAME = "LeafSegmentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sankuai.inf.leaf.LeafReq,
      com.sankuai.inf.leaf.LeafResult> METHOD_GET_LEAF_SEGMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "LeafSegmentService", "getLeafSegment"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.sankuai.inf.leaf.LeafReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.sankuai.inf.leaf.LeafResult.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeafSegmentServiceStub newStub(io.grpc.Channel channel) {
    return new LeafSegmentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeafSegmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LeafSegmentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static LeafSegmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LeafSegmentServiceFutureStub(channel);
  }

  /**
   * <pre>
   *根据业务类型和id数量获取id
   * </pre>
   */
  public static abstract class LeafSegmentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLeafSegment(com.sankuai.inf.leaf.LeafReq request,
        io.grpc.stub.StreamObserver<com.sankuai.inf.leaf.LeafResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_LEAF_SEGMENT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_LEAF_SEGMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.sankuai.inf.leaf.LeafReq,
                com.sankuai.inf.leaf.LeafResult>(
                  this, METHODID_GET_LEAF_SEGMENT)))
          .build();
    }
  }

  /**
   * <pre>
   *根据业务类型和id数量获取id
   * </pre>
   */
  public static final class LeafSegmentServiceStub extends io.grpc.stub.AbstractStub<LeafSegmentServiceStub> {
    private LeafSegmentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LeafSegmentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeafSegmentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LeafSegmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLeafSegment(com.sankuai.inf.leaf.LeafReq request,
        io.grpc.stub.StreamObserver<com.sankuai.inf.leaf.LeafResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_LEAF_SEGMENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *根据业务类型和id数量获取id
   * </pre>
   */
  public static final class LeafSegmentServiceBlockingStub extends io.grpc.stub.AbstractStub<LeafSegmentServiceBlockingStub> {
    private LeafSegmentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LeafSegmentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeafSegmentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LeafSegmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sankuai.inf.leaf.LeafResult getLeafSegment(com.sankuai.inf.leaf.LeafReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_LEAF_SEGMENT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *根据业务类型和id数量获取id
   * </pre>
   */
  public static final class LeafSegmentServiceFutureStub extends io.grpc.stub.AbstractStub<LeafSegmentServiceFutureStub> {
    private LeafSegmentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LeafSegmentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeafSegmentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LeafSegmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sankuai.inf.leaf.LeafResult> getLeafSegment(
        com.sankuai.inf.leaf.LeafReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_LEAF_SEGMENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LEAF_SEGMENT = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LeafSegmentServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(LeafSegmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LEAF_SEGMENT:
          serviceImpl.getLeafSegment((com.sankuai.inf.leaf.LeafReq) request,
              (io.grpc.stub.StreamObserver<com.sankuai.inf.leaf.LeafResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_LEAF_SEGMENT);
  }

}
