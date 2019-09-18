package com.wkclz.sdk.helper;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.domain.pay.PayOrder;
import com.wkclz.sdk.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

@Component
public class PayHelper {

    @Autowired
    private PayService payService;

    /**
     * 支持多种支付后再做参数化处理
     * @param rep
     * @param payOrder
     */
    public void pay(HttpServletResponse rep, PayOrder payOrder) {

        // 发起支付请求，拿到支付页面
        Result<PayOrder> payOrderResult = payService.payOrderNew(payOrder);
        PayOrder data = payOrderResult.getData();
        String charset = data.getCharset();
        String htmlBody = data.getHtmlBody();

        // 支付页面跳转
        ResponeHelper.printBack(rep, htmlBody, charset);
    }

}
