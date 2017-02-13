package com.newproject.ws;

import com.mangofactory.swagger.plugin.EnableSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by mahesh on 12/12/2017.
 */
@EnableAutoConfiguration
@EnableSwagger
@ComponentScan("com.newproject.ws")

public class App {


    public static void main(String[] args) {

        SpringApplication.run(App.class,args);

    }



}
