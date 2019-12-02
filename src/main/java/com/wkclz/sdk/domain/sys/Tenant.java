package com.wkclz.sdk.domain.sys;

import com.wkclz.core.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description: Create by Shrimp Generator
 * @author: wangkaicun @ current time
 * @table: sys_tenant (租户)
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class Tenant extends BaseModel {

    /**
     * ID
     */
    private Long id;

    /**
     * 租户名称
     */
    private String name;

    /**
     * 租户标题
     */
    private String title;

    /**
     * 租户关键词
     */
    private String keywords;

    /**
     * 租户描述
     */
    private String description;

    /**
     * 租户图标
     */
    private String icon;

    /**
     * 租户logo
     */
    private String logo;

    /**
     * 版权信息
     */
    private String copyright;

    /**
     * 地区
     */
    private String area;

    /**
     * 类型
     */
    private String type;

    /**
     * 默认生效域名
     */
    private String domain;

    /**
     * 支持的域名
     */
    private String domains;

    /**
     * 管理员域名
     */
    private String adminDomain;

    /**
     * banner图组
     */
    private String banners;



}
