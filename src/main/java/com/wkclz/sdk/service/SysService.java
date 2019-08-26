package com.wkclz.sdk.service;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.sys.Organization;

public interface SysService {

    Result<Organization> orgSave(Organization organization);
}
