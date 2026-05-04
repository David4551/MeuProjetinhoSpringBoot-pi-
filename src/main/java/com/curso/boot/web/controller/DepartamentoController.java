package com.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "departamento/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "departamento/lista";
    }
}