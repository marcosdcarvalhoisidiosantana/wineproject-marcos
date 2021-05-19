/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wineproject.dao;

import com.wineproject.domain.Vinho;
import java.util.List;

/**
 *
 * @author Marco
 */
public interface VinhoDao {
    
    void save(Vinho vinho);
 
    void update(Vinho vinho);
 
    void delete(Integer id);
 
    Vinho findById(Integer id);
 
    List<Vinho> findAll();
}
