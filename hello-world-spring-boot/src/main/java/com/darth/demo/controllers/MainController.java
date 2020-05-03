package com.darth.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @PostMapping("api/twitter/webhook")
    public void webhook(@RequestParam String string) {
        System.out.println("Got something "+ string);
    }
}
