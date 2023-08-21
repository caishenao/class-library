package cn.cai.classlibrary.oss.service;

import cn.cai.classlibrary.enums.ExceptionTypeEnum;
import cn.cai.classlibrary.exceptions.BasicException;
import cn.cai.classlibrary.oss.OSSCycle;
import cn.cai.classlibrary.oss.client.MinioConfig;
import cn.cai.classlibrary.oss.entry.OSS;
import cn.cai.classlibrary.oss.entry.OSSUpload;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component("minioService")
public class MinioService implements OSSCycle {

    private MinioClient minioClient;
    private MinioConfig minioConfig;

    @Autowired
    public MinioService(MinioClient minioClient, MinioConfig minioConfig) {
        this.minioClient = minioClient;
        this.minioConfig = minioConfig;
    }

    /**
     * 异步上传到公共位置的对象接口
     *
     * @param upload 上传对象
     */
    @Override
    @Async
    public void uploadByPublic(OSSUpload upload) {
        try {
            minioClient.putObject(PutObjectArgs.builder()
                    .bucket(minioConfig.publicBucket)
                    .stream(upload.getStream(), upload.getSize(), -1)
                    .contentType(upload.getType())
                    .build());
        } catch (Exception e) {
            throw BasicException.exceptionByEnum(ExceptionTypeEnum.UPLOAD_ERROR);
        }
    }

    /**
     * 上传到私有位置的上传接口
     *
     * @param upload 要上传的对象
     */
    @Override
    public void uploadByPrivate(OSSUpload upload) {

    }

    /**
     * 下载
     *
     * @param oss 文件信息
     * @return 下载的对象
     */
    @Override
    public OSS download(OSS oss) {
        return null;
    }
}
