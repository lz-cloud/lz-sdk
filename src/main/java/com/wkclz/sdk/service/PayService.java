package com.wkclz.sdk.service;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.pay.PayOrder;

import javax.servlet.http.HttpServletResponse;

public interface PayService {

    void payOrderNew(HttpServletResponse rep, PayOrder payOrder);

    Result<PayOrder> orderPayStatus(PayOrder payOrder);

}
