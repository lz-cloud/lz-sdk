package com.wkclz.sdk.feign;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.constant.Rest;
import com.wkclz.sdk.constant.ServiceId;
import com.wkclz.sdk.domain.sys.Organization;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(value = ServiceId.LZ_SYS)
public interface SysFeign {

    @PostMapping(Rest.ORG_SAVE)
    Result<Organization> orgSave(@RequestBody Organization organization);

}
