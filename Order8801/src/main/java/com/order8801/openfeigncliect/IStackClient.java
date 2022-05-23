package com.order8801.openfeigncliect;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

//@Component
@FeignClient(value = "stack")
public interface IStackClient {

    /**
     * 减库存
     * @return
     */
    @GetMapping("/update")
    String update();

}
