package com.corp.concepts.ocp.generator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("hello")
    public String hello(@RequestParam String name) {
        StringBuilder sb = new StringBuilder("Hello ").append(name).append("!");
        return sb.toString();
    }
}
