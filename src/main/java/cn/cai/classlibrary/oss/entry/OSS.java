package cn.cai.classlibrary.oss.entry;

import cn.cai.classlibrary.basic.BasicObject;

/**
 * OSS基础对象
 *
 * @author caishenao
 * @since 2023-08-20
 */
public abstract class OSS extends BasicObject {
    /**
     * 文件名称
     */
    private String name;

    /**
     * 真实名称
     */
    private String trueName;

    /**
     * 路径
     */
    private String path;

    /**
     * 文件大小
     */
    private Long size;

    /**
     * 文件类型
     */
    private String type;

    public OSS() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
