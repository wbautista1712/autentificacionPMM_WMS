package com.cuadratura.backend.apirest.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author PCWILBER
 */
@Entity
@Table(name = "m_tipo_logica")
public class MTipoLogica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_m_TipoLogica")
    private Integer idmTipoLogica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nombreTL")
    private String nombreTL;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;

    public MTipoLogica() {
    }

    public MTipoLogica(Integer idmTipoLogica) {
        this.idmTipoLogica = idmTipoLogica;
    }

    public MTipoLogica(Integer idmTipoLogica, String nombreTL, boolean estado) {
        this.idmTipoLogica = idmTipoLogica;
        this.nombreTL = nombreTL;
        this.estado = estado;
    }

    public Integer getIdmTipoLogica() {
        return idmTipoLogica;
    }

    public void setIdmTipoLogica(Integer idmTipoLogica) {
        this.idmTipoLogica = idmTipoLogica;
    }

    public String getNombreTL() {
        return nombreTL;
    }

    public void setNombreTL(String nombreTL) {
        this.nombreTL = nombreTL;
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
        hash += (idmTipoLogica != null ? idmTipoLogica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MTipoLogica)) {
            return false;
        }
        MTipoLogica other = (MTipoLogica) object;
        if ((this.idmTipoLogica == null && other.idmTipoLogica != null) || (this.idmTipoLogica != null && !this.idmTipoLogica.equals(other.idmTipoLogica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.MTipoLogica[ idmTipoLogica=" + idmTipoLogica + " ]";
    }
    
}
