package com.dukoia.cloud.enums;

/**
 * @Description: ExceptionEnums
 * @Author: jiangze.He
 * @Date: 2021-06-17
 * @Version:v1.0
 */
public enum ExceptionEnums {

    NOT_FOUND(4004,"没有找到");

    private Integer code;
    private String msg;

    ExceptionEnums(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
