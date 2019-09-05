package com.wjs.springbootdemo.controller;

import com.wjs.springbootdemo.config.jedis.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private JedisUtil jedis;

    //redis
    @RequestMapping("/restJedis/{val}")
    public Object restJedis(@PathVariable String val){
        jedis.set("key-"+val,val);
        return "restJedis_OK";
    }
}
