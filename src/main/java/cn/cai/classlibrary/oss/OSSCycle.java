package cn.cai.classlibrary.oss;

import cn.cai.classlibrary.oss.entry.OSS;
import cn.cai.classlibrary.oss.entry.OSSUpload;


/**
 * OSS对象周期
 */
public interface OSSCycle {
    /**
     * 上传到公共位置的对象接口
     *
     * @param upload 上传对象
     */
    void uploadByPublic(OSSUpload upload);

    /**
     * 上传到私有位置的上传接口
     *
     * @param upload 要上传的对象
     */
    void uploadByPrivate(OSSUpload upload);

    /**
     * 下载
     *
     * @param oss 文件信息
     * @return 下载的对象
     */
    OSS download(OSS oss);
}
