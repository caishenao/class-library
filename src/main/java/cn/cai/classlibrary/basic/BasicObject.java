package cn.cai.classlibrary.basic;

import com.alibaba.fastjson2.JSONObject;

import java.io.Serializable;

/**
 * 基础类
 *
 * @author caishenao
 * @since 2023-08-20
 */
public abstract class BasicObject implements Serializable {

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
