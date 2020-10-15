package com.wangteng.common.bean;

import com.wangteng.common.base.MResponse;
import com.wangteng.common.base.MUserDemand;
import lombok.Getter;
import lombok.Setter;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2019/11/22
 */
@Getter
@Setter
public class MUserRequestBean {
    private MUserDemand userDemand;
    private MResponse data;

    @Override
    public String toString() {
        return "MUserRequestBean{" +
                "userDemand=" + userDemand +
                ", data=" + data +
                '}';
    }
}