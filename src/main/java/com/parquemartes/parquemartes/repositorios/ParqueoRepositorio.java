/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parquemartes.parquemartes.repositorios;
import com.parquemartes.parquemartes.entidades.Parqueadero;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author NEIDER
 */
public interface ParqueoRepositorio extends JpaRepository <Parqueadero, Integer>{
    
}
