package com.example.springboot.abstractDemo;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.ValidationUtils;

/**
 *@Author sqb
 *@Date 18:39
 */
abstract  public class AbstractBiz<Req, Param, Res> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Res process(Req request){
        String subClassName = this.getClass().getSimpleName();
        Res result = null;

        try {
            logger.info("[biz] -->" +  subClassName + "调用开始，入参：{}" + JSON.toJSONString(request));
            doBefore(request);
            result =  execute(buildParam(request));
            doAfter(request, result);
            return result;
        } catch (Throwable e) {

            e.printStackTrace();
        } finally {
            return result;
        }

    }


    /**
     *  执行方法
     * @param param
     * @return
     * @throws Throwable
     */
    protected abstract Res execute(Param param) throws Throwable;

    protected abstract Param buildParam(Req req) throws Throwable;

    /**
     * 前置处理
     */
    private void doBefore(Req req){
       before(req);
    }

    /**
     * 后置处理
     * @param
     */

    private void doAfter(Req request, Res result){
        after(request, result);
    }

    private void  doSuccess(Req request, Res result){
        success(request, result);
    }

    protected void success(Req request, Res result){}



    protected void after(Req request, Res result){}

//    protected void before(Req request) {
//        //参数校验
//        ValidationUtils.ValidationResult validationResult = ValidationUtils.validateWithFailFast(request);
//        if (validationResult.isPass()) {
//            return;
//        }
//        throw new TradeManageBizException(ILLEGAL_ARGUMENT.getCode()
//                , validationResult.getMsg());
//    }
//

    protected void before(Req req) {
        //参数校验
        if(true){
            return ;
        }
        //校验失败
        throw new NullPointerException("校验失败，抛出异常");

    }

}
