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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PCWILBER
 */
@Entity
@Table(name = "tbl_wms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblWms.findAll", query = "SELECT t FROM TblWms t")})
public class TblWms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTbl_WMS")
    private Integer idTblWMS;
    @Column(name = "nro_carga")
    private Integer nroCarga;
    @Size(max = 14)
    @Column(name = "create_date")
    private String createDate;
    @Size(max = 15)
    @Column(name = "facility_code")
    private String facilityCode;
    @Size(max = 20)
    @Column(name = "company_code")
    private String companyCode;
    @Size(max = 130)
    @Column(name = "item_alternate")
    private String itemAlternate;
    @Size(max = 30)
    @Column(name = "item_part_a")
    private String itemPartA;
    @Size(max = 30)
    @Column(name = "item_part_b")
    private String itemPartB;
    @Size(max = 20)
    @Column(name = "item_part_c")
    private String itemPartC;
    @Size(max = 10)
    @Column(name = "item_part_d")
    private String itemPartD;
    @Size(max = 10)
    @Column(name = "item_part_e")
    private String itemPartE;
    @Size(max = 10)
    @Column(name = "item_part_f")
    private String itemPartF;
    @Size(max = 10)
    @Column(name = "hierarchy1_code")
    private String hierarchy1Code;
    @Size(max = 10)
    @Column(name = "hierarchy2_code")
    private String hierarchy2Code;
    @Size(max = 10)
    @Column(name = "hierarchy3_code")
    private String hierarchy3Code;
    @Size(max = 10)
    @Column(name = "hierarchy4_code")
    private String hierarchy4Code;
    @Size(max = 10)
    @Column(name = "hierarchy5_code")
    private String hierarchy5Code;
    @Size(max = 20)
    @Column(name = "batch_nbr")
    private String batchNbr;
    @Size(max = 30)
    @Column(name = "pre_pack_code")
    private String prePackCode;
    @Size(max = 45)
    @Column(name = "tbl_wmscol")
    private String tblWmscol;
    @Column(name = "pre_pack_ratio")
    private Integer prePackRatio;
    @Column(name = "pre_pack_units")
    private Integer prePackUnits;
    @Column(name = "oblpn_total")
    private Integer oblpnTotal;
    @Column(name = "active_total")
    private Integer activeTotal;
    @Column(name = "active_allocated")
    private Integer activeAllocated;
    @Column(name = "active_allocated_lockcode")
    private Integer activeAllocatedLockcode;
    @Column(name = "active_available")
    private Integer activeAvailable;
    @Column(name = "active_lockcode")
    private Integer activeLockcode;
    @Column(name = "iblpn_total")
    private Integer iblpnTotal;
    @Column(name = "iblpn_allocated")
    private Integer iblpnAllocated;
    @Column(name = "iblpn_allocated_lockcode")
    private Integer iblpnAllocatedLockcode;
    @Column(name = "iblpn_available")
    private Integer iblpnAvailable;
    @Column(name = "iblpn_notverified")
    private Integer iblpnNotverified;
    @Column(name = "iblpn_lockcode")
    private Integer iblpnLockcode;
    @Column(name = "iblpn_lost")
    private Integer iblpnLost;
    @Column(name = "total_allocated")
    private Integer totalAllocated;
    @Column(name = "total_available")
    private Integer totalAvailable;
    @Column(name = "total_inventory")
    private Integer totalInventory;
    @Column(name = "four_wall_inventory")
    private Integer fourWallInventory;
    @Column(name = "open_order_qty")
    private Integer openOrderQty;
    @Size(max = 10)
    @Column(name = "lock_code_1")
    private String lockCode1;
    @Column(name = "lock_code_qty_1")
    private Integer lockCodeQty1;
    @Size(max = 10)
    @Column(name = "lock_code_2")
    private String lockCode2;
    @Column(name = "lock_code_qty_2")
    private Integer lockCodeQty2;
    @Size(max = 10)
    @Column(name = "lock_code_3")
    private String lockCode3;
    @Column(name = "lock_code_qty_3")
    private Integer lockCodeQty3;
    @Size(max = 10)
    @Column(name = "lock_code_4")
    private String lockCode4;
    @Column(name = "lock_code_qty_4")
    private Integer lockCodeQty4;
    @Size(max = 10)
    @Column(name = "lock_code_5")
    private String lockCode5;
    @Column(name = "lock_code_qty_5")
    private Integer lockCodeQty5;
    @Size(max = 10)
    @Column(name = "lock_code_6")
    private String lockCode6;
    @Column(name = "lock_code_qty_6")
    private Integer lockCodeQty6;
    @Size(max = 10)
    @Column(name = "lock_code_7")
    private String lockCode7;
    @Column(name = "lock_code_qty_7")
    private Integer lockCodeQty7;
    @Size(max = 10)
    @Column(name = "lock_code_8")
    private String lockCode8;
    @Column(name = "lock_code_qty_8")
    private Integer lockCodeQty8;
    @Size(max = 10)
    @Column(name = "lock_code_9")
    private String lockCode9;
    @Column(name = "lock_code_qty_9")
    private Integer lockCodeQty9;
    @Size(max = 10)
    @Column(name = "lock_code_10")
    private String lockCode10;
    @Column(name = "lock_code_qty_10")
    private Integer lockCodeQty10;
    @Column(name = "download_date1")
    @Temporal(TemporalType.DATE)
    private Date downloadDate1;
    @Column(name = "error_code")
    private Integer errorCode;
    @Size(max = 500)
    @Column(name = "observacion_error")
    private String observacionError;
    @Column(name = "flg_tipo")
    private Integer flgTipo;

    public TblWms() {
    }

    public TblWms(Integer idTblWMS) {
        this.idTblWMS = idTblWMS;
    }

    public Integer getIdTblWMS() {
        return idTblWMS;
    }

    public void setIdTblWMS(Integer idTblWMS) {
        this.idTblWMS = idTblWMS;
    }

    public Integer getNroCarga() {
        return nroCarga;
    }

    public void setNroCarga(Integer nroCarga) {
        this.nroCarga = nroCarga;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getItemAlternate() {
        return itemAlternate;
    }

    public void setItemAlternate(String itemAlternate) {
        this.itemAlternate = itemAlternate;
    }

    public String getItemPartA() {
        return itemPartA;
    }

    public void setItemPartA(String itemPartA) {
        this.itemPartA = itemPartA;
    }

    public String getItemPartB() {
        return itemPartB;
    }

    public void setItemPartB(String itemPartB) {
        this.itemPartB = itemPartB;
    }

    public String getItemPartC() {
        return itemPartC;
    }

    public void setItemPartC(String itemPartC) {
        this.itemPartC = itemPartC;
    }

    public String getItemPartD() {
        return itemPartD;
    }

    public void setItemPartD(String itemPartD) {
        this.itemPartD = itemPartD;
    }

    public String getItemPartE() {
        return itemPartE;
    }

    public void setItemPartE(String itemPartE) {
        this.itemPartE = itemPartE;
    }

    public String getItemPartF() {
        return itemPartF;
    }

    public void setItemPartF(String itemPartF) {
        this.itemPartF = itemPartF;
    }

    public String getHierarchy1Code() {
        return hierarchy1Code;
    }

    public void setHierarchy1Code(String hierarchy1Code) {
        this.hierarchy1Code = hierarchy1Code;
    }

    public String getHierarchy2Code() {
        return hierarchy2Code;
    }

    public void setHierarchy2Code(String hierarchy2Code) {
        this.hierarchy2Code = hierarchy2Code;
    }

    public String getHierarchy3Code() {
        return hierarchy3Code;
    }

    public void setHierarchy3Code(String hierarchy3Code) {
        this.hierarchy3Code = hierarchy3Code;
    }

    public String getHierarchy4Code() {
        return hierarchy4Code;
    }

    public void setHierarchy4Code(String hierarchy4Code) {
        this.hierarchy4Code = hierarchy4Code;
    }

    public String getHierarchy5Code() {
        return hierarchy5Code;
    }

    public void setHierarchy5Code(String hierarchy5Code) {
        this.hierarchy5Code = hierarchy5Code;
    }

    public String getBatchNbr() {
        return batchNbr;
    }

    public void setBatchNbr(String batchNbr) {
        this.batchNbr = batchNbr;
    }

    public String getPrePackCode() {
        return prePackCode;
    }

    public void setPrePackCode(String prePackCode) {
        this.prePackCode = prePackCode;
    }

    public String getTblWmscol() {
        return tblWmscol;
    }

    public void setTblWmscol(String tblWmscol) {
        this.tblWmscol = tblWmscol;
    }

    public Integer getPrePackRatio() {
        return prePackRatio;
    }

    public void setPrePackRatio(Integer prePackRatio) {
        this.prePackRatio = prePackRatio;
    }

    public Integer getPrePackUnits() {
        return prePackUnits;
    }

    public void setPrePackUnits(Integer prePackUnits) {
        this.prePackUnits = prePackUnits;
    }

    public Integer getOblpnTotal() {
        return oblpnTotal;
    }

    public void setOblpnTotal(Integer oblpnTotal) {
        this.oblpnTotal = oblpnTotal;
    }

    public Integer getActiveTotal() {
        return activeTotal;
    }

    public void setActiveTotal(Integer activeTotal) {
        this.activeTotal = activeTotal;
    }

    public Integer getActiveAllocated() {
        return activeAllocated;
    }

    public void setActiveAllocated(Integer activeAllocated) {
        this.activeAllocated = activeAllocated;
    }

    public Integer getActiveAllocatedLockcode() {
        return activeAllocatedLockcode;
    }

    public void setActiveAllocatedLockcode(Integer activeAllocatedLockcode) {
        this.activeAllocatedLockcode = activeAllocatedLockcode;
    }

    public Integer getActiveAvailable() {
        return activeAvailable;
    }

    public void setActiveAvailable(Integer activeAvailable) {
        this.activeAvailable = activeAvailable;
    }

    public Integer getActiveLockcode() {
        return activeLockcode;
    }

    public void setActiveLockcode(Integer activeLockcode) {
        this.activeLockcode = activeLockcode;
    }

    public Integer getIblpnTotal() {
        return iblpnTotal;
    }

    public void setIblpnTotal(Integer iblpnTotal) {
        this.iblpnTotal = iblpnTotal;
    }

    public Integer getIblpnAllocated() {
        return iblpnAllocated;
    }

    public void setIblpnAllocated(Integer iblpnAllocated) {
        this.iblpnAllocated = iblpnAllocated;
    }

    public Integer getIblpnAllocatedLockcode() {
        return iblpnAllocatedLockcode;
    }

    public void setIblpnAllocatedLockcode(Integer iblpnAllocatedLockcode) {
        this.iblpnAllocatedLockcode = iblpnAllocatedLockcode;
    }

    public Integer getIblpnAvailable() {
        return iblpnAvailable;
    }

    public void setIblpnAvailable(Integer iblpnAvailable) {
        this.iblpnAvailable = iblpnAvailable;
    }

    public Integer getIblpnNotverified() {
        return iblpnNotverified;
    }

    public void setIblpnNotverified(Integer iblpnNotverified) {
        this.iblpnNotverified = iblpnNotverified;
    }

    public Integer getIblpnLockcode() {
        return iblpnLockcode;
    }

    public void setIblpnLockcode(Integer iblpnLockcode) {
        this.iblpnLockcode = iblpnLockcode;
    }

    public Integer getIblpnLost() {
        return iblpnLost;
    }

    public void setIblpnLost(Integer iblpnLost) {
        this.iblpnLost = iblpnLost;
    }

    public Integer getTotalAllocated() {
        return totalAllocated;
    }

    public void setTotalAllocated(Integer totalAllocated) {
        this.totalAllocated = totalAllocated;
    }

    public Integer getTotalAvailable() {
        return totalAvailable;
    }

    public void setTotalAvailable(Integer totalAvailable) {
        this.totalAvailable = totalAvailable;
    }

    public Integer getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(Integer totalInventory) {
        this.totalInventory = totalInventory;
    }

    public Integer getFourWallInventory() {
        return fourWallInventory;
    }

    public void setFourWallInventory(Integer fourWallInventory) {
        this.fourWallInventory = fourWallInventory;
    }

    public Integer getOpenOrderQty() {
        return openOrderQty;
    }

    public void setOpenOrderQty(Integer openOrderQty) {
        this.openOrderQty = openOrderQty;
    }

    public String getLockCode1() {
        return lockCode1;
    }

    public void setLockCode1(String lockCode1) {
        this.lockCode1 = lockCode1;
    }

    public Integer getLockCodeQty1() {
        return lockCodeQty1;
    }

    public void setLockCodeQty1(Integer lockCodeQty1) {
        this.lockCodeQty1 = lockCodeQty1;
    }

    public String getLockCode2() {
        return lockCode2;
    }

    public void setLockCode2(String lockCode2) {
        this.lockCode2 = lockCode2;
    }

    public Integer getLockCodeQty2() {
        return lockCodeQty2;
    }

    public void setLockCodeQty2(Integer lockCodeQty2) {
        this.lockCodeQty2 = lockCodeQty2;
    }

    public String getLockCode3() {
        return lockCode3;
    }

    public void setLockCode3(String lockCode3) {
        this.lockCode3 = lockCode3;
    }

    public Integer getLockCodeQty3() {
        return lockCodeQty3;
    }

    public void setLockCodeQty3(Integer lockCodeQty3) {
        this.lockCodeQty3 = lockCodeQty3;
    }

    public String getLockCode4() {
        return lockCode4;
    }

    public void setLockCode4(String lockCode4) {
        this.lockCode4 = lockCode4;
    }

    public Integer getLockCodeQty4() {
        return lockCodeQty4;
    }

    public void setLockCodeQty4(Integer lockCodeQty4) {
        this.lockCodeQty4 = lockCodeQty4;
    }

    public String getLockCode5() {
        return lockCode5;
    }

    public void setLockCode5(String lockCode5) {
        this.lockCode5 = lockCode5;
    }

    public Integer getLockCodeQty5() {
        return lockCodeQty5;
    }

    public void setLockCodeQty5(Integer lockCodeQty5) {
        this.lockCodeQty5 = lockCodeQty5;
    }

    public String getLockCode6() {
        return lockCode6;
    }

    public void setLockCode6(String lockCode6) {
        this.lockCode6 = lockCode6;
    }

    public Integer getLockCodeQty6() {
        return lockCodeQty6;
    }

    public void setLockCodeQty6(Integer lockCodeQty6) {
        this.lockCodeQty6 = lockCodeQty6;
    }

    public String getLockCode7() {
        return lockCode7;
    }

    public void setLockCode7(String lockCode7) {
        this.lockCode7 = lockCode7;
    }

    public Integer getLockCodeQty7() {
        return lockCodeQty7;
    }

    public void setLockCodeQty7(Integer lockCodeQty7) {
        this.lockCodeQty7 = lockCodeQty7;
    }

    public String getLockCode8() {
        return lockCode8;
    }

    public void setLockCode8(String lockCode8) {
        this.lockCode8 = lockCode8;
    }

    public Integer getLockCodeQty8() {
        return lockCodeQty8;
    }

    public void setLockCodeQty8(Integer lockCodeQty8) {
        this.lockCodeQty8 = lockCodeQty8;
    }

    public String getLockCode9() {
        return lockCode9;
    }

    public void setLockCode9(String lockCode9) {
        this.lockCode9 = lockCode9;
    }

    public Integer getLockCodeQty9() {
        return lockCodeQty9;
    }

    public void setLockCodeQty9(Integer lockCodeQty9) {
        this.lockCodeQty9 = lockCodeQty9;
    }

    public String getLockCode10() {
        return lockCode10;
    }

    public void setLockCode10(String lockCode10) {
        this.lockCode10 = lockCode10;
    }

    public Integer getLockCodeQty10() {
        return lockCodeQty10;
    }

    public void setLockCodeQty10(Integer lockCodeQty10) {
        this.lockCodeQty10 = lockCodeQty10;
    }

    public Date getDownloadDate1() {
        return downloadDate1;
    }

    public void setDownloadDate1(Date downloadDate1) {
        this.downloadDate1 = downloadDate1;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getObservacionError() {
        return observacionError;
    }

    public void setObservacionError(String observacionError) {
        this.observacionError = observacionError;
    }

    public Integer getFlgTipo() {
        return flgTipo;
    }

    public void setFlgTipo(Integer flgTipo) {
        this.flgTipo = flgTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTblWMS != null ? idTblWMS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblWms)) {
            return false;
        }
        TblWms other = (TblWms) object;
        if ((this.idTblWMS == null && other.idTblWMS != null) || (this.idTblWMS != null && !this.idTblWMS.equals(other.idTblWMS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.TblWms[ idTblWMS=" + idTblWMS + " ]";
    }
    
}
