package cn.cai.classlibrary.result;

import cn.cai.classlibrary.basic.BasicObject;
import cn.cai.classlibrary.enums.HTTPStatusEnum;
import cn.cai.classlibrary.exceptions.BasicException;
import org.joda.time.DateTime;

import javax.validation.constraints.NotNull;

/**
 * 基础的相应数据
 *
 * @author caishenao
 */
public final class ResponseData<T> extends BasicObject {

    /**
     * 相应码
     */
    private Integer code;

    /**
     * 相应信息
     */
    private String msg;

    /**
     * 相应时间戳
     */
    private Long timestamp;

    /**
     * 相应数据
     */
    private T data;

    public ResponseData() {
    }

    public ResponseData(Integer code, String msg, Long timestamp) {
        this.code = code;
        this.msg = msg;
        this.timestamp = timestamp;
    }

    /**
     * 相应成功的响应体
     *
     * @param data 要相应的数据
     * @param <T>  数据类型
     * @return 相应体
     */
    public static <T> ResponseData<T> success(T data) {
        ResponseData<T> response = new ResponseData<>();
        DateTime now = new DateTime();
        response.code = HTTPStatusEnum.SUCCESS.getCode();
        response.msg = HTTPStatusEnum.SUCCESS.getMsg();
        response.timestamp = now.getMillis();
        response.data = data;
        return response;
    }


    /**
     * 相应信息
     *
     * @param msg 自定义相应信息
     * @return 没有相应数据的相应体
     */
    public static ResponseData<Void> success(String msg) {
        ResponseData<Void> response = new ResponseData<>();
        DateTime now = new DateTime();
        response.code = HTTPStatusEnum.SUCCESS.getCode();
        response.msg = msg;
        response.timestamp = now.getMillis();
        return response;
    }

    /**
     * 根据相应枚举类创建相应信息
     *
     * @param responseEnum 相应枚举
     * @return 没有相应数据的相应对象
     */
    public static ResponseData<Void> responseByEnum(HTTPStatusEnum responseEnum) {
        ResponseData<Void> response = new ResponseData<>();
        DateTime now = new DateTime();
        response.timestamp = now.getMillis();
        response.code = responseEnum.getCode();
        response.msg = responseEnum.getMsg();
        return response;
    }

    /**
     * 响应异常
     *
     * @param basicException 基础响应对象
     * @return 带有异常响应码和响应信息的响应对象
     */
    public static ResponseData<Void> responseByException(@NotNull BasicException basicException) {
        ResponseData<Void> response = new ResponseData<>();
        DateTime now = new DateTime();
        response.code = basicException.getCode();
        response.msg = basicException.getMsg();
        response.timestamp = now.getMillis();
        return response;
    }

}
