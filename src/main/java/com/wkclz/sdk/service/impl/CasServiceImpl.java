package com.wkclz.sdk.service.impl;

import com.wkclz.sdk.feign.CasFeign;
import com.wkclz.sdk.service.CasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CasServiceImpl implements CasService {

    @Autowired
    private CasFeign casFeign;


}
