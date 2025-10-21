/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proys11.modelo.repositorio;

import com.example.proys11.modelo.entidades.Colaborador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LAB-USR-LNORTE
 */
@Repository
public interface IColaboradorRepositorio
                extends CrudRepository<Colaborador, Integer>{
    
}
