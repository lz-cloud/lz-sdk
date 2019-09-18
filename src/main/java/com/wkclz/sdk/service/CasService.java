package com.wkclz.sdk.service;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.cas.UserAdmin;

public interface CasService {

    Result<UserAdmin> userAdminAdd(UserAdmin userAdmin);

    Result<UserAdmin> userAdminRemove(UserAdmin userAdmin);

}
