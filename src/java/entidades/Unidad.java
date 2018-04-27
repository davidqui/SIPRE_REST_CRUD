/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "UNIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidad.findAll", query = "SELECT u FROM Unidad u")
    , @NamedQuery(name = "Unidad.findByIdUnidad", query = "SELECT u FROM Unidad u WHERE u.idUnidad = :idUnidad")
    , @NamedQuery(name = "Unidad.findByNitUnidad", query = "SELECT u FROM Unidad u WHERE u.nitUnidad = :nitUnidad")
    , @NamedQuery(name = "Unidad.findByNombreDeLaEmpresa", query = "SELECT u FROM Unidad u WHERE u.nombreDeLaEmpresa = :nombreDeLaEmpresa")
    , @NamedQuery(name = "Unidad.findBySiglaDeLaEmpresa", query = "SELECT u FROM Unidad u WHERE u.siglaDeLaEmpresa = :siglaDeLaEmpresa")
    , @NamedQuery(name = "Unidad.findByDireccion", query = "SELECT u FROM Unidad u WHERE u.direccion = :direccion")
    , @NamedQuery(name = "Unidad.findByEmpPadre", query = "SELECT u FROM Unidad u WHERE u.empPadre = :empPadre")})
public class Unidad implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_UNIDAD")
    private BigDecimal idUnidad;
    @Size(max = 40)
    @Column(name = "NIT_UNIDAD")
    private String nitUnidad;
    @Size(max = 100)
    @Column(name = "NOMBRE_DE_LA_EMPRESA")
    private String nombreDeLaEmpresa;
    @Size(max = 10)
    @Column(name = "SIGLA_DE_LA_EMPRESA")
    private String siglaDeLaEmpresa;
    @Size(max = 70)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 30)
    @Column(name = "EMP_PADRE")
    private String empPadre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidad")
    private List<NovedadInvestigacion> novedadInvestigacionList;

    public Unidad() {
    }

    public Unidad(BigDecimal idUnidad) {
        this.idUnidad = idUnidad;
    }

    public BigDecimal getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(BigDecimal idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getNitUnidad() {
        return nitUnidad;
    }

    public void setNitUnidad(String nitUnidad) {
        this.nitUnidad = nitUnidad;
    }

    public String getNombreDeLaEmpresa() {
        return nombreDeLaEmpresa;
    }

    public void setNombreDeLaEmpresa(String nombreDeLaEmpresa) {
        this.nombreDeLaEmpresa = nombreDeLaEmpresa;
    }

    public String getSiglaDeLaEmpresa() {
        return siglaDeLaEmpresa;
    }

    public void setSiglaDeLaEmpresa(String siglaDeLaEmpresa) {
        this.siglaDeLaEmpresa = siglaDeLaEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmpPadre() {
        return empPadre;
    }

    public void setEmpPadre(String empPadre) {
        this.empPadre = empPadre;
    }

    @XmlTransient
    @JsonIgnore
    public List<NovedadInvestigacion> getNovedadInvestigacionList() {
        return novedadInvestigacionList;
    }

    public void setNovedadInvestigacionList(List<NovedadInvestigacion> novedadInvestigacionList) {
        this.novedadInvestigacionList = novedadInvestigacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidad != null ? idUnidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidad)) {
            return false;
        }
        Unidad other = (Unidad) object;
        if ((this.idUnidad == null && other.idUnidad != null) || (this.idUnidad != null && !this.idUnidad.equals(other.idUnidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Unidad[ idUnidad=" + idUnidad + " ]";
    }
    
}
