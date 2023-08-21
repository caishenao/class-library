package cn.cai.classlibrary.oss.entry;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * OSS类
 *
 * @author caishenao
 * @since 2023-0-20
 */
public class OSSUpload extends OSS{


    /**
     * 输入流
     */
    private InputStream stream;

    /**
     * 上传时间
     */
    private LocalDateTime updateTime;

    /**
     * 上传类型
     */
    private String uploadType;


    public OSSUpload() {
    }

    public InputStream getStream() {
        return stream;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OSSUpload ossUpload = (OSSUpload) o;
        return Objects.equals(stream, ossUpload.stream) && Objects.equals(updateTime, ossUpload.updateTime) && Objects.equals(uploadType, ossUpload.uploadType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stream, updateTime, uploadType);
    }
}
