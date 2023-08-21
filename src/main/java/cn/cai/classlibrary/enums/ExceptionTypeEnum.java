package cn.cai.classlibrary.enums;

/**
 * TODO 异常类型枚举
 *
 * @author caishenao
 */
public enum ExceptionTypeEnum {
    /**
     * minio上传失败
     */
    UPLOAD_ERROR(501, "文件上传失败");
    private Integer code;
    private String msg;


    ExceptionTypeEnum(Integer code, String msg) {
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
