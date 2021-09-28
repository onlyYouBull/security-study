package com.sun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

        @GetMapping("/")
        public  String hello(){
            return  "hello ";
        }

        @GetMapping("/do")
        public  String do_1(){
                return  "dododo";
        }
}
