package com.wkclz.sdk.service.impl;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.pay.PayOrder;
import com.wkclz.sdk.feign.PayFeign;
import com.wkclz.sdk.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayFeign payFeign;

    @Override
    public Result<PayOrder> payOrderNew(PayOrder payOrder) {
        Result<PayOrder> result = payFeign.payOrderNew(payOrder);
        return result;
    }
}
