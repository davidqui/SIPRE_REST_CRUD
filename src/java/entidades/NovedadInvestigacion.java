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
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "NOVEDAD_INVESTIGACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NovedadInvestigacion.findAll", query = "SELECT n FROM NovedadInvestigacion n")
    , @NamedQuery(name = "NovedadInvestigacion.findByIdNovedadInvestigacion", query = "SELECT n FROM NovedadInvestigacion n WHERE n.idNovedadInvestigacion = :idNovedadInvestigacion")
    , @NamedQuery(name = "NovedadInvestigacion.findByDia", query = "SELECT n FROM NovedadInvestigacion n WHERE n.dia = :dia")
    , @NamedQuery(name = "NovedadInvestigacion.findByFecha", query = "SELECT n FROM NovedadInvestigacion n WHERE n.fecha = :fecha")
    , @NamedQuery(name = "NovedadInvestigacion.findByClaseNovedad", query = "SELECT n FROM NovedadInvestigacion n WHERE n.claseNovedad = :claseNovedad")
    , @NamedQuery(name = "NovedadInvestigacion.findByGrave", query = "SELECT n FROM NovedadInvestigacion n WHERE n.grave = :grave")
    , @NamedQuery(name = "NovedadInvestigacion.findByMortal", query = "SELECT n FROM NovedadInvestigacion n WHERE n.mortal = :mortal")
    , @NamedQuery(name = "NovedadInvestigacion.findByAtencionInmediata", query = "SELECT n FROM NovedadInvestigacion n WHERE n.atencionInmediata = :atencionInmediata")
    , @NamedQuery(name = "NovedadInvestigacion.findByInformoNoInstituNombre", query = "SELECT n FROM NovedadInvestigacion n WHERE n.informoNoInstituNombre = :informoNoInstituNombre")
    , @NamedQuery(name = "NovedadInvestigacion.findByInformoNoInstituConsanguin", query = "SELECT n FROM NovedadInvestigacion n WHERE n.informoNoInstituConsanguin = :informoNoInstituConsanguin")
    , @NamedQuery(name = "NovedadInvestigacion.findByCargoReportaNovedad", query = "SELECT n FROM NovedadInvestigacion n WHERE n.cargoReportaNovedad = :cargoReportaNovedad")
    , @NamedQuery(name = "NovedadInvestigacion.findByTiempoLaboradoDiaUnidad", query = "SELECT n FROM NovedadInvestigacion n WHERE n.tiempoLaboradoDiaUnidad = :tiempoLaboradoDiaUnidad")
    , @NamedQuery(name = "NovedadInvestigacion.findByExperienciaEnCargo", query = "SELECT n FROM NovedadInvestigacion n WHERE n.experienciaEnCargo = :experienciaEnCargo")
    , @NamedQuery(name = "NovedadInvestigacion.findByIntentoSuicidio", query = "SELECT n FROM NovedadInvestigacion n WHERE n.intentoSuicidio = :intentoSuicidio")
    , @NamedQuery(name = "NovedadInvestigacion.findByDesActividadMomenAcciden", query = "SELECT n FROM NovedadInvestigacion n WHERE n.desActividadMomenAcciden = :desActividadMomenAcciden")
    , @NamedQuery(name = "NovedadInvestigacion.findByDesExpeActividadTiempo", query = "SELECT n FROM NovedadInvestigacion n WHERE n.desExpeActividadTiempo = :desExpeActividadTiempo")
    , @NamedQuery(name = "NovedadInvestigacion.findByRecibioCapacitEnActivi", query = "SELECT n FROM NovedadInvestigacion n WHERE n.recibioCapacitEnActivi = :recibioCapacitEnActivi")
    , @NamedQuery(name = "NovedadInvestigacion.findByFechaUltimoPermisoVacas", query = "SELECT n FROM NovedadInvestigacion n WHERE n.fechaUltimoPermisoVacas = :fechaUltimoPermisoVacas")
    , @NamedQuery(name = "NovedadInvestigacion.findByFechaUltimoReentrenamiento", query = "SELECT n FROM NovedadInvestigacion n WHERE n.fechaUltimoReentrenamiento = :fechaUltimoReentrenamiento")
    , @NamedQuery(name = "NovedadInvestigacion.findByDocumentoIdentifiSiath", query = "SELECT n FROM NovedadInvestigacion n WHERE n.documentoIdentifiSiath = :documentoIdentifiSiath")})
public class NovedadInvestigacion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_NOVEDAD_INVESTIGACION")
    private BigDecimal idNovedadInvestigacion;
    @Size(max = 10)
    @Column(name = "DIA")
    private String dia;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Size(max = 30)
    @Column(name = "CLASE_NOVEDAD")
    private String claseNovedad;
    @Column(name = "GRAVE")
    private BigInteger grave;
    @Column(name = "MORTAL")
    private BigInteger mortal;
    @Size(max = 50)
    @Column(name = "ATENCION_INMEDIATA")
    private String atencionInmediata;
    @Size(max = 100)
    @Column(name = "INFORMO_NO_INSTITU_NOMBRE")
    private String informoNoInstituNombre;
    @Size(max = 100)
    @Column(name = "INFORMO_NO_INSTITU_CONSANGUIN")
    private String informoNoInstituConsanguin;
    @Size(max = 50)
    @Column(name = "CARGO_REPORTA_NOVEDAD")
    private String cargoReportaNovedad;
    @Column(name = "TIEMPO_LABORADO_DIA_UNIDAD")
    private BigInteger tiempoLaboradoDiaUnidad;
    @Column(name = "EXPERIENCIA_EN_CARGO")
    private BigInteger experienciaEnCargo;
    @Column(name = "INTENTO_SUICIDIO")
    private BigInteger intentoSuicidio;
    @Size(max = 500)
    @Column(name = "DES_ACTIVIDAD_MOMEN_ACCIDEN")
    private String desActividadMomenAcciden;
    @Column(name = "DES_EXPE_ACTIVIDAD_TIEMPO")
    private BigInteger desExpeActividadTiempo;
    @Column(name = "RECIBIO_CAPACIT_EN_ACTIVI")
    private BigInteger recibioCapacitEnActivi;
    @Column(name = "FECHA_ULTIMO_PERMISO_VACAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimoPermisoVacas;
    @Column(name = "FECHA_ULTIMO_REENTRENAMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimoReentrenamiento;
    @Column(name = "DOCUMENTO_IDENTIFI_SIATH")
    private BigInteger documentoIdentifiSiath;
    @JoinColumn(name = "ID_AGENTE_PRODUCE_LESION", referencedColumnName = "ID_AGENTE_PRODUCE_LESION")
    @ManyToOne(optional = false)
    private AgenteEspecificoProduceLesion idAgenteProduceLesion;
    @JoinColumn(name = "MECANISMO_LESION", referencedColumnName = "MECANISMO_LESION_ID")
    @ManyToOne(optional = false)
    private MecanismoLesion mecanismoLesion;
    @JoinColumn(name = "ID_PARTE_CUERPO", referencedColumnName = "ID_PARTE_CUERPO")
    @ManyToOne(optional = false)
    private PartesCuerpo idParteCuerpo;
    @JoinColumn(name = "ID_TIPO_NOVEDAD_FUERZA", referencedColumnName = "ID_TIPO_NOVEDAD_FUERZA")
    @ManyToOne(optional = false)
    private TipoNovedadFuerza idTipoNovedadFuerza;
    @JoinColumn(name = "ID_UNIDAD", referencedColumnName = "ID_UNIDAD")
    @ManyToOne(optional = false)
    private Unidad idUnidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadInvestigacion")
    private List<InformacionVial> informacionVialList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadInvestigacion")
    private List<AnalisisCasualidad> analisisCasualidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadInvestigacion")
    private List<LugarNovedad> lugarNovedadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadInvestigacion")
    private List<InfoPersonAfectadaPlanta> infoPersonAfectadaPlantaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadInvestigacion")
    private List<InfoPersonAfectadaOps> infoPersonAfectadaOpsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadInvestigacion")
    private List<CapacitacionesRealizadas> capacitacionesRealizadasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadInvestigacion")
    private List<CondicionesOrganizacional> condicionesOrganizacionalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadInvestigacion")
    private List<CondicionesPersonales> condicionesPersonalesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadInvestigacion")
    private List<DescripcionNovedadAccidente> descripcionNovedadAccidenteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNovedadInvestigacion")
    private List<ComportamientoAccidentado> comportamientoAccidentadoList;

    public NovedadInvestigacion() {
    }

    public NovedadInvestigacion(BigDecimal idNovedadInvestigacion) {
        this.idNovedadInvestigacion = idNovedadInvestigacion;
    }

    public BigDecimal getIdNovedadInvestigacion() {
        return idNovedadInvestigacion;
    }

    public void setIdNovedadInvestigacion(BigDecimal idNovedadInvestigacion) {
        this.idNovedadInvestigacion = idNovedadInvestigacion;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getClaseNovedad() {
        return claseNovedad;
    }

    public void setClaseNovedad(String claseNovedad) {
        this.claseNovedad = claseNovedad;
    }

    public BigInteger getGrave() {
        return grave;
    }

    public void setGrave(BigInteger grave) {
        this.grave = grave;
    }

    public BigInteger getMortal() {
        return mortal;
    }

    public void setMortal(BigInteger mortal) {
        this.mortal = mortal;
    }

    public String getAtencionInmediata() {
        return atencionInmediata;
    }

    public void setAtencionInmediata(String atencionInmediata) {
        this.atencionInmediata = atencionInmediata;
    }

    public String getInformoNoInstituNombre() {
        return informoNoInstituNombre;
    }

    public void setInformoNoInstituNombre(String informoNoInstituNombre) {
        this.informoNoInstituNombre = informoNoInstituNombre;
    }

    public String getInformoNoInstituConsanguin() {
        return informoNoInstituConsanguin;
    }

    public void setInformoNoInstituConsanguin(String informoNoInstituConsanguin) {
        this.informoNoInstituConsanguin = informoNoInstituConsanguin;
    }

    public String getCargoReportaNovedad() {
        return cargoReportaNovedad;
    }

    public void setCargoReportaNovedad(String cargoReportaNovedad) {
        this.cargoReportaNovedad = cargoReportaNovedad;
    }

    public BigInteger getTiempoLaboradoDiaUnidad() {
        return tiempoLaboradoDiaUnidad;
    }

    public void setTiempoLaboradoDiaUnidad(BigInteger tiempoLaboradoDiaUnidad) {
        this.tiempoLaboradoDiaUnidad = tiempoLaboradoDiaUnidad;
    }

    public BigInteger getExperienciaEnCargo() {
        return experienciaEnCargo;
    }

    public void setExperienciaEnCargo(BigInteger experienciaEnCargo) {
        this.experienciaEnCargo = experienciaEnCargo;
    }

    public BigInteger getIntentoSuicidio() {
        return intentoSuicidio;
    }

    public void setIntentoSuicidio(BigInteger intentoSuicidio) {
        this.intentoSuicidio = intentoSuicidio;
    }

    public String getDesActividadMomenAcciden() {
        return desActividadMomenAcciden;
    }

    public void setDesActividadMomenAcciden(String desActividadMomenAcciden) {
        this.desActividadMomenAcciden = desActividadMomenAcciden;
    }

    public BigInteger getDesExpeActividadTiempo() {
        return desExpeActividadTiempo;
    }

    public void setDesExpeActividadTiempo(BigInteger desExpeActividadTiempo) {
        this.desExpeActividadTiempo = desExpeActividadTiempo;
    }

    public BigInteger getRecibioCapacitEnActivi() {
        return recibioCapacitEnActivi;
    }

    public void setRecibioCapacitEnActivi(BigInteger recibioCapacitEnActivi) {
        this.recibioCapacitEnActivi = recibioCapacitEnActivi;
    }

    public Date getFechaUltimoPermisoVacas() {
        return fechaUltimoPermisoVacas;
    }

    public void setFechaUltimoPermisoVacas(Date fechaUltimoPermisoVacas) {
        this.fechaUltimoPermisoVacas = fechaUltimoPermisoVacas;
    }

    public Date getFechaUltimoReentrenamiento() {
        return fechaUltimoReentrenamiento;
    }

    public void setFechaUltimoReentrenamiento(Date fechaUltimoReentrenamiento) {
        this.fechaUltimoReentrenamiento = fechaUltimoReentrenamiento;
    }

    public BigInteger getDocumentoIdentifiSiath() {
        return documentoIdentifiSiath;
    }

    public void setDocumentoIdentifiSiath(BigInteger documentoIdentifiSiath) {
        this.documentoIdentifiSiath = documentoIdentifiSiath;
    }

    public AgenteEspecificoProduceLesion getIdAgenteProduceLesion() {
        return idAgenteProduceLesion;
    }

    public void setIdAgenteProduceLesion(AgenteEspecificoProduceLesion idAgenteProduceLesion) {
        this.idAgenteProduceLesion = idAgenteProduceLesion;
    }

    public MecanismoLesion getMecanismoLesion() {
        return mecanismoLesion;
    }

    public void setMecanismoLesion(MecanismoLesion mecanismoLesion) {
        this.mecanismoLesion = mecanismoLesion;
    }

    public PartesCuerpo getIdParteCuerpo() {
        return idParteCuerpo;
    }

    public void setIdParteCuerpo(PartesCuerpo idParteCuerpo) {
        this.idParteCuerpo = idParteCuerpo;
    }

    public TipoNovedadFuerza getIdTipoNovedadFuerza() {
        return idTipoNovedadFuerza;
    }

    public void setIdTipoNovedadFuerza(TipoNovedadFuerza idTipoNovedadFuerza) {
        this.idTipoNovedadFuerza = idTipoNovedadFuerza;
    }

    public Unidad getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Unidad idUnidad) {
        this.idUnidad = idUnidad;
    }

    @XmlTransient
    @JsonIgnore
    public List<InformacionVial> getInformacionVialList() {
        return informacionVialList;
    }

    public void setInformacionVialList(List<InformacionVial> informacionVialList) {
        this.informacionVialList = informacionVialList;
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
    public List<LugarNovedad> getLugarNovedadList() {
        return lugarNovedadList;
    }

    public void setLugarNovedadList(List<LugarNovedad> lugarNovedadList) {
        this.lugarNovedadList = lugarNovedadList;
    }

    @XmlTransient
    @JsonIgnore
    public List<InfoPersonAfectadaPlanta> getInfoPersonAfectadaPlantaList() {
        return infoPersonAfectadaPlantaList;
    }

    public void setInfoPersonAfectadaPlantaList(List<InfoPersonAfectadaPlanta> infoPersonAfectadaPlantaList) {
        this.infoPersonAfectadaPlantaList = infoPersonAfectadaPlantaList;
    }

    @XmlTransient
    @JsonIgnore
    public List<InfoPersonAfectadaOps> getInfoPersonAfectadaOpsList() {
        return infoPersonAfectadaOpsList;
    }

    public void setInfoPersonAfectadaOpsList(List<InfoPersonAfectadaOps> infoPersonAfectadaOpsList) {
        this.infoPersonAfectadaOpsList = infoPersonAfectadaOpsList;
    }

    @XmlTransient
    @JsonIgnore
    public List<CapacitacionesRealizadas> getCapacitacionesRealizadasList() {
        return capacitacionesRealizadasList;
    }

    public void setCapacitacionesRealizadasList(List<CapacitacionesRealizadas> capacitacionesRealizadasList) {
        this.capacitacionesRealizadasList = capacitacionesRealizadasList;
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
    public List<DescripcionNovedadAccidente> getDescripcionNovedadAccidenteList() {
        return descripcionNovedadAccidenteList;
    }

    public void setDescripcionNovedadAccidenteList(List<DescripcionNovedadAccidente> descripcionNovedadAccidenteList) {
        this.descripcionNovedadAccidenteList = descripcionNovedadAccidenteList;
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
        hash += (idNovedadInvestigacion != null ? idNovedadInvestigacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NovedadInvestigacion)) {
            return false;
        }
        NovedadInvestigacion other = (NovedadInvestigacion) object;
        if ((this.idNovedadInvestigacion == null && other.idNovedadInvestigacion != null) || (this.idNovedadInvestigacion != null && !this.idNovedadInvestigacion.equals(other.idNovedadInvestigacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.NovedadInvestigacion[ idNovedadInvestigacion=" + idNovedadInvestigacion + " ]";
    }
    
}
