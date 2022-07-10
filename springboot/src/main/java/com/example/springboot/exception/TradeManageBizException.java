package com.example.springboot.exception;/**
 * @description:
 * @author: lll
 * @date: 2022-06-23 22:25
 */

/**
 *@Author sqb
 *@Date 22:25
 */
public class TradeManageBizException extends RuntimeException{

    private String code;
    private String msg;



    public TradeManageBizException(String code, String msg){
        super(msg);
        this.code = code ;
        this.msg = msg;
    }



}
