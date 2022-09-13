package br.edu.ifsp.pep.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import br.edu.ifsp.pep.model.Pessoa;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author aluno
 */
public class PessoaDAO extends AbstractDAO<Pessoa>{

    public Pessoa buscarPorId(long id){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorId", Pessoa.class);
        query.setParameter("id", id);
        
        return query.getSingleResult();
    }
    
    public List<Pessoa> buscarPorNome(String nome){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorNome", Pessoa.class);
        query.setParameter("nome", "%" + nome + "%");
        
        return query.getResultList();
    }
    
    public List<Pessoa> buscarPorSalario(BigDecimal salario){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorSalario", Pessoa.class);
        query.setParameter("salario", salario);
        
        return query.getResultList();
        
        
    }
    
    public void remover(Pessoa p){
        EntityManager em = getEntityManager();
        
        em.getTransaction().begin();
        System.out.println("Está no estado gerenciado? " + em.contains(p));
        
        em.remove(em.merge(p));
        
        em.getTransaction().commit();
        em.close();
        
    }
    
    public void verificarEstadoDoCicloDeVida(){
        Pessoa p = new Pessoa("Ana", new Date(), new BigDecimal(5000));
        
        EntityManager em = getEntityManager();
        
        // Verifica se o objeto p esta no estado gerenciado (managed)
        System.out.println("Está no estado gerenciado? " + em.contains(p));
        
        //Executa o método persist do entity manager
        //O objeto deve ir para o estado gerenciado
        em.persist(p);
        
        //Verifica se o objeto p está no estado gerenciado (managed)
        System.out.println("Está no estado gerenciado? " + em.contains(p));
        
        //Remove o objeto p do estado gerenciado
        em.detach(p);
        
        //Verifica se o objeto p está no estado gerenciado (managed)        
        System.out.println("Está no estado gerenciado? " + em.contains(p));

        
    }
}
