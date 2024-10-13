package com.fivebeans.commons.feign;

import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("order-service")
public interface OrderFeignClient {


}
