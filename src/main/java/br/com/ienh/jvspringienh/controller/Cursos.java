package br.com.ienh.jvspringienh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Cursos {
    @GetMapping("/cursos")
    public String cursos(){
        return "cursos";
    }
    @GetMapping("/cursos/ads")
    public String ads(){
        return "cursos/ads";
    }
    @GetMapping("/cursos/psicologia")
    public String psico(){
        return "cursos/psico";
    }
}
