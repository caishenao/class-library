package cn.cai.classlibrary.basic;

import java.time.LocalDateTime;

/**
 * 带有创建人信息的基础类
 *
 * @author caishenao
 * @since 2023-08-20
 */
public abstract class BasicCreate extends BasicObject {

    /**
     * 创建人id
     */
    private String createId;

    /**
     * 创建人
     */
    private String createName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

}
