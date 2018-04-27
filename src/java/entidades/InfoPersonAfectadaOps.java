/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "INFO_PERSON_AFECTADA_OPS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InfoPersonAfectadaOps.findAll", query = "SELECT i FROM InfoPersonAfectadaOps i")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByDocumentoIdentificacion", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.documentoIdentificacion = :documentoIdentificacion")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByPrimerNombre", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.primerNombre = :primerNombre")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findBySegundoNombre", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByPrimerApellido", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.primerApellido = :primerApellido")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findBySegundoApellido", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByCargo", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.cargo = :cargo")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByTelefonoFijo", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.telefonoFijo = :telefonoFijo")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByTelefonoCelular", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.telefonoCelular = :telefonoCelular")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByArma", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.arma = :arma")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByFechaNacimiento", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByFechaIngreso", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByContingente", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.contingente = :contingente")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByTiempoServicioMeses", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.tiempoServicioMeses = :tiempoServicioMeses")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByTiempoServicioUnidadMeses", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.tiempoServicioUnidadMeses = :tiempoServicioUnidadMeses")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByDireccion", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.direccion = :direccion")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findBySexo", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.sexo = :sexo")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByEstadoCivil", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.estadoCivil = :estadoCivil")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByEscolaridad", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.escolaridad = :escolaridad")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findBySalarioMensual", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.salarioMensual = :salarioMensual")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByServicioSalud", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.servicioSalud = :servicioSalud")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByEntidadSalud", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.entidadSalud = :entidadSalud")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByAdminRiesgos", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.adminRiesgos = :adminRiesgos")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByTipoVinculacion", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.tipoVinculacion = :tipoVinculacion")
    , @NamedQuery(name = "InfoPersonAfectadaOps.findByFondoPension", query = "SELECT i FROM InfoPersonAfectadaOps i WHERE i.fondoPension = :fondoPension")})
public class InfoPersonAfectadaOps implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOCUMENTO_IDENTIFICACION")
    private BigDecimal documentoIdentificacion;
    @Size(max = 30)
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Size(max = 30)
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Size(max = 30)
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    @Size(max = 30)
    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;
    @Size(max = 100)
    @Column(name = "CARGO")
    private String cargo;
    @Column(name = "TELEFONO_FIJO")
    private BigInteger telefonoFijo;
    @Column(name = "TELEFONO_CELULAR")
    private BigInteger telefonoCelular;
    @Size(max = 50)
    @Column(name = "ARMA")
    private String arma;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Size(max = 50)
    @Column(name = "CONTINGENTE")
    private String contingente;
    @Column(name = "TIEMPO_SERVICIO_MESES")
    private BigInteger tiempoServicioMeses;
    @Column(name = "TIEMPO_SERVICIO_UNIDAD_MESES")
    private BigInteger tiempoServicioUnidadMeses;
    @Size(max = 50)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 10)
    @Column(name = "SEXO")
    private String sexo;
    @Size(max = 15)
    @Column(name = "ESTADO_CIVIL")
    private String estadoCivil;
    @Size(max = 30)
    @Column(name = "ESCOLARIDAD")
    private String escolaridad;
    @Column(name = "SALARIO_MENSUAL")
    private BigInteger salarioMensual;
    @Size(max = 50)
    @Column(name = "SERVICIO_SALUD")
    private String servicioSalud;
    @Size(max = 50)
    @Column(name = "ENTIDAD_SALUD")
    private String entidadSalud;
    @Size(max = 50)
    @Column(name = "ADMIN_RIESGOS")
    private String adminRiesgos;
    @Size(max = 50)
    @Column(name = "TIPO_VINCULACION")
    private String tipoVinculacion;
    @Size(max = 50)
    @Column(name = "FONDO_PENSION")
    private String fondoPension;
    @JoinColumn(name = "ID_NOVEDAD_INVESTIGACION", referencedColumnName = "ID_NOVEDAD_INVESTIGACION")
    @ManyToOne(optional = false)
    private NovedadInvestigacion idNovedadInvestigacion;

    public InfoPersonAfectadaOps() {
    }

    public InfoPersonAfectadaOps(BigDecimal documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public BigDecimal getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(BigDecimal documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getContingente() {
        return contingente;
    }

    public void setContingente(String contingente) {
        this.contingente = contingente;
    }

    public BigInteger getTiempoServicioMeses() {
        return tiempoServicioMeses;
    }

    public void setTiempoServicioMeses(BigInteger tiempoServicioMeses) {
        this.tiempoServicioMeses = tiempoServicioMeses;
    }

    public BigInteger getTiempoServicioUnidadMeses() {
        return tiempoServicioUnidadMeses;
    }

    public void setTiempoServicioUnidadMeses(BigInteger tiempoServicioUnidadMeses) {
        this.tiempoServicioUnidadMeses = tiempoServicioUnidadMeses;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public BigInteger getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(BigInteger salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public String getServicioSalud() {
        return servicioSalud;
    }

    public void setServicioSalud(String servicioSalud) {
        this.servicioSalud = servicioSalud;
    }

    public String getEntidadSalud() {
        return entidadSalud;
    }

    public void setEntidadSalud(String entidadSalud) {
        this.entidadSalud = entidadSalud;
    }

    public String getAdminRiesgos() {
        return adminRiesgos;
    }

    public void setAdminRiesgos(String adminRiesgos) {
        this.adminRiesgos = adminRiesgos;
    }

    public String getTipoVinculacion() {
        return tipoVinculacion;
    }

    public void setTipoVinculacion(String tipoVinculacion) {
        this.tipoVinculacion = tipoVinculacion;
    }

    public String getFondoPension() {
        return fondoPension;
    }

    public void setFondoPension(String fondoPension) {
        this.fondoPension = fondoPension;
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
        hash += (documentoIdentificacion != null ? documentoIdentificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InfoPersonAfectadaOps)) {
            return false;
        }
        InfoPersonAfectadaOps other = (InfoPersonAfectadaOps) object;
        if ((this.documentoIdentificacion == null && other.documentoIdentificacion != null) || (this.documentoIdentificacion != null && !this.documentoIdentificacion.equals(other.documentoIdentificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.InfoPersonAfectadaOps[ documentoIdentificacion=" + documentoIdentificacion + " ]";
    }
    
}
