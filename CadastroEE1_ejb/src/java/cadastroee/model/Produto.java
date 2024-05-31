
package cadastroee.model;



import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Produto")
@NamedQueries({

    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByIdProduto", query = "SELECT p FROM Produto p WHERE p.id_Produto = :id_Produto"),
    @NamedQuery(name = "Produto.findByNome", query = "SELECT p FROM Produto p WHERE p.nome = :nome"),
    @NamedQuery(name = "Produto.findByQuantidade", query = "SELECT p FROM Produto p WHERE p.quantidade = :quantidade"),
    @NamedQuery(name = "Produto.findByPrecoVenda", query = "SELECT p FROM Produto p WHERE p.precoVenda = :precoVenda")})

public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_Produto")
    private Integer id_Produto;
    @Column(name = "nome")
    private String nome;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "precoVenda")
    private Float precoVenda;
    @OneToMany(mappedBy = "id_Produto")
    private Collection<MovimentoVenda> movimentoVendaCollection;


    public Produto() {
    }

    public Produto(Integer id_Produto) {
        this.id_Produto = id_Produto;
    }

    public Integer getId_Produto() {
        return id_Produto;
    }

    public void setId_Produto(Integer id_Produto) {
        this.id_Produto = id_Produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Collection<MovimentoVenda> getMovimentoVendaCollection() {
        return movimentoVendaCollection;
    }

    public void setMovimentoVendaCollection(Collection<MovimentoVenda> movimentoVendaCollection) {
        this.movimentoVendaCollection = movimentoVendaCollection;
    }

    public Collection<MovimentoCompra> getMovimentoCompraCollection(Collection<MovimentoCompra> movimentoCompraCollection) {
        return movimentoCompraCollection;
    }

    public void setMovimentoCompraCollection(Collection<MovimentoCompra> movimentoCompraCollection) {
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_Produto != null ? id_Produto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        return !((this.id_Produto == null && other.id_Produto != null) || (this.id_Produto != null && !this.id_Produto.equals(other.id_Produto)));
    }

    @Override
    public String toString() {
        return "cadastroee.model.Produto[ id_Produto=" + id_Produto + " ]";
    }
    
}