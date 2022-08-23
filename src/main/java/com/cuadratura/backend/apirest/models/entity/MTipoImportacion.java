package com.cuadratura.backend.apirest.models.entity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PCWILBER
 */
@Entity
@Table(name = "m_tipo_importacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MTipoImportacion.findAll", query = "SELECT m FROM MTipoImportacion m")})
public class MTipoImportacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_m_TipoImportacion")
    private Integer idmTipoImportacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreTI")
    private String nombreTI;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;

    public MTipoImportacion() {
    }

    public MTipoImportacion(Integer idmTipoImportacion) {
        this.idmTipoImportacion = idmTipoImportacion;
    }

    public MTipoImportacion(Integer idmTipoImportacion, String nombreTI, boolean estado) {
        this.idmTipoImportacion = idmTipoImportacion;
        this.nombreTI = nombreTI;
        this.estado = estado;
    }

    public Integer getIdmTipoImportacion() {
        return idmTipoImportacion;
    }

    public void setIdmTipoImportacion(Integer idmTipoImportacion) {
        this.idmTipoImportacion = idmTipoImportacion;
    }

    public String getNombreTI() {
        return nombreTI;
    }

    public void setNombreTI(String nombreTI) {
        this.nombreTI = nombreTI;
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
        hash += (idmTipoImportacion != null ? idmTipoImportacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MTipoImportacion)) {
            return false;
        }
        MTipoImportacion other = (MTipoImportacion) object;
        if ((this.idmTipoImportacion == null && other.idmTipoImportacion != null) || (this.idmTipoImportacion != null && !this.idmTipoImportacion.equals(other.idmTipoImportacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.MTipoImportacion[ idmTipoImportacion=" + idmTipoImportacion + " ]";
    }
    
}
