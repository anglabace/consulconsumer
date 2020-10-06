package com.consulconsumer.demo.service;

import com.consulconsumer.demo.feinclient.HomeFeignClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HiService {

    @Resource
    HomeFeignClient homeFeignClient;

    public String sayHi(String name){
        return  homeFeignClient.sayHifromClient();
    }
}
