/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "SIATH_USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiathUsuarios.findAll", query = "SELECT s FROM SiathUsuarios s")
    , @NamedQuery(name = "SiathUsuarios.findByCedula", query = "SELECT s FROM SiathUsuarios s WHERE s.cedula = :cedula")
    , @NamedQuery(name = "SiathUsuarios.findByPrimerNombre", query = "SELECT s FROM SiathUsuarios s WHERE s.primerNombre = :primerNombre")
    , @NamedQuery(name = "SiathUsuarios.findBySegundoNombre", query = "SELECT s FROM SiathUsuarios s WHERE s.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "SiathUsuarios.findByPrimerApellido", query = "SELECT s FROM SiathUsuarios s WHERE s.primerApellido = :primerApellido")
    , @NamedQuery(name = "SiathUsuarios.findBySegundoApellido", query = "SELECT s FROM SiathUsuarios s WHERE s.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "SiathUsuarios.findBySiglaGrado", query = "SELECT s FROM SiathUsuarios s WHERE s.siglaGrado = :siglaGrado")
    , @NamedQuery(name = "SiathUsuarios.findByTelefonoFijo", query = "SELECT s FROM SiathUsuarios s WHERE s.telefonoFijo = :telefonoFijo")
    , @NamedQuery(name = "SiathUsuarios.findByTelefonoCelular", query = "SELECT s FROM SiathUsuarios s WHERE s.telefonoCelular = :telefonoCelular")
    , @NamedQuery(name = "SiathUsuarios.findByCorreo", query = "SELECT s FROM SiathUsuarios s WHERE s.correo = :correo")
    , @NamedQuery(name = "SiathUsuarios.findByFechaCreacion", query = "SELECT s FROM SiathUsuarios s WHERE s.fechaCreacion = :fechaCreacion")})
public class SiathUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CEDULA")
    private BigDecimal cedula;
    @Size(max = 20)
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Size(max = 20)
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Size(max = 20)
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    @Size(max = 20)
    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;
    @Size(max = 5)
    @Column(name = "SIGLA_GRADO")
    private String siglaGrado;
    @Column(name = "TELEFONO_FIJO")
    private BigInteger telefonoFijo;
    @Column(name = "TELEFONO_CELULAR")
    private BigInteger telefonoCelular;
    @Size(max = 50)
    @Column(name = "CORREO")
    private String correo;
    @Size(max = 20)
    @Column(name = "FECHA_CREACION")
    private String fechaCreacion;

    public SiathUsuarios() {
    }

    public SiathUsuarios(BigDecimal cedula) {
        this.cedula = cedula;
    }

    public BigDecimal getCedula() {
        return cedula;
    }

    public void setCedula(BigDecimal cedula) {
        this.cedula = cedula;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSiglaGrado() {
        return siglaGrado;
    }

    public void setSiglaGrado(String siglaGrado) {
        this.siglaGrado = siglaGrado;
    }

    public BigInteger getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(BigInteger telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public BigInteger getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(BigInteger telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SiathUsuarios)) {
            return false;
        }
        SiathUsuarios other = (SiathUsuarios) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.SiathUsuarios[ cedula=" + cedula + " ]";
    }
    
}
