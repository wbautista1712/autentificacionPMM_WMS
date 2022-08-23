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
@Table(name = "m_invtypee", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"inv_type_code"})})
@XmlRootElement
public class MInvtypee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "inv_type_code", nullable = false, length = 4)
    private String invTypeCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "inv_type_code_desc", nullable = false, length = 45)
    private String invTypeCodeDesc;

    public MInvtypee() {
    }

    public MInvtypee(String invTypeCode) {
        this.invTypeCode = invTypeCode;
    }

    public MInvtypee(String invTypeCode, String invTypeCodeDesc) {
        this.invTypeCode = invTypeCode;
        this.invTypeCodeDesc = invTypeCodeDesc;
    }

    public String getInvTypeCode() {
        return invTypeCode;
    }

    public void setInvTypeCode(String invTypeCode) {
        this.invTypeCode = invTypeCode;
    }

    public String getInvTypeCodeDesc() {
        return invTypeCodeDesc;
    }

    public void setInvTypeCodeDesc(String invTypeCodeDesc) {
        this.invTypeCodeDesc = invTypeCodeDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invTypeCode != null ? invTypeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MInvtypee)) {
            return false;
        }
        MInvtypee other = (MInvtypee) object;
        if ((this.invTypeCode == null && other.invTypeCode != null) || (this.invTypeCode != null && !this.invTypeCode.equals(other.invTypeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.MInvtypee[ invTypeCode=" + invTypeCode + " ]";
    }
    
}
