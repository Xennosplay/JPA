/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteDAO extends AbstractDAO<Cliente>{
    
    public Cliente findById(long id){
        return getEntityManager().find(Cliente.class, id);
    }
    
}
