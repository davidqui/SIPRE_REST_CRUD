/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "VEHICULO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v")
    , @NamedQuery(name = "Vehiculo.findByPlaca", query = "SELECT v FROM Vehiculo v WHERE v.placa = :placa")
    , @NamedQuery(name = "Vehiculo.findByTipoVehiculo", query = "SELECT v FROM Vehiculo v WHERE v.tipoVehiculo = :tipoVehiculo")
    , @NamedQuery(name = "Vehiculo.findByMarca", query = "SELECT v FROM Vehiculo v WHERE v.marca = :marca")
    , @NamedQuery(name = "Vehiculo.findByModelo", query = "SELECT v FROM Vehiculo v WHERE v.modelo = :modelo")
    , @NamedQuery(name = "Vehiculo.findByCilindraje", query = "SELECT v FROM Vehiculo v WHERE v.cilindraje = :cilindraje")
    , @NamedQuery(name = "Vehiculo.findByPropio", query = "SELECT v FROM Vehiculo v WHERE v.propio = :propio")
    , @NamedQuery(name = "Vehiculo.findByFechaSoatInicio", query = "SELECT v FROM Vehiculo v WHERE v.fechaSoatInicio = :fechaSoatInicio")
    , @NamedQuery(name = "Vehiculo.findByFechaSoatFin", query = "SELECT v FROM Vehiculo v WHERE v.fechaSoatFin = :fechaSoatFin")
    , @NamedQuery(name = "Vehiculo.findByEstadoLicencia", query = "SELECT v FROM Vehiculo v WHERE v.estadoLicencia = :estadoLicencia")
    , @NamedQuery(name = "Vehiculo.findByEstadoComparendos", query = "SELECT v FROM Vehiculo v WHERE v.estadoComparendos = :estadoComparendos")
    , @NamedQuery(name = "Vehiculo.findBySecripcionDa\u00f1os", query = "SELECT v FROM Vehiculo v WHERE v.secripcionDa\u00f1os = :secripcionDa\u00f1os")
    , @NamedQuery(name = "Vehiculo.findByCostosReparacion", query = "SELECT v FROM Vehiculo v WHERE v.costosReparacion = :costosReparacion")
    , @NamedQuery(name = "Vehiculo.findByDepartamentoResponsable", query = "SELECT v FROM Vehiculo v WHERE v.departamentoResponsable = :departamentoResponsable")})
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PLACA")
    private String placa;
    @Size(max = 50)
    @Column(name = "TIPO_VEHICULO")
    private String tipoVehiculo;
    @Size(max = 50)
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "MODELO")
    private BigInteger modelo;
    @Column(name = "CILINDRAJE")
    private BigInteger cilindraje;
    @Column(name = "PROPIO")
    private BigInteger propio;
    @Column(name = "FECHA_SOAT_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSoatInicio;
    @Column(name = "FECHA_SOAT_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSoatFin;
    @Size(max = 20)
    @Column(name = "ESTADO_LICENCIA")
    private String estadoLicencia;
    @Size(max = 100)
    @Column(name = "ESTADO_COMPARENDOS")
    private String estadoComparendos;
    @Size(max = 500)
    @Column(name = "SECRIPCION_DA\u00d1OS")
    private String secripcionDaños;
    @Column(name = "COSTOS_REPARACION")
    private BigInteger costosReparacion;
    @Size(max = 100)
    @Column(name = "DEPARTAMENTO_RESPONSABLE")
    private String departamentoResponsable;
    @JoinColumn(name = "ID_INFORMACION_VIAL", referencedColumnName = "ID_INFORMACION_VIAL")
    @ManyToOne(optional = false)
    private InformacionVial idInformacionVial;

    public Vehiculo() {
    }

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigInteger getModelo() {
        return modelo;
    }

    public void setModelo(BigInteger modelo) {
        this.modelo = modelo;
    }

    public BigInteger getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(BigInteger cilindraje) {
        this.cilindraje = cilindraje;
    }

    public BigInteger getPropio() {
        return propio;
    }

    public void setPropio(BigInteger propio) {
        this.propio = propio;
    }

    public Date getFechaSoatInicio() {
        return fechaSoatInicio;
    }

    public void setFechaSoatInicio(Date fechaSoatInicio) {
        this.fechaSoatInicio = fechaSoatInicio;
    }

    public Date getFechaSoatFin() {
        return fechaSoatFin;
    }

    public void setFechaSoatFin(Date fechaSoatFin) {
        this.fechaSoatFin = fechaSoatFin;
    }

    public String getEstadoLicencia() {
        return estadoLicencia;
    }

    public void setEstadoLicencia(String estadoLicencia) {
        this.estadoLicencia = estadoLicencia;
    }

    public String getEstadoComparendos() {
        return estadoComparendos;
    }

    public void setEstadoComparendos(String estadoComparendos) {
        this.estadoComparendos = estadoComparendos;
    }

    public String getSecripcionDaños() {
        return secripcionDaños;
    }

    public void setSecripcionDaños(String secripcionDaños) {
        this.secripcionDaños = secripcionDaños;
    }

    public BigInteger getCostosReparacion() {
        return costosReparacion;
    }

    public void setCostosReparacion(BigInteger costosReparacion) {
        this.costosReparacion = costosReparacion;
    }

    public String getDepartamentoResponsable() {
        return departamentoResponsable;
    }

    public void setDepartamentoResponsable(String departamentoResponsable) {
        this.departamentoResponsable = departamentoResponsable;
    }

    public InformacionVial getIdInformacionVial() {
        return idInformacionVial;
    }

    public void setIdInformacionVial(InformacionVial idInformacionVial) {
        this.idInformacionVial = idInformacionVial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placa != null ? placa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.placa == null && other.placa != null) || (this.placa != null && !this.placa.equals(other.placa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Vehiculo[ placa=" + placa + " ]";
    }
    
}
