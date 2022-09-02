
import br.edu.ifsp.pep.dao.ProdutoDAO;
import br.edu.ifsp.pep.dao.VendaDAO;
import br.ifsp.edu.pep.modelo.Itens;
import br.ifsp.edu.pep.modelo.Produto;
import br.ifsp.edu.pep.modelo.Venda;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private static VendaDAO vendaDAO = new VendaDAO();
    
    public static void main(String[] args) {
        adicionarProdutos();
        exibirProdutos();
        adicionarVenda();
    }
    
    private static void adicionarProdutos(){
        for(int i = 0; i < 10; i++){
            Produto p = new Produto("Produto" + i, i*10, new BigDecimal((i+1)*100));
            produtoDAO.inserir(p);
        }
    }
    
    private static void exibirProdutos(){
        List<Produto> produtos = produtoDAO.obterTodos();
        for(Produto produto : produtos){
            System.out.println(produto);
        }
    }
    
    private static void adicionarVenda(){
        Venda venda = new Venda();
        venda.setData(new Date());
        
        List<Produto> produtos = produtoDAO.obterTodos();
        
        Itens item = new Itens();
        item.setVenda(venda);
        item.setProduto(produtos.get(0));
        item.setPreco(produtos.get(0).getPreco());
        item.setQuantidade(10);
        
        List<Itens> itens = new ArrayList<>();
        itens.add(item);
        
        venda.setItens(itens);
        
        
        vendaDAO.inserir(venda);
    }
    
    
}
