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
@Table(name = "ANALISIS_CASUALIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnalisisCasualidad.findAll", query = "SELECT a FROM AnalisisCasualidad a")
    , @NamedQuery(name = "AnalisisCasualidad.findByIdAnalisCasualidad", query = "SELECT a FROM AnalisisCasualidad a WHERE a.idAnalisCasualidad = :idAnalisCasualidad")
    , @NamedQuery(name = "AnalisisCasualidad.findByDescripcion", query = "SELECT a FROM AnalisisCasualidad a WHERE a.descripcion = :descripcion")})
public class AnalisisCasualidad implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ANALIS_CASUALIDAD")
    private BigDecimal idAnalisCasualidad;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "ID_CAUSA_EVENTO", referencedColumnName = "ID_CAUSA_EVENTO")
    @ManyToOne(optional = false)
    private CausasEvento idCausaEvento;
    @JoinColumn(name = "ID_NOVEDAD_INVESTIGACION", referencedColumnName = "ID_NOVEDAD_INVESTIGACION")
    @ManyToOne(optional = false)
    private NovedadInvestigacion idNovedadInvestigacion;

    public AnalisisCasualidad() {
    }

    public AnalisisCasualidad(BigDecimal idAnalisCasualidad) {
        this.idAnalisCasualidad = idAnalisCasualidad;
    }

    public BigDecimal getIdAnalisCasualidad() {
        return idAnalisCasualidad;
    }

    public void setIdAnalisCasualidad(BigDecimal idAnalisCasualidad) {
        this.idAnalisCasualidad = idAnalisCasualidad;
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
        hash += (idAnalisCasualidad != null ? idAnalisCasualidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnalisisCasualidad)) {
            return false;
        }
        AnalisisCasualidad other = (AnalisisCasualidad) object;
        if ((this.idAnalisCasualidad == null && other.idAnalisCasualidad != null) || (this.idAnalisCasualidad != null && !this.idAnalisCasualidad.equals(other.idAnalisCasualidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.AnalisisCasualidad[ idAnalisCasualidad=" + idAnalisCasualidad + " ]";
    }
    
}
