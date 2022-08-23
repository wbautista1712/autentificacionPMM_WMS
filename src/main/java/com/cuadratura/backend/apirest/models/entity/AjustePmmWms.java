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
@Table(name = "ajuste_pmm_wms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AjustePmmWms.findAll", query = "SELECT a FROM AjustePmmWms a")})
public class AjustePmmWms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAjuste_PMM_WMS")
    private Integer idAjustePMMWMS;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaAjuste")
    @Temporal(TemporalType.DATE)
    private Date fechaAjuste;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "horaAjuste")
    private String horaAjuste;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "loteInicial")
    private String loteInicial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "loteTraspaso")
    private String loteTraspaso;
    @Column(name = "cantTraspaso")
    private Integer cantTraspaso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEstado_cuadratura")
    private int idEstadocuadratura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;

    public AjustePmmWms() {
    }

    public AjustePmmWms(Integer idAjustePMMWMS) {
        this.idAjustePMMWMS = idAjustePMMWMS;
    }

    public AjustePmmWms(Integer idAjustePMMWMS, Date fechaAjuste, String horaAjuste, String loteInicial, String loteTraspaso, int idEstadocuadratura, boolean estado) {
        this.idAjustePMMWMS = idAjustePMMWMS;
        this.fechaAjuste = fechaAjuste;
        this.horaAjuste = horaAjuste;
        this.loteInicial = loteInicial;
        this.loteTraspaso = loteTraspaso;
        this.idEstadocuadratura = idEstadocuadratura;
        this.estado = estado;
    }

    public Integer getIdAjustePMMWMS() {
        return idAjustePMMWMS;
    }

    public void setIdAjustePMMWMS(Integer idAjustePMMWMS) {
        this.idAjustePMMWMS = idAjustePMMWMS;
    }

    public Date getFechaAjuste() {
        return fechaAjuste;
    }

    public void setFechaAjuste(Date fechaAjuste) {
        this.fechaAjuste = fechaAjuste;
    }

    public String getHoraAjuste() {
        return horaAjuste;
    }

    public void setHoraAjuste(String horaAjuste) {
        this.horaAjuste = horaAjuste;
    }

    public String getLoteInicial() {
        return loteInicial;
    }

    public void setLoteInicial(String loteInicial) {
        this.loteInicial = loteInicial;
    }

    public String getLoteTraspaso() {
        return loteTraspaso;
    }

    public void setLoteTraspaso(String loteTraspaso) {
        this.loteTraspaso = loteTraspaso;
    }

    public Integer getCantTraspaso() {
        return cantTraspaso;
    }

    public void setCantTraspaso(Integer cantTraspaso) {
        this.cantTraspaso = cantTraspaso;
    }

    public int getIdEstadocuadratura() {
        return idEstadocuadratura;
    }

    public void setIdEstadocuadratura(int idEstadocuadratura) {
        this.idEstadocuadratura = idEstadocuadratura;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAjustePMMWMS != null ? idAjustePMMWMS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AjustePmmWms)) {
            return false;
        }
        AjustePmmWms other = (AjustePmmWms) object;
        if ((this.idAjustePMMWMS == null && other.idAjustePMMWMS != null) || (this.idAjustePMMWMS != null && !this.idAjustePMMWMS.equals(other.idAjustePMMWMS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.AjustePmmWms[ idAjustePMMWMS=" + idAjustePMMWMS + " ]";
    }
    
}
