package com.wkclz.sdk.service;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.Organization;

public interface SysService {

    Result<Organization> orgSave(Organization organization);
}
