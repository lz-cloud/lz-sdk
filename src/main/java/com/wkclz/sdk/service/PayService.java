package com.wkclz.sdk.service;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.pay.PayOrder;

public interface PayService {

    Result<PayOrder> payOrderNew(PayOrder payOrder);

    Result<PayOrder> orderPayStatus(PayOrder payOrder);



}
