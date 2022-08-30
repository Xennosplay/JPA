
import br.edu.ifsp.pep.dao.ProdutoDAO;
import br.ifsp.edu.pep.modelo.Produto;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Principal {
    
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public static void main(String[] args) {
        adicionarProdutos();
    }
    
    private static void adicionarProdutos(){
        for(int i = 0; i < 10; i++){
            Produto p = new Produto("Produto" + i, i*10, new BigDecimal((i+1)*100));
            produtoDAO.inserir(p);
        }
    }
            
}
