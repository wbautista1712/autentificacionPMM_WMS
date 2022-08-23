package com.cuadratura.backend.apirest.models.entity;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "tbl_pmm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPmm.findAll", query = "SELECT t FROM TblPmm t")})
public class TblPmm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTbl_PMM")
    private Integer idTblPMM;
    @Basic(optional = false)
    @NotNull
    @Column(name = "org_lvl_child")
    private int orgLvlChild;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "trans_lote")
    private String transLote;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "on_hand_qty")
    private BigDecimal onHandQty;
    @Size(max = 45)
    @Column(name = "on_hand_retl")
    private String onHandRetl;
    @Column(name = "on_hand_cost")
    private BigDecimal onHandCost;
    @Column(name = "po_ord_qty")
    private BigDecimal poOrdQty;
    @Column(name = "po_ord_retl")
    private BigDecimal poOrdRetl;
    @Column(name = "po_ord_cost")
    private BigDecimal poOrdCost;
    @Column(name = "po_intrn_qty")
    private BigDecimal poIntrnQty;
    @Column(name = "po_intrn_retl")
    private BigDecimal poIntrnRetl;
    @Column(name = "po_intrn_cost")
    private BigDecimal poIntrnCost;
    @Column(name = "to_ord_qty")
    private BigDecimal toOrdQty;
    @Column(name = "to_ord_retl")
    private BigDecimal toOrdRetl;
    @Column(name = "to_ord_cost")
    private BigDecimal toOrdCost;
    @Column(name = "to_intrn_qty")
    private BigDecimal toIntrnQty;
    @Column(name = "to_intrn_retl")
    private BigDecimal toIntrnRetl;
    @Column(name = "to_intrn_cost")
    private BigDecimal toIntrnCost;
    @Column(name = "first_pis_date")
    private BigDecimal firstPisDate;
    @Column(name = "last_pis_date")
    private BigDecimal lastPisDate;
    @Column(name = "ltd_qty")
    private BigDecimal ltdQty;
    @Column(name = "ltd_retl")
    private BigDecimal ltdRetl;
    @Column(name = "ltd_cost")
    private BigDecimal ltdCost;
    @Size(max = 45)
    @Column(name = "last_chg_date")
    private String lastChgDate;
    @Column(name = "tbl_pmmcol")
    @Temporal(TemporalType.DATE)
    private Date tblPmmcol;
    @Column(name = "on_hand_weight")
    private BigDecimal onHandWeight;
    @Size(max = 6)
    @Column(name = "weight_uom")
    private String weightUom;
    @Column(name = "po_ord_weight")
    private BigDecimal poOrdWeight;
    @Column(name = "po_intrn_weight")
    private BigDecimal poIntrnWeight;
    @Column(name = "to_ord_weight")
    private BigDecimal toOrdWeight;
    @Column(name = "to_intrn_weight")
    private BigDecimal toIntrnWeight;
    @Column(name = "ltd_weight")
    private BigDecimal ltdWeight;
    @Size(max = 6)
    @Column(name = "prd_sll_uom")
    private String prdSllUom;
    @Size(max = 3)
    @Column(name = "curr_code")
    private String currCode;
    @Column(name = "on_hand_eaches")
    private BigDecimal onHandEaches;
    @Column(name = "first_shipped_date")
    @Temporal(TemporalType.DATE)
    private Date firstShippedDate;
    @Column(name = "first_sales_date")
    @Temporal(TemporalType.DATE)
    private Date firstSalesDate;
    @Column(name = "on_hand_cost_hm")
    private BigDecimal onHandCostHm;
    @Column(name = "on_hand_retl_hm")
    private BigDecimal onHandRetlHm;
    @Column(name = "to_intrn_cost_hm")
    private BigDecimal toIntrnCostHm;
    @Column(name = "to_intrn_retl_hm")
    private BigDecimal toIntrnRetlHm;
    @Column(name = "trans_vcto_lote")
    @Temporal(TemporalType.DATE)
    private Date transVctoLote;

    public TblPmm() {
    }

    public TblPmm(Integer idTblPMM) {
        this.idTblPMM = idTblPMM;
    }

    public TblPmm(Integer idTblPMM, int orgLvlChild, String transLote, BigDecimal onHandQty) {
        this.idTblPMM = idTblPMM;
        this.orgLvlChild = orgLvlChild;
        this.transLote = transLote;
        this.onHandQty = onHandQty;
    }

    public Integer getIdTblPMM() {
        return idTblPMM;
    }

    public void setIdTblPMM(Integer idTblPMM) {
        this.idTblPMM = idTblPMM;
    }

    public int getOrgLvlChild() {
        return orgLvlChild;
    }

    public void setOrgLvlChild(int orgLvlChild) {
        this.orgLvlChild = orgLvlChild;
    }

    public String getTransLote() {
        return transLote;
    }

    public void setTransLote(String transLote) {
        this.transLote = transLote;
    }

    public BigDecimal getOnHandQty() {
        return onHandQty;
    }

    public void setOnHandQty(BigDecimal onHandQty) {
        this.onHandQty = onHandQty;
    }

    public String getOnHandRetl() {
        return onHandRetl;
    }

    public void setOnHandRetl(String onHandRetl) {
        this.onHandRetl = onHandRetl;
    }

    public BigDecimal getOnHandCost() {
        return onHandCost;
    }

    public void setOnHandCost(BigDecimal onHandCost) {
        this.onHandCost = onHandCost;
    }

    public BigDecimal getPoOrdQty() {
        return poOrdQty;
    }

    public void setPoOrdQty(BigDecimal poOrdQty) {
        this.poOrdQty = poOrdQty;
    }

    public BigDecimal getPoOrdRetl() {
        return poOrdRetl;
    }

    public void setPoOrdRetl(BigDecimal poOrdRetl) {
        this.poOrdRetl = poOrdRetl;
    }

    public BigDecimal getPoOrdCost() {
        return poOrdCost;
    }

    public void setPoOrdCost(BigDecimal poOrdCost) {
        this.poOrdCost = poOrdCost;
    }

    public BigDecimal getPoIntrnQty() {
        return poIntrnQty;
    }

    public void setPoIntrnQty(BigDecimal poIntrnQty) {
        this.poIntrnQty = poIntrnQty;
    }

    public BigDecimal getPoIntrnRetl() {
        return poIntrnRetl;
    }

    public void setPoIntrnRetl(BigDecimal poIntrnRetl) {
        this.poIntrnRetl = poIntrnRetl;
    }

    public BigDecimal getPoIntrnCost() {
        return poIntrnCost;
    }

    public void setPoIntrnCost(BigDecimal poIntrnCost) {
        this.poIntrnCost = poIntrnCost;
    }

    public BigDecimal getToOrdQty() {
        return toOrdQty;
    }

    public void setToOrdQty(BigDecimal toOrdQty) {
        this.toOrdQty = toOrdQty;
    }

    public BigDecimal getToOrdRetl() {
        return toOrdRetl;
    }

    public void setToOrdRetl(BigDecimal toOrdRetl) {
        this.toOrdRetl = toOrdRetl;
    }

    public BigDecimal getToOrdCost() {
        return toOrdCost;
    }

    public void setToOrdCost(BigDecimal toOrdCost) {
        this.toOrdCost = toOrdCost;
    }

    public BigDecimal getToIntrnQty() {
        return toIntrnQty;
    }

    public void setToIntrnQty(BigDecimal toIntrnQty) {
        this.toIntrnQty = toIntrnQty;
    }

    public BigDecimal getToIntrnRetl() {
        return toIntrnRetl;
    }

    public void setToIntrnRetl(BigDecimal toIntrnRetl) {
        this.toIntrnRetl = toIntrnRetl;
    }

    public BigDecimal getToIntrnCost() {
        return toIntrnCost;
    }

    public void setToIntrnCost(BigDecimal toIntrnCost) {
        this.toIntrnCost = toIntrnCost;
    }

    public BigDecimal getFirstPisDate() {
        return firstPisDate;
    }

    public void setFirstPisDate(BigDecimal firstPisDate) {
        this.firstPisDate = firstPisDate;
    }

    public BigDecimal getLastPisDate() {
        return lastPisDate;
    }

    public void setLastPisDate(BigDecimal lastPisDate) {
        this.lastPisDate = lastPisDate;
    }

    public BigDecimal getLtdQty() {
        return ltdQty;
    }

    public void setLtdQty(BigDecimal ltdQty) {
        this.ltdQty = ltdQty;
    }

    public BigDecimal getLtdRetl() {
        return ltdRetl;
    }

    public void setLtdRetl(BigDecimal ltdRetl) {
        this.ltdRetl = ltdRetl;
    }

    public BigDecimal getLtdCost() {
        return ltdCost;
    }

    public void setLtdCost(BigDecimal ltdCost) {
        this.ltdCost = ltdCost;
    }

    public String getLastChgDate() {
        return lastChgDate;
    }

    public void setLastChgDate(String lastChgDate) {
        this.lastChgDate = lastChgDate;
    }

    public Date getTblPmmcol() {
        return tblPmmcol;
    }

    public void setTblPmmcol(Date tblPmmcol) {
        this.tblPmmcol = tblPmmcol;
    }

    public BigDecimal getOnHandWeight() {
        return onHandWeight;
    }

    public void setOnHandWeight(BigDecimal onHandWeight) {
        this.onHandWeight = onHandWeight;
    }

    public String getWeightUom() {
        return weightUom;
    }

    public void setWeightUom(String weightUom) {
        this.weightUom = weightUom;
    }

    public BigDecimal getPoOrdWeight() {
        return poOrdWeight;
    }

    public void setPoOrdWeight(BigDecimal poOrdWeight) {
        this.poOrdWeight = poOrdWeight;
    }

    public BigDecimal getPoIntrnWeight() {
        return poIntrnWeight;
    }

    public void setPoIntrnWeight(BigDecimal poIntrnWeight) {
        this.poIntrnWeight = poIntrnWeight;
    }

    public BigDecimal getToOrdWeight() {
        return toOrdWeight;
    }

    public void setToOrdWeight(BigDecimal toOrdWeight) {
        this.toOrdWeight = toOrdWeight;
    }

    public BigDecimal getToIntrnWeight() {
        return toIntrnWeight;
    }

    public void setToIntrnWeight(BigDecimal toIntrnWeight) {
        this.toIntrnWeight = toIntrnWeight;
    }

    public BigDecimal getLtdWeight() {
        return ltdWeight;
    }

    public void setLtdWeight(BigDecimal ltdWeight) {
        this.ltdWeight = ltdWeight;
    }

    public String getPrdSllUom() {
        return prdSllUom;
    }

    public void setPrdSllUom(String prdSllUom) {
        this.prdSllUom = prdSllUom;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public BigDecimal getOnHandEaches() {
        return onHandEaches;
    }

    public void setOnHandEaches(BigDecimal onHandEaches) {
        this.onHandEaches = onHandEaches;
    }

    public Date getFirstShippedDate() {
        return firstShippedDate;
    }

    public void setFirstShippedDate(Date firstShippedDate) {
        this.firstShippedDate = firstShippedDate;
    }

    public Date getFirstSalesDate() {
        return firstSalesDate;
    }

    public void setFirstSalesDate(Date firstSalesDate) {
        this.firstSalesDate = firstSalesDate;
    }

    public BigDecimal getOnHandCostHm() {
        return onHandCostHm;
    }

    public void setOnHandCostHm(BigDecimal onHandCostHm) {
        this.onHandCostHm = onHandCostHm;
    }

    public BigDecimal getOnHandRetlHm() {
        return onHandRetlHm;
    }

    public void setOnHandRetlHm(BigDecimal onHandRetlHm) {
        this.onHandRetlHm = onHandRetlHm;
    }

    public BigDecimal getToIntrnCostHm() {
        return toIntrnCostHm;
    }

    public void setToIntrnCostHm(BigDecimal toIntrnCostHm) {
        this.toIntrnCostHm = toIntrnCostHm;
    }

    public BigDecimal getToIntrnRetlHm() {
        return toIntrnRetlHm;
    }

    public void setToIntrnRetlHm(BigDecimal toIntrnRetlHm) {
        this.toIntrnRetlHm = toIntrnRetlHm;
    }

    public Date getTransVctoLote() {
        return transVctoLote;
    }

    public void setTransVctoLote(Date transVctoLote) {
        this.transVctoLote = transVctoLote;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTblPMM != null ? idTblPMM.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPmm)) {
            return false;
        }
        TblPmm other = (TblPmm) object;
        if ((this.idTblPMM == null && other.idTblPMM != null) || (this.idTblPMM != null && !this.idTblPMM.equals(other.idTblPMM))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.TblPmm[ idTblPMM=" + idTblPMM + " ]";
    }
    
}
