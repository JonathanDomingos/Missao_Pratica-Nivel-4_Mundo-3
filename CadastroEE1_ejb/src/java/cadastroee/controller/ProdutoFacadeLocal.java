
package cadastroee.controller;



import java.util.List;
import cadastroee.model.Produto;
import javax.ejb.Local;

@Local
public interface ProdutoFacadeLocal {
    List<Produto> findAll();  
}
