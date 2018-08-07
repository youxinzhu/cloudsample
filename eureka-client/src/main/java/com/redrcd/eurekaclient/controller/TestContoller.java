package com.redrcd.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {
    @RequestMapping ("hello")
    public String getData(String name){
        return "Hello " +name;
    }
}
