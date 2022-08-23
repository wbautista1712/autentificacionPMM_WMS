package com.cuadratura.backend.apirest.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "m_orgmstee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MOrgmstee.findAll", query = "SELECT m FROM MOrgmstee m")})
public class MOrgmstee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "org_lvl_child", nullable = false)
    private Integer orgLvlChild;
    @Basic(optional = false)
    @NotNull
    @Column(name = "org_lvl_parent", nullable = false)
    private int orgLvlParent;
    @Column(name = "org_lvl_id")
    private Integer orgLvlId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "org_name_full", nullable = false, length = 200)
    private String orgNameFull;
    @Size(max = 45)
    @Column(name = "org_name_short", length = 45)
    private String orgNameShort;
    @Column(name = "org_lvl_number")
    private Integer orgLvlNumber;
    @Size(max = 10)
    @Column(name = "curr_code", length = 10)
    private String currCode;
    @Size(max = 45)
    @Column(name = "org_is_store", length = 45)
    private String orgIsStore;

    public MOrgmstee() {
    }

    public MOrgmstee(Integer orgLvlChild) {
        this.orgLvlChild = orgLvlChild;
    }

    public MOrgmstee(Integer orgLvlChild, int orgLvlParent, String orgNameFull) {
        this.orgLvlChild = orgLvlChild;
        this.orgLvlParent = orgLvlParent;
        this.orgNameFull = orgNameFull;
    }

    public Integer getOrgLvlChild() {
        return orgLvlChild;
    }

    public void setOrgLvlChild(Integer orgLvlChild) {
        this.orgLvlChild = orgLvlChild;
    }

    public int getOrgLvlParent() {
        return orgLvlParent;
    }

    public void setOrgLvlParent(int orgLvlParent) {
        this.orgLvlParent = orgLvlParent;
    }

    public Integer getOrgLvlId() {
        return orgLvlId;
    }

    public void setOrgLvlId(Integer orgLvlId) {
        this.orgLvlId = orgLvlId;
    }

    public String getOrgNameFull() {
        return orgNameFull;
    }

    public void setOrgNameFull(String orgNameFull) {
        this.orgNameFull = orgNameFull;
    }

    public String getOrgNameShort() {
        return orgNameShort;
    }

    public void setOrgNameShort(String orgNameShort) {
        this.orgNameShort = orgNameShort;
    }

    public Integer getOrgLvlNumber() {
        return orgLvlNumber;
    }

    public void setOrgLvlNumber(Integer orgLvlNumber) {
        this.orgLvlNumber = orgLvlNumber;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public String getOrgIsStore() {
        return orgIsStore;
    }

    public void setOrgIsStore(String orgIsStore) {
        this.orgIsStore = orgIsStore;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orgLvlChild != null ? orgLvlChild.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MOrgmstee)) {
            return false;
        }
        MOrgmstee other = (MOrgmstee) object;
        if ((this.orgLvlChild == null && other.orgLvlChild != null) || (this.orgLvlChild != null && !this.orgLvlChild.equals(other.orgLvlChild))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.MOrgmstee[ orgLvlChild=" + orgLvlChild + " ]";
    }
    
}
