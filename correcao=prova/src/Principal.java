
import br.edu.ifsp.pep.dao.ClienteDAO;
import br.edu.ifsp.pep.dao.LocacaoDAO;
import br.edu.ifsp.pep.dao.TipoVeiculoDAO;
import br.edu.ifsp.pep.dao.VeiculoDAO;
import br.edu.ifsp.pep.model.Cliente;
import br.edu.ifsp.pep.model.Locacao;
import br.edu.ifsp.pep.model.TipoVeiculo;
import br.edu.ifsp.pep.model.Veiculo;
import br.edu.ifsp.pep.model.VeiculoLocado;
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
    
    private static VeiculoDAO veiculoDAO = new VeiculoDAO();
    private static TipoVeiculoDAO tipoVeiculoDAO = new TipoVeiculoDAO();
    private static ClienteDAO clienteDAO = new ClienteDAO();
    private static LocacaoDAO locacaoDAO = new LocacaoDAO();
    
    public static void main(String[] args) {
        adicionarVeiculos();
        adicionarClientes();
    }
    
    private static void adicionarClientes(){
        for (int i = 0; i < 10; i++) {
            try{
                clienteDAO.inserir(new Cliente("Cliente" + i));
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
    
    private static void locarVeiculo(){
        //Localizar cliente
        Cliente cliente = clienteDAO.findById(1);
        //Localizar os veículos
        List<Veiculo> veiculos = veiculoDAO.buscarTodos();
        
        //Criar um objeto do tipo locação
        Locacao locacao = new Locacao(new Date(), cliente);
        List<VeiculoLocado> veiculosLocado = new ArrayList<>();
        VeiculoLocado veiculoLocado = new VeiculoLocado(veiculos.get(0), locacao, 5);
        
        veiculosLocado.add(veiculoLocado);
        
        VeiculoLocado veiculoLocado2 = new VeiculoLocado(veiculos.get(1), locacao, 5);
        
        try{
            //Persistir o objeto locacao
            locacaoDAO.inserir(locacao);
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    private static void adicionarVeiculos(){
        TipoVeiculo tipoCarro = new TipoVeiculo("Carro", new BigDecimal(100));
        TipoVeiculo tipoMoto = new TipoVeiculo("Moto", new BigDecimal(80));
        TipoVeiculo tipoVan = new TipoVeiculo("Van", new BigDecimal(250));
        
        try{
            tipoVeiculoDAO.inserir(tipoCarro);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            tipoVeiculoDAO.inserir(tipoMoto);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
           
        try{
            tipoVeiculoDAO.inserir(tipoVan);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        Veiculo veiculo1 = new Veiculo("ABC-1234", "P. Epitácio", "Gol 1.0", 2017, tipoCarro, false);
        Veiculo veiculo2 = new Veiculo("ABC-4565", "P. Epitácio", "Corolla", 2019, tipoCarro, false);
                
        try{
            veiculoDAO.inserir(veiculo1);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            veiculoDAO.inserir(veiculo2);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        Veiculo veiculo3 = new Veiculo("ABC-0000", "P. Epitácio", "CB 600", 2014, tipoMoto, false);
        Veiculo veiculo4 = new Veiculo("ABC-0501", "P. Epitácio", "XRE 300", 2018, tipoMoto, false);
        
        try{
            veiculoDAO.inserir(veiculo3);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            veiculoDAO.inserir(veiculo4);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        Veiculo veiculo5 = new Veiculo("ABC-0456", "P. Epitácio", "Sprinter", 2014, tipoVan, false);
        Veiculo veiculo6 = new Veiculo("ABC-0681", "P. Epitácio", "Alphard", 2018, tipoVan, false);
        
        try{
            veiculoDAO.inserir(veiculo5);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            veiculoDAO.inserir(veiculo6);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
}


