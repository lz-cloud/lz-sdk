package com.wkclz.sdk.service.impl;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.pay.PayOrder;
import com.wkclz.sdk.feign.PayFeign;
import com.wkclz.sdk.helper.ResponeHelper;
import com.wkclz.sdk.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayFeign payFeign;

    @Override
    public void payOrderNew(HttpServletResponse rep, PayOrder payOrder) {
        Result<PayOrder> result = payFeign.payOrderNew(payOrder);

        PayOrder data = result.getData();
        String charset = data.getCharset();
        String htmlBody = data.getHtmlBody();

        // 支付页面跳转
        ResponeHelper.printBack(rep, htmlBody, charset);
    }

    @Override
    public Result<PayOrder> orderPayStatus(PayOrder payOrder) {
        Result<PayOrder> result = payFeign.orderPayStatus(payOrder);
        return result;
    }

}
