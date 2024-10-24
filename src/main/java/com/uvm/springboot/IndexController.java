package com.uvm.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {

    @GetMapping({"/index", "/", "/home", "/helloWorld"})
    public String index(Model model) {
        model.addAttribute("titulo", "Hola Mundo!");
        model.addAttribute("titulo2", "Desarrollo de aplicaciones empresariales con Springboot");
        model.addAttribute("titulo3", "Anuar Avalos Orozco Grupo E2");

        return "index";
    }


}
