package com.example.aula2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
   
    

    @Autowired
    @Qualifier("nomeAplicacao")
   private String nome;

   @Autowired
   @Qualifier("versaoAplicacao")
   private String versao;


   @GetMapping(value="obternomeaplicacao")
    public String obterNomeAplicacao(){
        return nome;
    }


    @GetMapping(value = "obterversaoaplicacao")
    public String obterversaoaplicacao(){
        return versao;
    }
}
