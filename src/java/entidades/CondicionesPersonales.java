/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "CONDICIONES_PERSONALES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CondicionesPersonales.findAll", query = "SELECT c FROM CondicionesPersonales c")
    , @NamedQuery(name = "CondicionesPersonales.findByIdCondicionesPersonales", query = "SELECT c FROM CondicionesPersonales c WHERE c.idCondicionesPersonales = :idCondicionesPersonales")
    , @NamedQuery(name = "CondicionesPersonales.findByDescripcion", query = "SELECT c FROM CondicionesPersonales c WHERE c.descripcion = :descripcion")})
public class CondicionesPersonales implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CONDICIONES_PERSONALES")
    private BigDecimal idCondicionesPersonales;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "ID_CAUSA_EVENTO", referencedColumnName = "ID_CAUSA_EVENTO")
    @ManyToOne(optional = false)
    private CausasEvento idCausaEvento;
    @JoinColumn(name = "ID_NOVEDAD_INVESTIGACION", referencedColumnName = "ID_NOVEDAD_INVESTIGACION")
    @ManyToOne(optional = false)
    private NovedadInvestigacion idNovedadInvestigacion;

    public CondicionesPersonales() {
    }

    public CondicionesPersonales(BigDecimal idCondicionesPersonales) {
        this.idCondicionesPersonales = idCondicionesPersonales;
    }

    public BigDecimal getIdCondicionesPersonales() {
        return idCondicionesPersonales;
    }

    public void setIdCondicionesPersonales(BigDecimal idCondicionesPersonales) {
        this.idCondicionesPersonales = idCondicionesPersonales;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CausasEvento getIdCausaEvento() {
        return idCausaEvento;
    }

    public void setIdCausaEvento(CausasEvento idCausaEvento) {
        this.idCausaEvento = idCausaEvento;
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
        hash += (idCondicionesPersonales != null ? idCondicionesPersonales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CondicionesPersonales)) {
            return false;
        }
        CondicionesPersonales other = (CondicionesPersonales) object;
        if ((this.idCondicionesPersonales == null && other.idCondicionesPersonales != null) || (this.idCondicionesPersonales != null && !this.idCondicionesPersonales.equals(other.idCondicionesPersonales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CondicionesPersonales[ idCondicionesPersonales=" + idCondicionesPersonales + " ]";
    }
    
}
