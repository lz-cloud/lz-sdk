package com.wkclz.sdk.service.impl;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.sys.Organization;
import com.wkclz.sdk.feign.SysFeign;
import com.wkclz.sdk.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysServiceImpl implements SysService {

    @Autowired
    private SysFeign sysFeign;

    @Override
    public Result<Organization> orgSave(Organization organization) {
        Result<Organization> result = sysFeign.orgSave(organization);
        return result;
    }
}
