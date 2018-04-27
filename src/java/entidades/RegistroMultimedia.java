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
import javax.persistence.Lob;
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
@Table(name = "REGISTRO_MULTIMEDIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroMultimedia.findAll", query = "SELECT r FROM RegistroMultimedia r")
    , @NamedQuery(name = "RegistroMultimedia.findByIdMultimedia", query = "SELECT r FROM RegistroMultimedia r WHERE r.idMultimedia = :idMultimedia")
    , @NamedQuery(name = "RegistroMultimedia.findByNombreArchivo", query = "SELECT r FROM RegistroMultimedia r WHERE r.nombreArchivo = :nombreArchivo")
    , @NamedQuery(name = "RegistroMultimedia.findByFechaRegistro", query = "SELECT r FROM RegistroMultimedia r WHERE r.fechaRegistro = :fechaRegistro")})
public class RegistroMultimedia implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MULTIMEDIA")
    private BigDecimal idMultimedia;
    @Size(max = 50)
    @Column(name = "NOMBRE_ARCHIVO")
    private String nombreArchivo;
    @Lob
    @Column(name = "ARCHIVO")
    private Serializable archivo;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @JoinColumn(name = "ID_INFORMACION_VIAL", referencedColumnName = "ID_INFORMACION_VIAL")
    @ManyToOne(optional = false)
    private InformacionVial idInformacionVial;

    public RegistroMultimedia() {
    }

    public RegistroMultimedia(BigDecimal idMultimedia) {
        this.idMultimedia = idMultimedia;
    }

    public BigDecimal getIdMultimedia() {
        return idMultimedia;
    }

    public void setIdMultimedia(BigDecimal idMultimedia) {
        this.idMultimedia = idMultimedia;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Serializable getArchivo() {
        return archivo;
    }

    public void setArchivo(Serializable archivo) {
        this.archivo = archivo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
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
        hash += (idMultimedia != null ? idMultimedia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroMultimedia)) {
            return false;
        }
        RegistroMultimedia other = (RegistroMultimedia) object;
        if ((this.idMultimedia == null && other.idMultimedia != null) || (this.idMultimedia != null && !this.idMultimedia.equals(other.idMultimedia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.RegistroMultimedia[ idMultimedia=" + idMultimedia + " ]";
    }
    
}
