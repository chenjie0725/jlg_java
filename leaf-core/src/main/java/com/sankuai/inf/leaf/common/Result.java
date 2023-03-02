package com.sankuai.inf.leaf.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@ToString
public class Result {
    private String id;
    private List<String> ids;
    private Status status;
    private String msg;
    private int code;


    public Result(String id, Status status, int code) {
        this.id = id;
        this.status = status;
        this.code = code;
    }

    public Result(Status status, int code) {
        this.status = status;
        this.code = code;
    }

    public Result() {

    }

    public static Result success(String id) {
        Result result = new Result();
        result.setCode(0);
        result.setStatus(Status.SUCCESS);
        result.setId(id);
        return result;
    }

    public static Result success(List<String> ids) {
        Result result = new Result();
        result.setCode(0);
        result.setStatus(Status.SUCCESS);
        result.setIds(ids);
        return result;
    }

    public static Result error(String msg, int code) {
        Result result = new Result();
        result.setCode(code);
        result.setStatus(Status.EXCEPTION);
        result.setMsg(msg);
        return result;
    }


}
