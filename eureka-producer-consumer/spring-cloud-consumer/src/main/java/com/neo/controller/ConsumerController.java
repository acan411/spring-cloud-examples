package com.neo.controller;

import com.neo.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private final HelloRemote HelloRemote;

    @Autowired
    public ConsumerController(com.neo.remote.HelloRemote helloRemote) {
        HelloRemote = helloRemote;
    }

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return HelloRemote.hello(name);
    }

}