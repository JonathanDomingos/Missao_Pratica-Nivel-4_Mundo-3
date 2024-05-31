
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
@Table(name = "PessoaFisica")
@NamedQueries({
    @NamedQuery(name = "PessoaFisica.findAll", query = "SELECT pf FROM Pessoa_Fisica pf"),
    @NamedQuery(name = "PessoaFisica.findByIdPessoaFisica", query = "SELECT pf FROM PessoaFisica pf WHERE pf.id_PessoaFisica = :id_PessoaFisica"),
    @NamedQuery(name = "PessoaFisica.findByCpf", query = "SELECT p FROM PessoaFisica p WHERE p.cpf = :cpf")})
public class PessoaFisica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_PessoaFisica")
    private Integer id_PessoaFisica;
    @Column(name = "cpf")
    private String cpf;
    @OneToMany(mappedBy = "id_Comprador")
    private Collection<MovimentoVenda> movimentoVendaCollection;

    public PessoaFisica() {
    }

    public PessoaFisica(Integer id_PessoaFisica) {
        this.id_PessoaFisica = id_PessoaFisica;
    }

    public Integer getId_PessoaFisica() {
        return id_PessoaFisica;
    }

    public void setId_PessoaFisica(Integer id_PessoaFisica) {
        this.id_PessoaFisica = id_PessoaFisica;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Collection<MovimentoVenda> getMovimentoVendaCollection() {
        return movimentoVendaCollection;
    }

    public void setMovimentoVendaCollection(Collection<MovimentoVenda> movimentoVendaCollection) {
        this.movimentoVendaCollection = movimentoVendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_PessoaFisica != null ? id_PessoaFisica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaFisica)) {
            return false;
        }
        PessoaFisica other = (PessoaFisica) object;
        return !((this.id_PessoaFisica == null && other.id_PessoaFisica != null) || (this.id_PessoaFisica != null && !this.id_PessoaFisica.equals(other.id_PessoaFisica)));
    }

    @Override
    public String toString() {
        return "cadastroee.model.PessoaFisica[ id_PessoaFisica=" + id_PessoaFisica + " ]";
    }
    
}

