package com.wkclz.sdk.feign;

import com.wkclz.sdk.constant.ServiceId;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = ServiceId.LZ_SYS)
public interface SysFeign {
}
