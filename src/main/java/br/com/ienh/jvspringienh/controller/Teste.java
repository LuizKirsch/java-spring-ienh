package br.com.ienh.jvspringienh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Teste {
    @GetMapping("/teste")
    public String teste(@RequestParam(name="idade", defaultValue="10") int idade, Model model){
        model.addAttribute("time", "Grêmio");
        model.addAttribute("idade", idade);
        return "teste";
    }
}
