package com.sankuai.inf.leaf.server.controller;

import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.Status;
import com.sankuai.inf.leaf.server.exception.LeafServerException;
import com.sankuai.inf.leaf.server.exception.NoKeyException;
import com.sankuai.inf.leaf.server.service.SegmentService;
import com.sankuai.inf.leaf.server.service.SnowflakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeafController {

    @Autowired
    private SegmentService segmentService;
    @Autowired
    private SnowflakeService snowflakeService;

    @Value("${15151515}")
    public String MysqlJsonStr;

    @RequestMapping(value = "/api/segment/get/{key}")
    @ResponseBody
    public Result getSegmentId(@PathVariable("key") String key) {
        System.out.println("mysqlStr"+MysqlJsonStr);
        return get(key, segmentService.getId(key));
    }

//    @RequestMapping(value = "/api/snowflake/get/{key}")
//    public String getSnowflakeId(@PathVariable("key") String key) {
//        return get(key, snowflakeService.getId(key));
//    }

    private Result get(@PathVariable("key") String key, Result res) {
        Result result;
        if (key == null || key.isEmpty()) {
            throw new NoKeyException();
        }
        result = res;
        if (result.getStatus().equals(Status.EXCEPTION)) {
            throw new LeafServerException(result.toString());
        }
        return result;
    }
}
