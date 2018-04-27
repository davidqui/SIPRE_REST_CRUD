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
@Table(name = "TIPO_NOVEDAD_FUERZA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoNovedadFuerza.findAll", query = "SELECT t FROM TipoNovedadFuerza t")
    , @NamedQuery(name = "TipoNovedadFuerza.findByIdTipoNovedadFuerza", query = "SELECT t FROM TipoNovedadFuerza t WHERE t.idTipoNovedadFuerza = :idTipoNovedadFuerza")
    , @NamedQuery(name = "TipoNovedadFuerza.findByDescripcion", query = "SELECT t FROM TipoNovedadFuerza t WHERE t.descripcion = :descripcion")})
public class TipoNovedadFuerza implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TIPO_NOVEDAD_FUERZA")
    private BigDecimal idTipoNovedadFuerza;
    @Size(max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoNovedadFuerza")
    private List<NovedadInvestigacion> novedadInvestigacionList;
    @JoinColumn(name = "ID_NOVEDAD_FUERZA", referencedColumnName = "ID_NOVEDAD_FUERZA")
    @ManyToOne(optional = false)
    private ClaseNovedadFuerza idNovedadFuerza;

    public TipoNovedadFuerza() {
    }

    public TipoNovedadFuerza(BigDecimal idTipoNovedadFuerza) {
        this.idTipoNovedadFuerza = idTipoNovedadFuerza;
    }

    public BigDecimal getIdTipoNovedadFuerza() {
        return idTipoNovedadFuerza;
    }

    public void setIdTipoNovedadFuerza(BigDecimal idTipoNovedadFuerza) {
        this.idTipoNovedadFuerza = idTipoNovedadFuerza;
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

    public ClaseNovedadFuerza getIdNovedadFuerza() {
        return idNovedadFuerza;
    }

    public void setIdNovedadFuerza(ClaseNovedadFuerza idNovedadFuerza) {
        this.idNovedadFuerza = idNovedadFuerza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoNovedadFuerza != null ? idTipoNovedadFuerza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoNovedadFuerza)) {
            return false;
        }
        TipoNovedadFuerza other = (TipoNovedadFuerza) object;
        if ((this.idTipoNovedadFuerza == null && other.idTipoNovedadFuerza != null) || (this.idTipoNovedadFuerza != null && !this.idTipoNovedadFuerza.equals(other.idTipoNovedadFuerza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoNovedadFuerza[ idTipoNovedadFuerza=" + idTipoNovedadFuerza + " ]";
    }
    
}
