package cn.cai.classlibrary.enums;

/**
 * 相应状态枚举类
 *
 * @author caishenao
 */
public enum HTTPStatusEnum {
    /**
     * 响应成功
     */
    SUCCESS(200, "响应成功!"),
    /**
     * 警告信息
     */
    WARNING(400, "警告!"),
    /**
     * 服务端异常
     */
    ERRORR(500, "服务器异常！请联系管理员");


    /**
     * 响应码
     */
    private Integer code;

    /**
     * 相应解释
     */
    private String msg;


    HTTPStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
