package com.wkclz.sdk.constant;

public interface Rest {

    /**
     * sys
     */
    // 1. 租户保存
    String TENANT_SAVE = "/tenant/save";



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
