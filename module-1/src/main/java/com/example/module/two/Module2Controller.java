package com.example.module.two;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module_2")
public class Module2Controller {

    @GetMapping
    public ResponseEntity sayHello(){
        return ResponseEntity.ok("Hello from module 2");
    }
}
