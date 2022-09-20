
import br.edu.ifsp.pep.dao.TipoVeiculoDAO;
import br.edu.ifsp.pep.dao.VeiculoDAO;
import br.edu.ifsp.pep.model.TipoVeiculo;
import br.edu.ifsp.pep.model.Veiculo;
import java.math.BigDecimal;

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
    
    public static void main(String[] args) {
        adicionarVeiculos();
    }
    
    private static void adicionarVeiculos(){
        TipoVeiculo tipoCarro = new TipoVeiculo("Carro", new BigDecimal(100));
        TipoVeiculo tipoMoto = new TipoVeiculo("Moto", new BigDecimal(80));
        TipoVeiculo tipoVan = new TipoVeiculo("Van", new BigDecimal(250));
        
        tipoVeiculoDAO.inserir(tipoCarro);
        tipoVeiculoDAO.inserir(tipoMoto);
        tipoVeiculoDAO.inserir(tipoVan);
        
        Veiculo veiculo1 = new Veiculo("ABC-1234", "P. Epitácio", "Gol 1.0", 2017, tipoCarro);
        Veiculo veiculo2 = new Veiculo("ABC-4565", "P. Epitácio", "Corolla", 2019, tipoCarro);
        
        veiculoDAO.inserir(veiculo1);
        veiculoDAO.inserir(veiculo2);
        
        Veiculo veiculo3 = new Veiculo("ABC-0000", "P. Epitácio", "CB 600", 2014, tipoMoto);
        Veiculo veiculo4 = new Veiculo("ABC-0501", "P. Epitácio", "XRE 300", 2018, tipoMoto);
        
        veiculoDAO.inserir(veiculo3);
        veiculoDAO.inserir(veiculo4);
        
        Veiculo veiculo5 = new Veiculo("ABC-0456", "P. Epitácio", "Sprinter", 2014, tipoVan);
        Veiculo veiculo6 = new Veiculo("ABC-0681", "P. Epitácio", "Alphard", 2018, tipoVan);
        
        veiculoDAO.inserir(veiculo5);
        veiculoDAO.inserir(veiculo6);
    }
    
}
