package com.cuadratura.backend.apirest.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
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

@Table(name = "m_estado_cuadratura")
public class MEstadoCuadratura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_m_estadoCuadratura", nullable = false)
    private Integer idmestadoCuadratura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreEC", nullable = false, length = 45)
    private String nombreEC;

    public MEstadoCuadratura() {
    }

    public MEstadoCuadratura(Integer idmestadoCuadratura) {
        this.idmestadoCuadratura = idmestadoCuadratura;
    }

    public MEstadoCuadratura(Integer idmestadoCuadratura, String nombreEC) {
        this.idmestadoCuadratura = idmestadoCuadratura;
        this.nombreEC = nombreEC;
    }

    public Integer getIdmestadoCuadratura() {
        return idmestadoCuadratura;
    }

    public void setIdmestadoCuadratura(Integer idmestadoCuadratura) {
        this.idmestadoCuadratura = idmestadoCuadratura;
    }

    public String getNombreEC() {
        return nombreEC;
    }

    public void setNombreEC(String nombreEC) {
        this.nombreEC = nombreEC;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmestadoCuadratura != null ? idmestadoCuadratura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MEstadoCuadratura)) {
            return false;
        }
        MEstadoCuadratura other = (MEstadoCuadratura) object;
        if ((this.idmestadoCuadratura == null && other.idmestadoCuadratura != null) || (this.idmestadoCuadratura != null && !this.idmestadoCuadratura.equals(other.idmestadoCuadratura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.MEstadoCuadratura[ idmestadoCuadratura=" + idmestadoCuadratura + " ]";
    }
    
}
