/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "CAUSAS_EVENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CausasEvento.findAll", query = "SELECT c FROM CausasEvento c")
    , @NamedQuery(name = "CausasEvento.findByIdCausaEvento", query = "SELECT c FROM CausasEvento c WHERE c.idCausaEvento = :idCausaEvento")
    , @NamedQuery(name = "CausasEvento.findByCausaEvento", query = "SELECT c FROM CausasEvento c WHERE c.causaEvento = :causaEvento")
    , @NamedQuery(name = "CausasEvento.findByDescripcion", query = "SELECT c FROM CausasEvento c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CausasEvento.findByFechaCreacion", query = "SELECT c FROM CausasEvento c WHERE c.fechaCreacion = :fechaCreacion")})
public class CausasEvento implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CAUSA_EVENTO")
    private BigDecimal idCausaEvento;
    @Size(max = 100)
    @Column(name = "CAUSA_EVENTO")
    private String causaEvento;
    @Size(max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCausaEvento")
    private List<AnalisisCasualidad> analisisCasualidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCausaEvento")
    private List<CondicionesOrganizacional> condicionesOrganizacionalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCausaEvento")
    private List<CondicionesPersonales> condicionesPersonalesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCausaEvento")
    private List<ComportamientoAccidentado> comportamientoAccidentadoList;

    public CausasEvento() {
    }

    public CausasEvento(BigDecimal idCausaEvento) {
        this.idCausaEvento = idCausaEvento;
    }

    public BigDecimal getIdCausaEvento() {
        return idCausaEvento;
    }

    public void setIdCausaEvento(BigDecimal idCausaEvento) {
        this.idCausaEvento = idCausaEvento;
    }

    public String getCausaEvento() {
        return causaEvento;
    }

    public void setCausaEvento(String causaEvento) {
        this.causaEvento = causaEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @XmlTransient
    @JsonIgnore
    public List<AnalisisCasualidad> getAnalisisCasualidadList() {
        return analisisCasualidadList;
    }

    public void setAnalisisCasualidadList(List<AnalisisCasualidad> analisisCasualidadList) {
        this.analisisCasualidadList = analisisCasualidadList;
    }

    @XmlTransient
    @JsonIgnore
    public List<CondicionesOrganizacional> getCondicionesOrganizacionalList() {
        return condicionesOrganizacionalList;
    }

    public void setCondicionesOrganizacionalList(List<CondicionesOrganizacional> condicionesOrganizacionalList) {
        this.condicionesOrganizacionalList = condicionesOrganizacionalList;
    }

    @XmlTransient
    @JsonIgnore
    public List<CondicionesPersonales> getCondicionesPersonalesList() {
        return condicionesPersonalesList;
    }

    public void setCondicionesPersonalesList(List<CondicionesPersonales> condicionesPersonalesList) {
        this.condicionesPersonalesList = condicionesPersonalesList;
    }

    @XmlTransient
    @JsonIgnore
    public List<ComportamientoAccidentado> getComportamientoAccidentadoList() {
        return comportamientoAccidentadoList;
    }

    public void setComportamientoAccidentadoList(List<ComportamientoAccidentado> comportamientoAccidentadoList) {
        this.comportamientoAccidentadoList = comportamientoAccidentadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCausaEvento != null ? idCausaEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CausasEvento)) {
            return false;
        }
        CausasEvento other = (CausasEvento) object;
        if ((this.idCausaEvento == null && other.idCausaEvento != null) || (this.idCausaEvento != null && !this.idCausaEvento.equals(other.idCausaEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CausasEvento[ idCausaEvento=" + idCausaEvento + " ]";
    }
    
}
