package dao;


import javax.persistence.EntityManager;
import joinedModel.Pessoa;



public class PessoaDAO extends AbstractDAO<Pessoa>{

    @Override
    public void alterar(Pessoa entity) {
        super.alterar(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void inserir(Pessoa entity) {
        super.inserir(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected EntityManager getEntityManager() {
        return super.getEntityManager(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
