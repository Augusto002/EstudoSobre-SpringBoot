package com.example.APENASESTUDANDO.EstudoSpringBoot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //É uma anotação para que o compilador entenda que a classe é um Controller;
public class HomeController {

    @RequestMapping("/")  //indica o caminho do endereço onde está a ser executado a aplicação //Ponto de entrada da aplicação
    public String HomeAPP(Model model){   //Esse metodo vai chamar a classe html= index;
        model.addAttribute("mensagem","OI Testando"); // Para enviar alguma valor usa o Model para a classe index


        return "index";
    }


}
