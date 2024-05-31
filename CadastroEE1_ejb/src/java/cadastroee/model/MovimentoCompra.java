
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;




@Entity
@Table(name = "MovimentoCompra")

@NamedQueries({
    @NamedQuery(name = "MovimentoCompra.findAll", query = "SELECT mc FROM MovimentoCompra mc"),
    @NamedQuery(name = "MovimentoCompra.findById_MovimentoCompra", query = "SELECT mc FROM MovimentoCompra mc WHERE mc.id_MovimentoCompra = :id_MovimentoCompra"),
    @NamedQuery(name = "MovimentoCompra.findByQuantidade", query = "SELECT mc FROM MovimentoCompra mc WHERE mc.quantidade = :quantidade"),
    @NamedQuery(name = "MovimentoCompra.findByPrecoUnitario", query = "SELECT mc FROM MovimentoCompra mc WHERE mc.precoUnitario = :precoUnitario")})

public class MovimentoCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_MovimentoCompra")
    private Integer id_MovimentoCompra;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "precoUnitario")
    private Long precoUnitario;
    @JoinColumn(name = "id_Fornecedor", referencedColumnName = "id_PessoaJuridica")
    @ManyToOne
    private PessoaJuridica id_Fornecedor;
    @JoinColumn(name = "id_Produto", referencedColumnName = "id_Produto")
    @ManyToOne
    private Produto id_Produto;
    @JoinColumn(name = "id_Usuario", referencedColumnName = "id_Usuario")
    @ManyToOne
    private Usuario id_Usuario;

    public MovimentoCompra() {
    }

    public MovimentoCompra(Integer id_MovimentoCompra) {
        this.id_MovimentoCompra = id_MovimentoCompra;
    }

    public Integer getId_MovimentoCompra() {
        return id_MovimentoCompra;
    }

    public void setIdMovimentoCompra(Integer id_MovimentoCompra) {
        this.id_MovimentoCompra = id_MovimentoCompra;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Long getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Long precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public PessoaJuridica getId_Fornecedor() {
        return id_Fornecedor;
    }

    public void setIdFornecedor(PessoaJuridica id_Fornecedor) {
        this.id_Fornecedor = id_Fornecedor;
    }

    public Produto getId_Produto() {
        return id_Produto;
    }

    public void setIdProduto(Produto id_Produto) {
        this.id_Produto = id_Produto;
    }

    public Usuario getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Usuario id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_MovimentoCompra != null ? id_MovimentoCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentoCompra)) {
            return false;
        }
        MovimentoCompra other = (MovimentoCompra) object;
        return !((this.id_MovimentoCompra == null && other.id_MovimentoCompra != null) || (this.id_MovimentoCompra != null && !this.id_MovimentoCompra.equals(other.id_MovimentoCompra)));
    }

    public String toString(String id_MovimentoCompra) {
        return "cadastroee.model.MovimentoCompra[ idMovimentoCompra=" + id_MovimentoCompra + " ]";
    }
    
}

