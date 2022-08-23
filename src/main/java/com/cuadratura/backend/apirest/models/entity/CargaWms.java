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
@Table(name = "carga_wms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CargaWms.findAll", query = "SELECT c FROM CargaWms c")})
public class CargaWms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCarga_WMS")
    private Integer idCargaWMS;
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
    @Column(name = "num_registros")
    private int numRegistros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "usuario_carga")
    private String usuarioCarga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;

    public CargaWms() {
    }

    public CargaWms(Integer idCargaWMS) {
        this.idCargaWMS = idCargaWMS;
    }

    public CargaWms(Integer idCargaWMS, Date fechaCarga, String horaCarga, int numRegistros, String usuarioCarga, boolean estado) {
        this.idCargaWMS = idCargaWMS;
        this.fechaCarga = fechaCarga;
        this.horaCarga = horaCarga;
        this.numRegistros = numRegistros;
        this.usuarioCarga = usuarioCarga;
        this.estado = estado;
    }

    public Integer getIdCargaWMS() {
        return idCargaWMS;
    }

    public void setIdCargaWMS(Integer idCargaWMS) {
        this.idCargaWMS = idCargaWMS;
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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCargaWMS != null ? idCargaWMS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargaWms)) {
            return false;
        }
        CargaWms other = (CargaWms) object;
        if ((this.idCargaWMS == null && other.idCargaWMS != null) || (this.idCargaWMS != null && !this.idCargaWMS.equals(other.idCargaWMS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.CargaWms[ idCargaWMS=" + idCargaWMS + " ]";
    }
    
}
