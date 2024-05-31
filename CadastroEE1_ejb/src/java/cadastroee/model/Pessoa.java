
package cadastroee.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "Pessoa")
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT pes FROM Pessoa pes"),
    @NamedQuery(name = "Pessoa.findByIdPessoa", query = "SELECT pes FROM Pessoa pes WHERE pes.id_Pessoa = :id_Pessoa"),
    @NamedQuery(name = "Pessoa.findByNome", query = "SELECT pes FROM Pessoa pes WHERE pes.nome = :nome"),
    @NamedQuery(name = "Pessoa.findByLogradouro", query = "SELECT pes FROM Pessoa pes WHERE pes.logradouro = :logradouro"),
    @NamedQuery(name = "Pessoa.findByCidade", query = "SELECT pes FROM Pessoa pes WHERE pes.cidade = :cidade"),
    @NamedQuery(name = "Pessoa.findByEstado", query = "SELECT pes FROM Pessoa pes WHERE pes.estado = :estado"),
    @NamedQuery(name = "Pessoa.findByTelefone", query = "SELECT pes FROM Pessoa pes WHERE pes.telefone = :telefone"),
    @NamedQuery(name = "Pessoa.findByEmail", query = "SELECT pes FROM Pessoa pes WHERE pes.email = :email"),
    @NamedQuery(name = "Pessoa.findByTpPessoa", query = "SELECT pes FROM Pessoa pes WHERE pes.tpPessoa = :tpPessoa")})

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Pessoa")
    private Integer id_Pessoa;
    @Column(name = "nome")
    private String nome;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "email")
    private String email;
    @Column(name = "tpPessoa")
    private String tpPessoa;

    public Pessoa() {
    }

    public Pessoa(Integer id_Pessoa) {
        this.id_Pessoa = id_Pessoa;
    }

    public Integer getId_Pessoa() {
        return id_Pessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.id_Pessoa = id_Pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTpPessoa() {
        return tpPessoa;
    }

    public void setTpPessoa(String tpPessoa) {
        this.tpPessoa = tpPessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_Pessoa != null ? id_Pessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        return !((this.id_Pessoa == null && other.id_Pessoa != null) || (this.id_Pessoa != null && !this.id_Pessoa.equals(other.id_Pessoa)));
    }

    @Override
    public String toString() {
        return "cadastroee.model.Pessoa[ id_Pessoa=" + id_Pessoa + " ]";
    }
    
}

