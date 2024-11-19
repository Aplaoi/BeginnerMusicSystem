package com.practicesystem.pojo;

import lombok.Data;

@Data
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result success(){
        Result result=new Result();
        result.code=1;
        result.msg="success";
        return result;
    }

    public static Result success(Object object){
        Result result=new Result();
        result.data=object;
        result.code=1;
        result.msg="success";
        return result;
    }

    public static Result error(String errorMsg){
        Result result=new Result();
        result.msg=errorMsg;
        result.code=0;
        return result;
    }
}