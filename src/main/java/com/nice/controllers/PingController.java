package com.nice.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Evegeny on 12/07/2017.
 */
@RestController
@RequestMapping("/games")
public class PingController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "hello " + name;
    }

    @GetMapping("/ping")
    public String ping() {
        return "OK, I'm alive";
    }
}
