/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wineproject.web.controller;

import com.wineproject.domain.Vinho;
import com.wineproject.service.VinhoService;
import com.wineproject.service.VinhoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Marco
 */
@Controller
@RequestMapping("/vinhos")
public class VinhoController {
    
    @Autowired
    private VinhoService service;
    
    @GetMapping("/cadastrar")
    public String cadastrar(Vinho vinho) {
        return "vinhos/cadastrar";
    }
    
    @GetMapping("/catalogar")
    public String listar(ModelMap map) {
        map.addAttribute("vinho", service.buscarTodos());
        return "vinhos/catalogo";
    }
    
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Integer id, ModelMap model) {
        service.excluir(id);
        return listar(model);
    }
    
    @PostMapping("/salvar")
    public String salvar(Vinho vinho) {
        service.salvar(vinho);
        return "redirect:/vinhos/cadastrar";
        
        
    }
}
