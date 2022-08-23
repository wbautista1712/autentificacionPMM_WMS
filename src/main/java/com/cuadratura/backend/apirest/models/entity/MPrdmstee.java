package com.cuadratura.backend.apirest.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PCWILBER
 */
@MappedSuperclass
@Table(name = "m_prdmstee", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"prd_lvl_child"})})
@XmlRootElement
public class MPrdmstee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "prd_lvl_child", nullable = false)
    private Integer prdLvlChild;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prd_lvl_parent", nullable = false)
    private int prdLvlParent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prd_lvl_id", nullable = false)
    private int prdLvlId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "prd_name_full", nullable = false, length = 200)
    private String prdNameFull;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado", nullable = false)
    private boolean estado;

    public MPrdmstee() {
    }

    public MPrdmstee(Integer prdLvlChild) {
        this.prdLvlChild = prdLvlChild;
    }

    public MPrdmstee(Integer prdLvlChild, int prdLvlParent, int prdLvlId, String prdNameFull, boolean estado) {
        this.prdLvlChild = prdLvlChild;
        this.prdLvlParent = prdLvlParent;
        this.prdLvlId = prdLvlId;
        this.prdNameFull = prdNameFull;
        this.estado = estado;
    }

    public Integer getPrdLvlChild() {
        return prdLvlChild;
    }

    public void setPrdLvlChild(Integer prdLvlChild) {
        this.prdLvlChild = prdLvlChild;
    }

    public int getPrdLvlParent() {
        return prdLvlParent;
    }

    public void setPrdLvlParent(int prdLvlParent) {
        this.prdLvlParent = prdLvlParent;
    }

    public int getPrdLvlId() {
        return prdLvlId;
    }

    public void setPrdLvlId(int prdLvlId) {
        this.prdLvlId = prdLvlId;
    }

    public String getPrdNameFull() {
        return prdNameFull;
    }

    public void setPrdNameFull(String prdNameFull) {
        this.prdNameFull = prdNameFull;
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
        hash += (prdLvlChild != null ? prdLvlChild.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MPrdmstee)) {
            return false;
        }
        MPrdmstee other = (MPrdmstee) object;
        if ((this.prdLvlChild == null && other.prdLvlChild != null) || (this.prdLvlChild != null && !this.prdLvlChild.equals(other.prdLvlChild))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.MPrdmstee[ prdLvlChild=" + prdLvlChild + " ]";
    }
    
}
