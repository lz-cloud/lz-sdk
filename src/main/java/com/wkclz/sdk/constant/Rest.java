package com.wkclz.sdk.constant;

import com.wkclz.core.base.annotation.Desc;

public interface Rest {

    /**
     * sys
     */
    // 1. 组织保存
    String ORG_SAVE = "/org/save";



    /**
     * cas
     */
    // 1、用户管理员增加
    String USER_ADMIN_ADD = "/user/admin/add";
    // 2、用户管理员删除
    String USER_ADMIN_REMOVE = "/user/admin/remove";


    /**
     * pay
     */
    // 1. 创建支付订单
    String PAY_ORDER_NEW = "/pay/order/new";
    // 2. 支付状态查询
    String ORDER_PAY_STATUS = "/order/pay/status";

}
