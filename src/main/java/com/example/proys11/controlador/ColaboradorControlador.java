/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proys11.controlador;

import com.example.proys11.modelo.entidades.Colaborador;
import com.example.proys11.servicios.ColaboradorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LAB-USR-LNORTE
 */
@Controller
@RequestMapping
public class ColaboradorControlador {
    
    @Autowired
    private ColaboradorService service;
    
    @GetMapping("/lista")
    public String listar (Model model){
        List<Colaborador> lista = service.getList();
        model.addAttribute("listaColaborador", lista);
        return "index"; 
    }
    
    @GetMapping("/nuevo")
    public String nuevo (Model model){
        model.addAttribute("colaborador", new Colaborador());
        return "formColaborador";
    }

    @PostMapping("/registrar")
    public String grabar(Colaborador c, Model model){
        System.out.println("🔹 Entró al método grabar");
        try {
            service.save(c);
            model.addAttribute("mensaje","Grabado correctamente");
        } catch (Exception e) {
            e.printStackTrace(); // 👈 para ver el error exacto
            model.addAttribute("mensajeError","Error al grabar: " + e.getMessage());
        }
        return "formColaborador";
    }

    
    
}
