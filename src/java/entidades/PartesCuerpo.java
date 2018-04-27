/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "PARTES_CUERPO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PartesCuerpo.findAll", query = "SELECT p FROM PartesCuerpo p")
    , @NamedQuery(name = "PartesCuerpo.findByIdParteCuerpo", query = "SELECT p FROM PartesCuerpo p WHERE p.idParteCuerpo = :idParteCuerpo")
    , @NamedQuery(name = "PartesCuerpo.findByDescripcion", query = "SELECT p FROM PartesCuerpo p WHERE p.descripcion = :descripcion")})
public class PartesCuerpo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PARTE_CUERPO")
    private BigDecimal idParteCuerpo;
    @Size(max = 20)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idParteCuerpo")
    private List<NovedadInvestigacion> novedadInvestigacionList;

    public PartesCuerpo() {
    }

    public PartesCuerpo(BigDecimal idParteCuerpo) {
        this.idParteCuerpo = idParteCuerpo;
    }

    public BigDecimal getIdParteCuerpo() {
        return idParteCuerpo;
    }

    public void setIdParteCuerpo(BigDecimal idParteCuerpo) {
        this.idParteCuerpo = idParteCuerpo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    @JsonIgnore
    public List<NovedadInvestigacion> getNovedadInvestigacionList() {
        return novedadInvestigacionList;
    }

    public void setNovedadInvestigacionList(List<NovedadInvestigacion> novedadInvestigacionList) {
        this.novedadInvestigacionList = novedadInvestigacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParteCuerpo != null ? idParteCuerpo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartesCuerpo)) {
            return false;
        }
        PartesCuerpo other = (PartesCuerpo) object;
        if ((this.idParteCuerpo == null && other.idParteCuerpo != null) || (this.idParteCuerpo != null && !this.idParteCuerpo.equals(other.idParteCuerpo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PartesCuerpo[ idParteCuerpo=" + idParteCuerpo + " ]";
    }
    
}
