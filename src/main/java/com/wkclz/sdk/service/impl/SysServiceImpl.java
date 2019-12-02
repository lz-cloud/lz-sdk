package com.wkclz.sdk.service.impl;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.sys.Tenant;
import com.wkclz.sdk.feign.SysFeign;
import com.wkclz.sdk.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysServiceImpl implements SysService {

    @Autowired
    private SysFeign sysFeign;

    @Override
    public Result<Tenant> tenantSave(Tenant tenant) {
        Result<Tenant> result = sysFeign.tenantSave(tenant);
        return result;
    }
}
