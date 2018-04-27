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
@Table(name = "CLASE_NOVEDAD_FUERZA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClaseNovedadFuerza.findAll", query = "SELECT c FROM ClaseNovedadFuerza c")
    , @NamedQuery(name = "ClaseNovedadFuerza.findByIdNovedadFuerza", query = "SELECT c FROM ClaseNovedadFuerza c WHERE c.idNovedadFuerza = :idNovedadFuerza")
    , @NamedQuery(name = "ClaseNovedadFuerza.findByDescripcion", query = "SELECT c FROM ClaseNovedadFuerza c WHERE c.descripcion = :descripcion")})
public class ClaseNovedadFuerza implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_NOVEDAD_FUERZA")
    private BigDecimal idNovedadFuerza;
    @Size(max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadFuerza")
    private List<TipoNovedadFuerza> tipoNovedadFuerzaList;

    public ClaseNovedadFuerza() {
    }

    public ClaseNovedadFuerza(BigDecimal idNovedadFuerza) {
        this.idNovedadFuerza = idNovedadFuerza;
    }

    public BigDecimal getIdNovedadFuerza() {
        return idNovedadFuerza;
    }

    public void setIdNovedadFuerza(BigDecimal idNovedadFuerza) {
        this.idNovedadFuerza = idNovedadFuerza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    @JsonIgnore
    public List<TipoNovedadFuerza> getTipoNovedadFuerzaList() {
        return tipoNovedadFuerzaList;
    }

    public void setTipoNovedadFuerzaList(List<TipoNovedadFuerza> tipoNovedadFuerzaList) {
        this.tipoNovedadFuerzaList = tipoNovedadFuerzaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNovedadFuerza != null ? idNovedadFuerza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClaseNovedadFuerza)) {
            return false;
        }
        ClaseNovedadFuerza other = (ClaseNovedadFuerza) object;
        if ((this.idNovedadFuerza == null && other.idNovedadFuerza != null) || (this.idNovedadFuerza != null && !this.idNovedadFuerza.equals(other.idNovedadFuerza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ClaseNovedadFuerza[ idNovedadFuerza=" + idNovedadFuerza + " ]";
    }
    
}
