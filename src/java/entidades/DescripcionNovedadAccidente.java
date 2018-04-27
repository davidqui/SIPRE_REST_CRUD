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
@Table(name = "DESCRIPCION_NOVEDAD_ACCIDENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DescripcionNovedadAccidente.findAll", query = "SELECT d FROM DescripcionNovedadAccidente d")
    , @NamedQuery(name = "DescripcionNovedadAccidente.findByIdDesNovedadAccidente", query = "SELECT d FROM DescripcionNovedadAccidente d WHERE d.idDesNovedadAccidente = :idDesNovedadAccidente")
    , @NamedQuery(name = "DescripcionNovedadAccidente.findByDesHecho", query = "SELECT d FROM DescripcionNovedadAccidente d WHERE d.desHecho = :desHecho")
    , @NamedQuery(name = "DescripcionNovedadAccidente.findByDesHechoDetalladoNovedad", query = "SELECT d FROM DescripcionNovedadAccidente d WHERE d.desHechoDetalladoNovedad = :desHechoDetalladoNovedad")
    , @NamedQuery(name = "DescripcionNovedadAccidente.findByDesHechoDespuesNovedad", query = "SELECT d FROM DescripcionNovedadAccidente d WHERE d.desHechoDespuesNovedad = :desHechoDespuesNovedad")
    , @NamedQuery(name = "DescripcionNovedadAccidente.findByDesFallaOcurrenciaNovedad", query = "SELECT d FROM DescripcionNovedadAccidente d WHERE d.desFallaOcurrenciaNovedad = :desFallaOcurrenciaNovedad")
    , @NamedQuery(name = "DescripcionNovedadAccidente.findByDesPeorConsecuencia", query = "SELECT d FROM DescripcionNovedadAccidente d WHERE d.desPeorConsecuencia = :desPeorConsecuencia")
    , @NamedQuery(name = "DescripcionNovedadAccidente.findByDesActividadesPrevencion", query = "SELECT d FROM DescripcionNovedadAccidente d WHERE d.desActividadesPrevencion = :desActividadesPrevencion")})
public class DescripcionNovedadAccidente implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DES_NOVEDAD_ACCIDENTE")
    private BigDecimal idDesNovedadAccidente;
    @Size(max = 50)
    @Column(name = "DES_HECHO")
    private String desHecho;
    @Size(max = 500)
    @Column(name = "DES_HECHO_DETALLADO_NOVEDAD")
    private String desHechoDetalladoNovedad;
    @Size(max = 500)
    @Column(name = "DES_HECHO_DESPUES_NOVEDAD")
    private String desHechoDespuesNovedad;
    @Size(max = 500)
    @Column(name = "DES_FALLA_OCURRENCIA_NOVEDAD")
    private String desFallaOcurrenciaNovedad;
    @Size(max = 500)
    @Column(name = "DES_PEOR_CONSECUENCIA")
    private String desPeorConsecuencia;
    @Size(max = 500)
    @Column(name = "DES_ACTIVIDADES_PREVENCION")
    private String desActividadesPrevencion;
    @JoinColumn(name = "ID_NOVEDAD_INVESTIGACION", referencedColumnName = "ID_NOVEDAD_INVESTIGACION")
    @ManyToOne(optional = false)
    private NovedadInvestigacion idNovedadInvestigacion;

    public DescripcionNovedadAccidente() {
    }

    public DescripcionNovedadAccidente(BigDecimal idDesNovedadAccidente) {
        this.idDesNovedadAccidente = idDesNovedadAccidente;
    }

    public BigDecimal getIdDesNovedadAccidente() {
        return idDesNovedadAccidente;
    }

    public void setIdDesNovedadAccidente(BigDecimal idDesNovedadAccidente) {
        this.idDesNovedadAccidente = idDesNovedadAccidente;
    }

    public String getDesHecho() {
        return desHecho;
    }

    public void setDesHecho(String desHecho) {
        this.desHecho = desHecho;
    }

    public String getDesHechoDetalladoNovedad() {
        return desHechoDetalladoNovedad;
    }

    public void setDesHechoDetalladoNovedad(String desHechoDetalladoNovedad) {
        this.desHechoDetalladoNovedad = desHechoDetalladoNovedad;
    }

    public String getDesHechoDespuesNovedad() {
        return desHechoDespuesNovedad;
    }

    public void setDesHechoDespuesNovedad(String desHechoDespuesNovedad) {
        this.desHechoDespuesNovedad = desHechoDespuesNovedad;
    }

    public String getDesFallaOcurrenciaNovedad() {
        return desFallaOcurrenciaNovedad;
    }

    public void setDesFallaOcurrenciaNovedad(String desFallaOcurrenciaNovedad) {
        this.desFallaOcurrenciaNovedad = desFallaOcurrenciaNovedad;
    }

    public String getDesPeorConsecuencia() {
        return desPeorConsecuencia;
    }

    public void setDesPeorConsecuencia(String desPeorConsecuencia) {
        this.desPeorConsecuencia = desPeorConsecuencia;
    }

    public String getDesActividadesPrevencion() {
        return desActividadesPrevencion;
    }

    public void setDesActividadesPrevencion(String desActividadesPrevencion) {
        this.desActividadesPrevencion = desActividadesPrevencion;
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
        hash += (idDesNovedadAccidente != null ? idDesNovedadAccidente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DescripcionNovedadAccidente)) {
            return false;
        }
        DescripcionNovedadAccidente other = (DescripcionNovedadAccidente) object;
        if ((this.idDesNovedadAccidente == null && other.idDesNovedadAccidente != null) || (this.idDesNovedadAccidente != null && !this.idDesNovedadAccidente.equals(other.idDesNovedadAccidente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.DescripcionNovedadAccidente[ idDesNovedadAccidente=" + idDesNovedadAccidente + " ]";
    }
    
}
