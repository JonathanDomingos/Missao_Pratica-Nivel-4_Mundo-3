

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
@Table(name = "PessoaJuridica")
@NamedQueries({
    @NamedQuery(name = "PessoaJuridica.findAll", query = "SELECT p FROM PessoaJuridica p"),
    @NamedQuery(name = "PessoaJuridica.findById_PessoaJuridica", query = "SELECT p FROM PessoaJuridica p WHERE p.id_PessoaJuridica = :id_PessoaJuridica"),
    @NamedQuery(name = "PessoaJuridica.findByCnpj", query = "SELECT p FROM PessoaJuridica p WHERE p.cnpj = :cnpj")})
public class PessoaJuridica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_PessoaJuridica")
    private Integer id_PessoaJuridica;
    @Column(name = "cnpj")
    private String cnpj;
    @OneToMany(mappedBy = "id_Fornecedor")
    private Collection<MovimentoCompra> movimentoCompraCollection;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Integer id_PessoaJuridica) {
        this.id_PessoaJuridica = id_PessoaJuridica;
    }

    public Integer getId_PessoaJuridica(Integer id_PessoaJuridica) {
        return id_PessoaJuridica;
    }

    public void setId_PessoaJuridica(Integer id_PessoaJuridica) {
        this.id_PessoaJuridica = id_PessoaJuridica;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Collection<MovimentoCompra> getMovimentoCompraCollection() {
        return movimentoCompraCollection;
    }

    public void setMovimentoCompraCollection(Collection<MovimentoCompra> movimentoCompraCollection) {
        this.movimentoCompraCollection = movimentoCompraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_PessoaJuridica != null ? id_PessoaJuridica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaJuridica)) {
            return false;
        } else {
        }
        PessoaJuridica other = (PessoaJuridica) object;
        return !((this.id_PessoaJuridica == null && other.id_PessoaJuridica != null) || (this.id_PessoaJuridica != null && !this.id_PessoaJuridica.equals(other.id_PessoaJuridica)));
    }

    @Override
    public String toString() {
        return "cadastroee.model.PessoaJuridica[ id_PessoaJuridica=" + id_PessoaJuridica + " ]";
    }
    
}
