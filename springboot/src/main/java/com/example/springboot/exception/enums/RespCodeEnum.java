package com.example.springboot.exception.enums;

import lombok.Getter;

/**
 * @description:
 * @author: lll
 * @date: 2022-06-23 22:19
 */
public enum RespCodeEnum implements RespCode{

    PROCESS_SUCCESS("0000", "处理成功"),
    ILLEGAL_ARGUMENT("4000", "入参错误");


    @Getter
    private String code;

    @Getter
    private String msg;

    RespCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
