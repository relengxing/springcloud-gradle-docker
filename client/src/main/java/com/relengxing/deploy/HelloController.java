package com.relengxing.deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
* Author: relengxing
* Mail: relengxing@outlook.com
* Time: 2018/1/26 14:47
* Version: 1.0.0
* Description:
 */
@RestController
public class HelloController {


    @Value(value = "${app.environment}")
    private String env;

    @RequestMapping(value = "/dm",method = RequestMethod.GET)
    public String hello(){
        return "Hello client Service:" + env;
    }
}
