package com.consulconsumer.demo.feinclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="lhdprovider")
public interface HomeFeignClient {
     @GetMapping(value="/home/hello")
     String sayHifromClient();
}
