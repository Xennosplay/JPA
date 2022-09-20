/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Veiculo;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;

/**
 *
 * @author aluno
 */
public class VeiculoDAO extends AbstractDAO<Veiculo>{
    
    public List<Veiculo> buscarTodos(){
        return getEntityManager()
                .createNamedQuery("Veiculo.buscarTodos", Veiculo.class)
                .getResultList();
    }
    
    public Veiculo buscarPorCidadeEPlaca(String cidade, String placa){
        return getEntityManager()
                .createNamedQuery("Veiculo.buscarPorPlacaECidade", Veiculo.class)
                .getSingleResult();
    }
    
//    public void inserir(Veiculo veiculo){
//        EntityManager em - getEntityManager();
//        em.getTransaction().begin();
//    }
}
