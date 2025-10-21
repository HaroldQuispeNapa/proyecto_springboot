/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proys11.servicios;

import com.example.proys11.modelo.entidades.Colaborador;
import com.example.proys11.modelo.repositorio.IColaboradorRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LAB-USR-LNORTE
 */
@Service
public class ColaboradorService {
    
    @Autowired
    private IColaboradorRepositorio daoColaborador;
    
    public List<Colaborador> getList(){
        return (List<Colaborador>) daoColaborador.findAll();
    }
    
    public Optional<Colaborador> get (int id){
        return daoColaborador.findById(id);
    }
}
