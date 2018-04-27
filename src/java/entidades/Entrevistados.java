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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ENTREVISTADOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrevistados.findAll", query = "SELECT e FROM Entrevistados e")
    , @NamedQuery(name = "Entrevistados.findByDocumentoIdentificacion", query = "SELECT e FROM Entrevistados e WHERE e.documentoIdentificacion = :documentoIdentificacion")
    , @NamedQuery(name = "Entrevistados.findByPrimerNombre", query = "SELECT e FROM Entrevistados e WHERE e.primerNombre = :primerNombre")
    , @NamedQuery(name = "Entrevistados.findBySegundoNombre", query = "SELECT e FROM Entrevistados e WHERE e.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "Entrevistados.findByPrimerApellido", query = "SELECT e FROM Entrevistados e WHERE e.primerApellido = :primerApellido")
    , @NamedQuery(name = "Entrevistados.findBySegundoApellido", query = "SELECT e FROM Entrevistados e WHERE e.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "Entrevistados.findByCargo", query = "SELECT e FROM Entrevistados e WHERE e.cargo = :cargo")
    , @NamedQuery(name = "Entrevistados.findByTelefonoFijo", query = "SELECT e FROM Entrevistados e WHERE e.telefonoFijo = :telefonoFijo")
    , @NamedQuery(name = "Entrevistados.findByTelefonoCelular", query = "SELECT e FROM Entrevistados e WHERE e.telefonoCelular = :telefonoCelular")
    , @NamedQuery(name = "Entrevistados.findByDescripcionEchos", query = "SELECT e FROM Entrevistados e WHERE e.descripcionEchos = :descripcionEchos")})
public class Entrevistados implements Serializable {

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
    @Size(max = 500)
    @Column(name = "DESCRIPCION_ECHOS")
    private String descripcionEchos;
    @JoinColumn(name = "ID_INFORMACION_VIAL", referencedColumnName = "ID_INFORMACION_VIAL")
    @ManyToOne(optional = false)
    private InformacionVial idInformacionVial;

    public Entrevistados() {
    }

    public Entrevistados(BigDecimal documentoIdentificacion) {
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

    public String getDescripcionEchos() {
        return descripcionEchos;
    }

    public void setDescripcionEchos(String descripcionEchos) {
        this.descripcionEchos = descripcionEchos;
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
        hash += (documentoIdentificacion != null ? documentoIdentificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrevistados)) {
            return false;
        }
        Entrevistados other = (Entrevistados) object;
        if ((this.documentoIdentificacion == null && other.documentoIdentificacion != null) || (this.documentoIdentificacion != null && !this.documentoIdentificacion.equals(other.documentoIdentificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Entrevistados[ documentoIdentificacion=" + documentoIdentificacion + " ]";
    }
    
}
