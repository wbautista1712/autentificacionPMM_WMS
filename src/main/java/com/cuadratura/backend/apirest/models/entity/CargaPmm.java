package com.cuadratura.backend.apirest.models.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * @author PCWILBER
 */
@Entity
@Table(name = "carga_pmm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CargaPmm.findAll", query = "SELECT c FROM CargaPmm c"),
    @NamedQuery(name = "CargaPmm.findByIdCargaPMM", query = "SELECT c FROM CargaPmm c WHERE c.idCargaPMM = :idCargaPMM")})
public class CargaPmm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCarga_PMM")
    private Integer idCargaPMM;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaCarga")
    @Temporal(TemporalType.DATE)
    private Date fechaCarga;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "horaCarga")
    private String horaCarga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numRegistros")
    private int numRegistros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "usuarioCarga")
    private String usuarioCarga;
    @Size(max = 200)
    @Column(name = "nombreArchivo")
    private String nombreArchivo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_m_estadoCuadratura")
    private int idmestadoCuadratura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "org_lvl_child")
    private int orgLvlChild;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_m_TipoImportacion")
    private int idmTipoImportacion;

    public CargaPmm() {
    }

    public CargaPmm(Integer idCargaPMM) {
        this.idCargaPMM = idCargaPMM;
    }

    public CargaPmm(Integer idCargaPMM, Date fechaCarga, String horaCarga, int numRegistros, String usuarioCarga, boolean estado, int idmestadoCuadratura, int orgLvlChild, int idmTipoImportacion) {
        this.idCargaPMM = idCargaPMM;
        this.fechaCarga = fechaCarga;
        this.horaCarga = horaCarga;
        this.numRegistros = numRegistros;
        this.usuarioCarga = usuarioCarga;
        this.estado = estado;
        this.idmestadoCuadratura = idmestadoCuadratura;
        this.orgLvlChild = orgLvlChild;
        this.idmTipoImportacion = idmTipoImportacion;
    }

    public Integer getIdCargaPMM() {
        return idCargaPMM;
    }

    public void setIdCargaPMM(Integer idCargaPMM) {
        this.idCargaPMM = idCargaPMM;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public String getHoraCarga() {
        return horaCarga;
    }

    public void setHoraCarga(String horaCarga) {
        this.horaCarga = horaCarga;
    }

    public int getNumRegistros() {
        return numRegistros;
    }

    public void setNumRegistros(int numRegistros) {
        this.numRegistros = numRegistros;
    }

    public String getUsuarioCarga() {
        return usuarioCarga;
    }

    public void setUsuarioCarga(String usuarioCarga) {
        this.usuarioCarga = usuarioCarga;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdmestadoCuadratura() {
        return idmestadoCuadratura;
    }

    public void setIdmestadoCuadratura(int idmestadoCuadratura) {
        this.idmestadoCuadratura = idmestadoCuadratura;
    }

    public int getOrgLvlChild() {
        return orgLvlChild;
    }

    public void setOrgLvlChild(int orgLvlChild) {
        this.orgLvlChild = orgLvlChild;
    }

    public int getIdmTipoImportacion() {
        return idmTipoImportacion;
    }

    public void setIdmTipoImportacion(int idmTipoImportacion) {
        this.idmTipoImportacion = idmTipoImportacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCargaPMM != null ? idCargaPMM.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargaPmm)) {
            return false;
        }
        CargaPmm other = (CargaPmm) object;
        if ((this.idCargaPMM == null && other.idCargaPMM != null) || (this.idCargaPMM != null && !this.idCargaPMM.equals(other.idCargaPMM))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.CargaPmm[ idCargaPMM=" + idCargaPMM + " ]";
    }
    
}
