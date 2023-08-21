package cn.cai.classlibrary.oss.client;

import cn.cai.classlibrary.basic.BasicObject;
import io.minio.MinioClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * minio客户端
 *
 * @author caishenao
 */
@Configuration
@ConditionalOnProperty(prefix = "minio")
public class MinioConfig extends BasicObject {
    /**
     * 服务器位置
     */
    private String url;

    /**
     * 用户名 key
     */
    private String accessKey;

    /**
     * 密码
     */
    private String secretKey;

    /**
     * 公共桶资源
     */
    public String publicBucket;

    /**
     * 私有桶资源
     */
    public String privateBucket;

    public MinioConfig() {
    }

    public MinioConfig(String accessKey, String secretKey, String publicBucket, String privateBucket) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.publicBucket = publicBucket;
        this.privateBucket = privateBucket;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getPublicBucket() {
        return publicBucket;
    }

    public void setPublicBucket(String publicBucket) {
        this.publicBucket = publicBucket;
    }

    public String getPrivateBucket() {
        return privateBucket;
    }

    public void setPrivateBucket(String privateBucket) {
        this.privateBucket = privateBucket;
    }

    @Bean("minioClient")
    public MinioClient minioClient() {
        return MinioClient.builder()
                .endpoint(url)
                .credentials(accessKey, secretKey)
                .build();
    }
}
