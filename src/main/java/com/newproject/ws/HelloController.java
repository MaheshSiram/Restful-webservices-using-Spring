package com.newproject.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mahesh on 12/12/2017.
 */
@EnableAutoConfiguration
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

  }
