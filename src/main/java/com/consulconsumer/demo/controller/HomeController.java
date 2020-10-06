package com.consulconsumer.demo.controller;

import com.consulconsumer.demo.service.HiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Resource
    HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam( defaultValue = "forezp",required = false)String name){
        return hiService.sayHi(name);
    }
}
