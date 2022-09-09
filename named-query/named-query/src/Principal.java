
import br.edu.ifsp.pep.dao.PessoaDAO;
import br.edu.ifsp.pep.model.Pessoa;
import java.math.BigDecimal;
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
    
    public static void main(String[] args) {
        PessoaDAO pessoaDAO = new PessoaDAO();
        for(int i = 0; i < 10;){
            Pessoa p = new Pessoa("Pessoa" + i, new Date(2000+i, i, i), new BigDecimal(1000 * ++i));
            pessoaDAO.inserir(p);
                    
        }
        
        //Testar a consulta
        System.out.println("Buscar por ID:");
        Pessoa pessoaRetornada = pessoaDAO.buscarPorId(5);
        
        //criar o metodo toString na classe Pessoa
        System.out.println(pessoaRetornada);
        
        System.out.println("Buscar por nome");
        List<Pessoa> pessoaNome = pessoaDAO.buscarPorNome("Pessoa7");
        
        System.out.println(pessoaNome);
        
        System.out.println("Buscar por salário:");
        List<Pessoa> pessoaSalario = pessoaDAO.buscarPorSalario(new BigDecimal(7000.00));
        
        System.out.println(pessoaSalario);
        
    }
}
