
package cadastroee.controller;


import cadastroee.model.Produto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Stateless
public class ProdutoFacade implements ProdutoFacadeLocal{

    @PersistenceContext(unitName = "CadastroEE-ejb")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }
    @SuppressWarnings("unchecked")
    public List<Produto> findAll() {
        criteriaCrti cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(Produto.class));
        return getEntityManager().createQuery(cq).getResultList();
    }  
}
