package com.wkclz.sdk.feign;

import com.wkclz.core.base.Result;
import com.wkclz.sdk.constant.Rest;
import com.wkclz.sdk.constant.ServiceId;
import com.wkclz.sdk.domain.pay.PayOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = ServiceId.LZ_PAY)
public interface PayFeign {

    @PostMapping(Rest.PAY_ORDER_NEW)
    Result<PayOrder> payOrderNew(@RequestBody PayOrder payOrder);

    @PostMapping(Rest.ORDER_PAY_STATUS)
    Result<PayOrder> orderPayStatus(@RequestBody PayOrder payOrder);

}
