package com.wkclz.sdk.feign;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.constant.Rest;
import com.wkclz.sdk.constant.ServiceId;
import com.wkclz.sdk.domain.cas.UserAdmin;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = ServiceId.LZ_CAS)
public interface CasFeign {


    @PostMapping(Rest.USER_ADMIN_ADD)
    Result<UserAdmin> userAdminAdd(@RequestBody UserAdmin userAdmin);

    @PostMapping(Rest.USER_ADMIN_REMOVE)
    Result<UserAdmin> userAdminRemove(@RequestBody UserAdmin userAdmin);
}
