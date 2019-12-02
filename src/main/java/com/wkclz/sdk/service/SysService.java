package com.wkclz.sdk.service;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.sys.Tenant;

public interface SysService {

    Result<Tenant> tenantSave(Tenant tenant);
}
