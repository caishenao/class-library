package cn.cai.classlibrary.basic;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 带有修改人信息的基础了类
 *
 * @author caishenao
 */
public abstract class BasicUpdate extends BasicObject {

    /**
     * 修改人
     */
    private String updateId;

    /**
     * 修改人名称
     */
    private String updatName;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    public BasicUpdate(String updateId, String updatName, LocalDateTime updateTime) {
        this.updateId = updateId;
        this.updatName = updatName;
        this.updateTime = updateTime;
    }

    public BasicUpdate() {
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public String getUpdatName() {
        return updatName;
    }

    public void setUpdatName(String updatName) {
        this.updatName = updatName;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicUpdate that = (BasicUpdate) o;
        return Objects.equals(updateId, that.updateId) && Objects.equals(updatName, that.updatName) && Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateId, updatName, updateTime);
    }
}
