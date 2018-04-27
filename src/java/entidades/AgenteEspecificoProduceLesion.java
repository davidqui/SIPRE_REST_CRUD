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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "AGENTE_ESPECIFICO_PRODUCE_LESION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgenteEspecificoProduceLesion.findAll", query = "SELECT a FROM AgenteEspecificoProduceLesion a")
    , @NamedQuery(name = "AgenteEspecificoProduceLesion.findByIdAgenteProduceLesion", query = "SELECT a FROM AgenteEspecificoProduceLesion a WHERE a.idAgenteProduceLesion = :idAgenteProduceLesion")
    , @NamedQuery(name = "AgenteEspecificoProduceLesion.findByDescripcion", query = "SELECT a FROM AgenteEspecificoProduceLesion a WHERE a.descripcion = :descripcion")})
public class AgenteEspecificoProduceLesion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGENTE_PRODUCE_LESION")
    private BigDecimal idAgenteProduceLesion;
    @Size(max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAgenteProduceLesion")
    private List<NovedadInvestigacion> novedadInvestigacionList;
    @JoinColumn(name = "ID_AGENTE_PRODUCE_LESION1", referencedColumnName = "ID_AGENTE_PRODUCE_LESION")
    @ManyToOne(optional = false)
    private AgenteProduceLesion idAgenteProduceLesion1;

    public AgenteEspecificoProduceLesion() {
    }

    public AgenteEspecificoProduceLesion(BigDecimal idAgenteProduceLesion) {
        this.idAgenteProduceLesion = idAgenteProduceLesion;
    }

    public BigDecimal getIdAgenteProduceLesion() {
        return idAgenteProduceLesion;
    }

    public void setIdAgenteProduceLesion(BigDecimal idAgenteProduceLesion) {
        this.idAgenteProduceLesion = idAgenteProduceLesion;
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

    public AgenteProduceLesion getIdAgenteProduceLesion1() {
        return idAgenteProduceLesion1;
    }

    public void setIdAgenteProduceLesion1(AgenteProduceLesion idAgenteProduceLesion1) {
        this.idAgenteProduceLesion1 = idAgenteProduceLesion1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgenteProduceLesion != null ? idAgenteProduceLesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgenteEspecificoProduceLesion)) {
            return false;
        }
        AgenteEspecificoProduceLesion other = (AgenteEspecificoProduceLesion) object;
        if ((this.idAgenteProduceLesion == null && other.idAgenteProduceLesion != null) || (this.idAgenteProduceLesion != null && !this.idAgenteProduceLesion.equals(other.idAgenteProduceLesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.AgenteEspecificoProduceLesion[ idAgenteProduceLesion=" + idAgenteProduceLesion + " ]";
    }
    
}
