
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
@Table(name = "Usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findById_Usuario", query = "SELECT u FROM Usuario u WHERE u.id_Usuario = :id_Usuario"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha")})

public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_")
    private Integer id_Usuario;
    @Column(name = "nome")
    private String nome;
    @Column(name = "senha")
    private String senha;
    @OneToMany(mappedBy = "id_Usuario")
    private Collection<MovimentoVenda> movimentoVendaCollection;
    @OneToMany(mappedBy = "id_Usuario")
    private Collection<MovimentoCompra> movimentoCompraCollection;

    public Usuario() {
    }

    public Usuario(Integer id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public Integer getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Integer id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Collection<MovimentoVenda> getMovimentoVendaCollection() {
        return movimentoVendaCollection;
    }

    public void setMovimentoVendaCollection(Collection<MovimentoVenda> movimentoVendaCollection) {
        this.movimentoVendaCollection = movimentoVendaCollection;
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
        hash += (id_Usuario != null ? id_Usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        return !((this.id_Usuario == null && other.id_Usuario != null) || (this.id_Usuario != null && !this.id_Usuario.equals(other.id_Usuario)));
    }

    @Override
    public String toString() {
        return "cadastroee.model.Usuario[ id_Usuario=" + id_Usuario + " ]";
    }

}