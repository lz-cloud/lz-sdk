package com.wkclz.sdk.service.impl;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.Organization;
import com.wkclz.sdk.feign.SysFeign;
import com.wkclz.sdk.service.SysOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysOrgServiceImpl implements SysOrgService {

    @Autowired
    private SysFeign sysFeign;

    @Override
    public Result<Organization> orgSave(Organization organization) {
        Result<Organization> result = sysFeign.orgSave(organization);
        return result;
    }
}
