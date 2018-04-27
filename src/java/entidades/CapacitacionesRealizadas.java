/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "CAPACITACIONES_REALIZADAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CapacitacionesRealizadas.findAll", query = "SELECT c FROM CapacitacionesRealizadas c")
    , @NamedQuery(name = "CapacitacionesRealizadas.findByIdCapacitacionRealizada", query = "SELECT c FROM CapacitacionesRealizadas c WHERE c.idCapacitacionRealizada = :idCapacitacionRealizada")
    , @NamedQuery(name = "CapacitacionesRealizadas.findByNombreTipo", query = "SELECT c FROM CapacitacionesRealizadas c WHERE c.nombreTipo = :nombreTipo")
    , @NamedQuery(name = "CapacitacionesRealizadas.findByDescripcion", query = "SELECT c FROM CapacitacionesRealizadas c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CapacitacionesRealizadas.findByFecha", query = "SELECT c FROM CapacitacionesRealizadas c WHERE c.fecha = :fecha")})
public class CapacitacionesRealizadas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CAPACITACION_REALIZADA")
    private BigDecimal idCapacitacionRealizada;
    @Size(max = 50)
    @Column(name = "NOMBRE_TIPO")
    private String nombreTipo;
    @Size(max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "ID_NOVEDAD_INVESTIGACION", referencedColumnName = "ID_NOVEDAD_INVESTIGACION")
    @ManyToOne(optional = false)
    private NovedadInvestigacion idNovedadInvestigacion;

    public CapacitacionesRealizadas() {
    }

    public CapacitacionesRealizadas(BigDecimal idCapacitacionRealizada) {
        this.idCapacitacionRealizada = idCapacitacionRealizada;
    }

    public BigDecimal getIdCapacitacionRealizada() {
        return idCapacitacionRealizada;
    }

    public void setIdCapacitacionRealizada(BigDecimal idCapacitacionRealizada) {
        this.idCapacitacionRealizada = idCapacitacionRealizada;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public NovedadInvestigacion getIdNovedadInvestigacion() {
        return idNovedadInvestigacion;
    }

    public void setIdNovedadInvestigacion(NovedadInvestigacion idNovedadInvestigacion) {
        this.idNovedadInvestigacion = idNovedadInvestigacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCapacitacionRealizada != null ? idCapacitacionRealizada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CapacitacionesRealizadas)) {
            return false;
        }
        CapacitacionesRealizadas other = (CapacitacionesRealizadas) object;
        if ((this.idCapacitacionRealizada == null && other.idCapacitacionRealizada != null) || (this.idCapacitacionRealizada != null && !this.idCapacitacionRealizada.equals(other.idCapacitacionRealizada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CapacitacionesRealizadas[ idCapacitacionRealizada=" + idCapacitacionRealizada + " ]";
    }
    
}
