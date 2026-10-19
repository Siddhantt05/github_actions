package com.springBootDemo.demo.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/api/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("helllo sir");
    }
}
