package com.example.module.one;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module_1")
public class Module1Controller {

    @GetMapping
    public ResponseEntity sayHello(){
        return ResponseEntity.ok("Hello from module 1");
    }
}
