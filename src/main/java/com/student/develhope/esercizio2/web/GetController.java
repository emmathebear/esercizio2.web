package com.student.develhope.esercizio2.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")

public class GetController {
    @GetMapping(path = "/ciao/{provincia}")
    public Student Student(
            @PathVariable String provincia,
            @RequestParam String nome){
        return new Student(nome,provincia);
    }
    @GetMapping(path = "/ciao")
    public String Student(){
        return "Hello World!";
    }

}
