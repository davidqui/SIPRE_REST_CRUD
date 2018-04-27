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
@Table(name = "LUGAR_NOVEDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LugarNovedad.findAll", query = "SELECT l FROM LugarNovedad l")
    , @NamedQuery(name = "LugarNovedad.findByIdLugarNovedad", query = "SELECT l FROM LugarNovedad l WHERE l.idLugarNovedad = :idLugarNovedad")
    , @NamedQuery(name = "LugarNovedad.findByZona", query = "SELECT l FROM LugarNovedad l WHERE l.zona = :zona")
    , @NamedQuery(name = "LugarNovedad.findByDireccion", query = "SELECT l FROM LugarNovedad l WHERE l.direccion = :direccion")
    , @NamedQuery(name = "LugarNovedad.findByVeredaBarrio", query = "SELECT l FROM LugarNovedad l WHERE l.veredaBarrio = :veredaBarrio")
    , @NamedQuery(name = "LugarNovedad.findByCaracteristicasLugar", query = "SELECT l FROM LugarNovedad l WHERE l.caracteristicasLugar = :caracteristicasLugar")
    , @NamedQuery(name = "LugarNovedad.findByLugarEspecifico", query = "SELECT l FROM LugarNovedad l WHERE l.lugarEspecifico = :lugarEspecifico")})
public class LugarNovedad implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_LUGAR_NOVEDAD")
    private BigDecimal idLugarNovedad;
    @Size(max = 100)
    @Column(name = "ZONA")
    private String zona;
    @Size(max = 50)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 100)
    @Column(name = "VEREDA_BARRIO")
    private String veredaBarrio;
    @Size(max = 200)
    @Column(name = "CARACTERISTICAS_LUGAR")
    private String caracteristicasLugar;
    @Size(max = 100)
    @Column(name = "LUGAR_ESPECIFICO")
    private String lugarEspecifico;
    @JoinColumn(name = "ID_MUNICIPIO", referencedColumnName = "ID_MUNICIPIO")
    @ManyToOne(optional = false)
    private Municipio idMunicipio;
    @JoinColumn(name = "ID_NOVEDAD_INVESTIGACION", referencedColumnName = "ID_NOVEDAD_INVESTIGACION")
    @ManyToOne(optional = false)
    private NovedadInvestigacion idNovedadInvestigacion;

    public LugarNovedad() {
    }

    public LugarNovedad(BigDecimal idLugarNovedad) {
        this.idLugarNovedad = idLugarNovedad;
    }

    public BigDecimal getIdLugarNovedad() {
        return idLugarNovedad;
    }

    public void setIdLugarNovedad(BigDecimal idLugarNovedad) {
        this.idLugarNovedad = idLugarNovedad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getVeredaBarrio() {
        return veredaBarrio;
    }

    public void setVeredaBarrio(String veredaBarrio) {
        this.veredaBarrio = veredaBarrio;
    }

    public String getCaracteristicasLugar() {
        return caracteristicasLugar;
    }

    public void setCaracteristicasLugar(String caracteristicasLugar) {
        this.caracteristicasLugar = caracteristicasLugar;
    }

    public String getLugarEspecifico() {
        return lugarEspecifico;
    }

    public void setLugarEspecifico(String lugarEspecifico) {
        this.lugarEspecifico = lugarEspecifico;
    }

    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
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
        hash += (idLugarNovedad != null ? idLugarNovedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LugarNovedad)) {
            return false;
        }
        LugarNovedad other = (LugarNovedad) object;
        if ((this.idLugarNovedad == null && other.idLugarNovedad != null) || (this.idLugarNovedad != null && !this.idLugarNovedad.equals(other.idLugarNovedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.LugarNovedad[ idLugarNovedad=" + idLugarNovedad + " ]";
    }
    
}
