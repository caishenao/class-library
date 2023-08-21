package cn.cai.classlibrary.handler;

import cn.cai.classlibrary.enums.HTTPStatusEnum;
import cn.cai.classlibrary.exceptions.BasicException;
import cn.cai.classlibrary.result.ResponseData;
import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理类
 *
 * @author caishenao
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 基础异常信息处理方法
     *
     * @param exception 基础的响应
     * @return 异常类型的响应体
     */
    @ExceptionHandler(Exception.class)
    public ResponseData<Void> runtimeExceptionHandler(Exception exception) {
        DateTime now = new DateTime();
        return new ResponseData(HTTPStatusEnum.ERRORR.getCode(), exception.getMessage(), now.getMillis());
    }


    /**
     * 基础异常处理方法
     *
     * @param basicException 基础异常处理
     * @return 异常类型响应
     */
    @ExceptionHandler(BasicException.class)
    public ResponseData<Void> basicExceptionHandler(BasicException basicException) {
        return ResponseData.responseByException(basicException);
    }

}
