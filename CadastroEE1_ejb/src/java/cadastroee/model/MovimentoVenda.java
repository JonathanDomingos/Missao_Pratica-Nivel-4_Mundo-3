
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
@Table(name = "MovimentoVenda")

@NamedQueries({
    @NamedQuery(name = "MovimentoVenda.findAll", query = "SELECT mv FROM MovimentoVenda mv"),
    @NamedQuery(name = "MovimentoVenda.findById_MovimentoVenda", query = "SELECT mv FROM MovimentoVenda mv WHERE m.id_MovimentoVenda = :id_MovimentoVenda"),
    @NamedQuery(name = "MovimentoVenda.findByQuantidade", query = "SELECT mv FROM MovimentoVenda mv WHERE mv.quantidade = :quantidade"),
    @NamedQuery(name = "MovimentoVenda.findByPrecoUnitario", query = "SELECT m FROM MovimentoVenda mv WHERE mv.precoUnitario = :precoUnitario")})

public class MovimentoVenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_MovimentoVenda")
    private Integer id_MovimentoVenda;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "precoUnitario")
    private Long precoUnitario;
    @JoinColumn(name = "id_Comprador", referencedColumnName = "id_PessoaFisica")
    @ManyToOne
    private PessoaFisica id_Comprador;
    @JoinColumn(name = "id_Produto", referencedColumnName = "id_Produto")
    @ManyToOne
    private Produto id_Produto;
    @JoinColumn(name = "id_Usuario", referencedColumnName = "id_Usuario")
    @ManyToOne
    private Usuario id_Usuario;

    public MovimentoVenda() {
    }

    public MovimentoVenda(Integer id_MovimentoVenda) {
        this.id_MovimentoVenda = id_MovimentoVenda;
    }

    public Integer getId_MovimentoVenda() {
        return id_MovimentoVenda;
    }

    public void setId_MovimentoVenda(Integer id_MovimentoVenda) {
        this.id_MovimentoVenda = id_MovimentoVenda;
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

    public PessoaFisica getId_Comprador() {
        return id_Comprador;
    }

    public void setId_Comprador(PessoaFisica id_Comprador) {
        this.id_Comprador = id_Comprador;
    }

    public Produto getId_Produto() {
        return id_Produto;
    }

    public void setId_Produto(Produto id_Produto) {
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
        hash += (id_MovimentoVenda != null ? id_MovimentoVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentoVenda)) {
            return false;
        }
        return false;
    }
    
}    