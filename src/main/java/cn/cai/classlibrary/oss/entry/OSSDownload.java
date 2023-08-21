package cn.cai.classlibrary.oss.entry;

import java.io.OutputStream;
import java.time.LocalDateTime;

/**
 * OSS下载类
 */
public class OSSDownload extends OSS{
    /**
     * 下载输出流
     */
    private OutputStream stream;

    /**
     * 下载时间
     */
    private LocalDateTime downloadTime;

    /**
     * 下载类型
     */
    private String downloadType;

    public OSSDownload() {
    }


    public OutputStream getStream() {
        return stream;
    }

    public void setStream(OutputStream stream) {
        this.stream = stream;
    }

    public LocalDateTime getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(LocalDateTime downloadTime) {
        this.downloadTime = downloadTime;
    }

    public String getDownloadType() {
        return downloadType;
    }

    public void setDownloadType(String downloadType) {
        this.downloadType = downloadType;
    }
}
