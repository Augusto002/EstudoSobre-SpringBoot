package com.example.APENASESTUDANDO.EstudoSpringBoot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String HomeAPP(){
        return "index";
    }


}
