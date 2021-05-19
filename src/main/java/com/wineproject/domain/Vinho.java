/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wineproject.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Marco
 */
@Entity
@Table(name = "VINHO")
public class Vinho extends AbstractEntity<Integer>{
            
    @Getter @Setter 
    @Column(name="nome", nullable=false, length = 60) 
    private String nome;
    @Getter @Setter
    @Column(name="preco", nullable=false)
    private float preco;
    @Getter @Setter
    @Column(name="origem", nullable=false, length = 60) 
    private String origem;
    @Getter @Setter
    @Column(name="tipo", nullable=false, length = 60)
    private String tipo;
    @Getter @Setter 
    @Column(name="uva", nullable=false, length = 60)
    private String uva;
    @Getter @Setter 
    @Column(name="peso", nullable=false)
    private float peso;
    
}