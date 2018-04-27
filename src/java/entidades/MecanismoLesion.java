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
@Table(name = "MECANISMO_LESION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MecanismoLesion.findAll", query = "SELECT m FROM MecanismoLesion m")
    , @NamedQuery(name = "MecanismoLesion.findByDescripcion", query = "SELECT m FROM MecanismoLesion m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "MecanismoLesion.findByMecanismoLesionId", query = "SELECT m FROM MecanismoLesion m WHERE m.mecanismoLesionId = :mecanismoLesionId")})
public class MecanismoLesion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MECANISMO_LESION_ID")
    private BigDecimal mecanismoLesionId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mecanismoLesion")
    private List<NovedadInvestigacion> novedadInvestigacionList;

    public MecanismoLesion() {
    }

    public MecanismoLesion(BigDecimal mecanismoLesionId) {
        this.mecanismoLesionId = mecanismoLesionId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getMecanismoLesionId() {
        return mecanismoLesionId;
    }

    public void setMecanismoLesionId(BigDecimal mecanismoLesionId) {
        this.mecanismoLesionId = mecanismoLesionId;
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
        hash += (mecanismoLesionId != null ? mecanismoLesionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MecanismoLesion)) {
            return false;
        }
        MecanismoLesion other = (MecanismoLesion) object;
        if ((this.mecanismoLesionId == null && other.mecanismoLesionId != null) || (this.mecanismoLesionId != null && !this.mecanismoLesionId.equals(other.mecanismoLesionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.MecanismoLesion[ mecanismoLesionId=" + mecanismoLesionId + " ]";
    }
    
}
