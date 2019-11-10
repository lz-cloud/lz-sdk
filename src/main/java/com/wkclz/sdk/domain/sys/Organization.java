package com.wkclz.sdk.domain.sys;

import com.wkclz.core.base.BaseModel;
import lombok.Data;

import java.util.Date;

/**
 * Description: Create by Shrimp Generator
 * @author: wangkaicun @ current time
 * @table: sys_organization (组织机构)
 */

@Data
public class Organization extends BaseModel {

    /**
     * ID
     */
    private Long id;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 网站标题
     */
    private String title;

    /**
     * 网站关键词
     */
    private String keywords;

    /**
     * 网站描述
     */
    private String description;

    /**
     * 网站图标
     */
    private String icon;

    /**
     * 网站logo
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

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 可用状态
     */
    private Integer enableFlag;

    /**
     * 可用开始
     */
    private Date enableBegin;

    /**
     * 可用结束
     */
    private Date enableEnd;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 备注
     */
    private String comments;

}
