package com.wkclz.sdk.domain.cas;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.wkclz.core.base.BaseModel;
import com.wkclz.core.util.StringUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Description: Create by Shrimp Generator
 * @author: wangkaicun @ current time
 * @table: cas_user_admin (管理员用户)
 */

@Data
public class UserAdmin extends BaseModel {

    /**
     * ID
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 组织id
     */
    private Long orgId;

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
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date enableBegin;

    /**
     * 可用结束
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date enableEnd;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 备注
     */
    private String comments;

}
