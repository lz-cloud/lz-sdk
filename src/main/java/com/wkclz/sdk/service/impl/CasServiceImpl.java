package com.wkclz.sdk.service.impl;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.cas.UserAdmin;
import com.wkclz.sdk.feign.CasFeign;
import com.wkclz.sdk.service.CasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CasServiceImpl implements CasService {

    @Autowired
    private CasFeign casFeign;


    @Override
    public Result<UserAdmin> userAdminAdd(UserAdmin userAdmin) {
        Result<UserAdmin> result = casFeign.userAdminAdd(userAdmin);
        return result;
    }

    @Override
    public Result<UserAdmin> userAdminRemove(UserAdmin userAdmin) {
        Result<UserAdmin> result = casFeign.userAdminRemove(userAdmin);
        return result;
    }

}
