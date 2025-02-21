package com.br.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String helloWorld(){
        return "Olá Mundo!";
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable String name){
        return "Hello " + name + ", nice to meet you!";
    }
}
