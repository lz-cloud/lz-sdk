package com.wkclz.sdk.domain.cas;

import com.wkclz.core.base.BaseModel;
import lombok.Data;

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
     * 租户ID
     */
    private Long tenantId;


}
