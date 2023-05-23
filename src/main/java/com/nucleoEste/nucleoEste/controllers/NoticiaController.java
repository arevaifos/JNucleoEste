package com.nucleoEste.nucleoEste.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticiaController {
    @RequestMapping("/formNoticia")
    public String form(){
        return "Noticia/formNoticia";
    }
}
