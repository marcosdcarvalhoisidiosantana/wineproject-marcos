/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wineproject.service;

import com.wineproject.dao.VinhoDao;
import com.wineproject.domain.Vinho;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Marco
 */
@Service @Transactional (readOnly = false)
public class VinhoServiceImpl implements VinhoService {
    
    @Autowired
    private VinhoDao dao;
    
    @Override
    public void salvar(Vinho vinho) {
        dao.save(vinho);
    }

    @Override
    public void editar(Vinho vinho) {
        dao.update(vinho);
    }

    @Override
    public void excluir(Integer id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Vinho buscaPorId(Integer id) {
        return dao.findById(id);
        
    }

    @Override @Transactional(readOnly = true)
    public List<Vinho> buscarTodos() {
        return dao.findAll();
    }
    
}
