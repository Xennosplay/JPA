/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Locacao;
import br.edu.ifsp.pep.model.Veiculo;
import br.edu.ifsp.pep.model.VeiculoLocado;
import javax.persistence.EntityManager;

/**
 *
 * @author aluno
 */
public class LocacaoDAO extends AbstractDAO<Locacao>{
    
    @Override
    public void inserir(Locacao locacao){
        EntityManager em = getEntityManager();
        
        em.getTransaction().begin();
        
//        for (VeiculoLocado veiculosLocado : locacao.getVeiculosLocado()) {
//            Veiculo veiculo = veiculosLocado.getVeiculo();
//            veiculo.setLocado(true);
//        }
        
        em.getTransaction().commit();
    }
    
}
