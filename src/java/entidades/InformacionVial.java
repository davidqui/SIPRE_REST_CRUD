/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "INFORMACION_VIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InformacionVial.findAll", query = "SELECT i FROM InformacionVial i")
    , @NamedQuery(name = "InformacionVial.findByIdInformacionVial", query = "SELECT i FROM InformacionVial i WHERE i.idInformacionVial = :idInformacionVial")
    , @NamedQuery(name = "InformacionVial.findByDescripcion", query = "SELECT i FROM InformacionVial i WHERE i.descripcion = :descripcion")
    , @NamedQuery(name = "InformacionVial.findByTiempoIncapacidadDias", query = "SELECT i FROM InformacionVial i WHERE i.tiempoIncapacidadDias = :tiempoIncapacidadDias")
    , @NamedQuery(name = "InformacionVial.findByNumeroMuertos", query = "SELECT i FROM InformacionVial i WHERE i.numeroMuertos = :numeroMuertos")
    , @NamedQuery(name = "InformacionVial.findByNumeroLesionadosVivos", query = "SELECT i FROM InformacionVial i WHERE i.numeroLesionadosVivos = :numeroLesionadosVivos")
    , @NamedQuery(name = "InformacionVial.findByAfectacionProcesoOperacion", query = "SELECT i FROM InformacionVial i WHERE i.afectacionProcesoOperacion = :afectacionProcesoOperacion")})
public class InformacionVial implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INFORMACION_VIAL")
    private BigDecimal idInformacionVial;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "TIEMPO_INCAPACIDAD_DIAS")
    private BigInteger tiempoIncapacidadDias;
    @Column(name = "NUMERO_MUERTOS")
    private BigInteger numeroMuertos;
    @Column(name = "NUMERO_LESIONADOS_VIVOS")
    private BigInteger numeroLesionadosVivos;
    @Size(max = 100)
    @Column(name = "AFECTACION_PROCESO_OPERACION")
    private String afectacionProcesoOperacion;
    @JoinColumn(name = "ID_NOVEDAD_INVESTIGACION", referencedColumnName = "ID_NOVEDAD_INVESTIGACION")
    @ManyToOne(optional = false)
    private NovedadInvestigacion idNovedadInvestigacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInformacionVial")
    private List<RegistroMultimedia> registroMultimediaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInformacionVial")
    private List<Vehiculo> vehiculoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInformacionVial")
    private List<Entrevistados> entrevistadosList;

    public InformacionVial() {
    }

    public InformacionVial(BigDecimal idInformacionVial) {
        this.idInformacionVial = idInformacionVial;
    }

    public BigDecimal getIdInformacionVial() {
        return idInformacionVial;
    }

    public void setIdInformacionVial(BigDecimal idInformacionVial) {
        this.idInformacionVial = idInformacionVial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigInteger getTiempoIncapacidadDias() {
        return tiempoIncapacidadDias;
    }

    public void setTiempoIncapacidadDias(BigInteger tiempoIncapacidadDias) {
        this.tiempoIncapacidadDias = tiempoIncapacidadDias;
    }

    public BigInteger getNumeroMuertos() {
        return numeroMuertos;
    }

    public void setNumeroMuertos(BigInteger numeroMuertos) {
        this.numeroMuertos = numeroMuertos;
    }

    public BigInteger getNumeroLesionadosVivos() {
        return numeroLesionadosVivos;
    }

    public void setNumeroLesionadosVivos(BigInteger numeroLesionadosVivos) {
        this.numeroLesionadosVivos = numeroLesionadosVivos;
    }

    public String getAfectacionProcesoOperacion() {
        return afectacionProcesoOperacion;
    }

    public void setAfectacionProcesoOperacion(String afectacionProcesoOperacion) {
        this.afectacionProcesoOperacion = afectacionProcesoOperacion;
    }

    public NovedadInvestigacion getIdNovedadInvestigacion() {
        return idNovedadInvestigacion;
    }

    public void setIdNovedadInvestigacion(NovedadInvestigacion idNovedadInvestigacion) {
        this.idNovedadInvestigacion = idNovedadInvestigacion;
    }

    @XmlTransient
    @JsonIgnore
    public List<RegistroMultimedia> getRegistroMultimediaList() {
        return registroMultimediaList;
    }

    public void setRegistroMultimediaList(List<RegistroMultimedia> registroMultimediaList) {
        this.registroMultimediaList = registroMultimediaList;
    }

    @XmlTransient
    @JsonIgnore
    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    @XmlTransient
    @JsonIgnore
    public List<Entrevistados> getEntrevistadosList() {
        return entrevistadosList;
    }

    public void setEntrevistadosList(List<Entrevistados> entrevistadosList) {
        this.entrevistadosList = entrevistadosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInformacionVial != null ? idInformacionVial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacionVial)) {
            return false;
        }
        InformacionVial other = (InformacionVial) object;
        if ((this.idInformacionVial == null && other.idInformacionVial != null) || (this.idInformacionVial != null && !this.idInformacionVial.equals(other.idInformacionVial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.InformacionVial[ idInformacionVial=" + idInformacionVial + " ]";
    }
    
}
