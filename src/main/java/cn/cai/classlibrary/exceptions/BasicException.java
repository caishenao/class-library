package cn.cai.classlibrary.exceptions;

import cn.cai.classlibrary.enums.ExceptionTypeEnum;
import com.alibaba.fastjson2.JSONObject;

import java.util.Objects;

/**
 * 基础异常类
 *
 * @author caishenao
 */
public class BasicException extends RuntimeException {

    /**
     * 异常代码
     */
    private final Integer code;

    /**
     * 异常信息
     */
    private final String msg;

    /**
     * 空参构造
     */
    public BasicException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }


    /**
     * 通过枚举创建基础异常
     *
     * @param typeEnum 异常类型枚举
     * @return 基础的异常
     */
    public static BasicException exceptionByEnum(ExceptionTypeEnum typeEnum) {
        return new BasicException(typeEnum.getCode(), typeEnum.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicException that = (BasicException) o;
        return Objects.equals(code, that.code) && Objects.equals(msg, that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg);
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
