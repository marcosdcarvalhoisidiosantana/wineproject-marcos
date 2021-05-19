/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wineproject.service;
import com.wineproject.domain.Vinho;
import java.util.List;
/**
 *
 * @author Marco
 */
public interface VinhoService {
    
    void salvar(Vinho vinho);
    
    void editar(Vinho vinho);
    
    void excluir(Integer id);
    
    Vinho buscaPorId(Integer id);
    
    List<Vinho> buscarTodos();
}
