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
@Table(name = "tbl_pmm_wms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPmmWms.findAll", query = "SELECT t FROM TblPmmWms t")})
public class TblPmmWms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tbl_pmm_wms")
    private Integer idTblPmmWms;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_match")
    @Temporal(TemporalType.DATE)
    private Date fechaMatch;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "hora_match")
    private String horaMatch;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mat_prd_lvl_child")
    private int matPrdLvlChild;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cd_org_lvl_child")
    private int cdOrgLvlChild;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "trans_lote")
    private String transLote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmm_tipo_inv_1_2")
    private int pmmTipoInv12;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmm_tipo_inv_4")
    private int pmmTipoInv4;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmm_tipo_inv_5")
    private int pmmTipoInv5;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmm_tipo_inv_6")
    private int pmmTipoInv6;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmm_tipo_inv_7")
    private int pmmTipoInv7;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmm_tipo_inv_8")
    private int pmmTipoInv8;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmm_tipo_inv_12")
    private int pmmTipoInv121;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmm_tipo_inv_13")
    private int pmmTipoInv13;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmm_cant_registros")
    private int pmmCantRegistros;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wms_tipo_1_2")
    private int wmsTipo12;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wms_tipo_4_PU")
    private int wmstipo4PU;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wms_tipo_5_PA_PD")
    private int wmstipo5PAPD;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wms_tipo_6_AC_QC")
    private int wmstipo6ACQC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wms_tipo_7_CJ")
    private int wmstipo7CJ;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wms_tipo_8_BJ")
    private int wmstipo8BJ;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wms_tipo_12_EC")
    private int wmstipo12EC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wms_tipo_13_EB")
    private int wmstipo13EB;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wms_cant_registros")
    private int wmsCantRegistros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "comentario")
    private String comentario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;

    public TblPmmWms() {
    }

    public TblPmmWms(Integer idTblPmmWms) {
        this.idTblPmmWms = idTblPmmWms;
    }

    public TblPmmWms(Integer idTblPmmWms, Date fechaMatch, String horaMatch, int matPrdLvlChild, int cdOrgLvlChild, String transLote, int pmmTipoInv12, int pmmTipoInv4, int pmmTipoInv5, int pmmTipoInv6, int pmmTipoInv7, int pmmTipoInv8, int pmmTipoInv121, int pmmTipoInv13, int pmmCantRegistros, int wmsTipo12, int wmstipo4PU, int wmstipo5PAPD, int wmstipo6ACQC, int wmstipo7CJ, int wmstipo8BJ, int wmstipo12EC, int wmstipo13EB, int wmsCantRegistros, String comentario, boolean estado) {
        this.idTblPmmWms = idTblPmmWms;
        this.fechaMatch = fechaMatch;
        this.horaMatch = horaMatch;
        this.matPrdLvlChild = matPrdLvlChild;
        this.cdOrgLvlChild = cdOrgLvlChild;
        this.transLote = transLote;
        this.pmmTipoInv12 = pmmTipoInv12;
        this.pmmTipoInv4 = pmmTipoInv4;
        this.pmmTipoInv5 = pmmTipoInv5;
        this.pmmTipoInv6 = pmmTipoInv6;
        this.pmmTipoInv7 = pmmTipoInv7;
        this.pmmTipoInv8 = pmmTipoInv8;
        this.pmmTipoInv121 = pmmTipoInv121;
        this.pmmTipoInv13 = pmmTipoInv13;
        this.pmmCantRegistros = pmmCantRegistros;
        this.wmsTipo12 = wmsTipo12;
        this.wmstipo4PU = wmstipo4PU;
        this.wmstipo5PAPD = wmstipo5PAPD;
        this.wmstipo6ACQC = wmstipo6ACQC;
        this.wmstipo7CJ = wmstipo7CJ;
        this.wmstipo8BJ = wmstipo8BJ;
        this.wmstipo12EC = wmstipo12EC;
        this.wmstipo13EB = wmstipo13EB;
        this.wmsCantRegistros = wmsCantRegistros;
        this.comentario = comentario;
        this.estado = estado;
    }

    public Integer getIdTblPmmWms() {
        return idTblPmmWms;
    }

    public void setIdTblPmmWms(Integer idTblPmmWms) {
        this.idTblPmmWms = idTblPmmWms;
    }

    public Date getFechaMatch() {
        return fechaMatch;
    }

    public void setFechaMatch(Date fechaMatch) {
        this.fechaMatch = fechaMatch;
    }

    public String getHoraMatch() {
        return horaMatch;
    }

    public void setHoraMatch(String horaMatch) {
        this.horaMatch = horaMatch;
    }

    public int getMatPrdLvlChild() {
        return matPrdLvlChild;
    }

    public void setMatPrdLvlChild(int matPrdLvlChild) {
        this.matPrdLvlChild = matPrdLvlChild;
    }

    public int getCdOrgLvlChild() {
        return cdOrgLvlChild;
    }

    public void setCdOrgLvlChild(int cdOrgLvlChild) {
        this.cdOrgLvlChild = cdOrgLvlChild;
    }

    public String getTransLote() {
        return transLote;
    }

    public void setTransLote(String transLote) {
        this.transLote = transLote;
    }

    public int getPmmTipoInv12() {
        return pmmTipoInv12;
    }

    public void setPmmTipoInv12(int pmmTipoInv12) {
        this.pmmTipoInv12 = pmmTipoInv12;
    }

    public int getPmmTipoInv4() {
        return pmmTipoInv4;
    }

    public void setPmmTipoInv4(int pmmTipoInv4) {
        this.pmmTipoInv4 = pmmTipoInv4;
    }

    public int getPmmTipoInv5() {
        return pmmTipoInv5;
    }

    public void setPmmTipoInv5(int pmmTipoInv5) {
        this.pmmTipoInv5 = pmmTipoInv5;
    }

    public int getPmmTipoInv6() {
        return pmmTipoInv6;
    }

    public void setPmmTipoInv6(int pmmTipoInv6) {
        this.pmmTipoInv6 = pmmTipoInv6;
    }

    public int getPmmTipoInv7() {
        return pmmTipoInv7;
    }

    public void setPmmTipoInv7(int pmmTipoInv7) {
        this.pmmTipoInv7 = pmmTipoInv7;
    }

    public int getPmmTipoInv8() {
        return pmmTipoInv8;
    }

    public void setPmmTipoInv8(int pmmTipoInv8) {
        this.pmmTipoInv8 = pmmTipoInv8;
    }

    public int getPmmTipoInv121() {
        return pmmTipoInv121;
    }

    public void setPmmTipoInv121(int pmmTipoInv121) {
        this.pmmTipoInv121 = pmmTipoInv121;
    }

    public int getPmmTipoInv13() {
        return pmmTipoInv13;
    }

    public void setPmmTipoInv13(int pmmTipoInv13) {
        this.pmmTipoInv13 = pmmTipoInv13;
    }

    public int getPmmCantRegistros() {
        return pmmCantRegistros;
    }

    public void setPmmCantRegistros(int pmmCantRegistros) {
        this.pmmCantRegistros = pmmCantRegistros;
    }

    public int getWmsTipo12() {
        return wmsTipo12;
    }

    public void setWmsTipo12(int wmsTipo12) {
        this.wmsTipo12 = wmsTipo12;
    }

    public int getWmstipo4PU() {
        return wmstipo4PU;
    }

    public void setWmstipo4PU(int wmstipo4PU) {
        this.wmstipo4PU = wmstipo4PU;
    }

    public int getWmstipo5PAPD() {
        return wmstipo5PAPD;
    }

    public void setWmstipo5PAPD(int wmstipo5PAPD) {
        this.wmstipo5PAPD = wmstipo5PAPD;
    }

    public int getWmstipo6ACQC() {
        return wmstipo6ACQC;
    }

    public void setWmstipo6ACQC(int wmstipo6ACQC) {
        this.wmstipo6ACQC = wmstipo6ACQC;
    }

    public int getWmstipo7CJ() {
        return wmstipo7CJ;
    }

    public void setWmstipo7CJ(int wmstipo7CJ) {
        this.wmstipo7CJ = wmstipo7CJ;
    }

    public int getWmstipo8BJ() {
        return wmstipo8BJ;
    }

    public void setWmstipo8BJ(int wmstipo8BJ) {
        this.wmstipo8BJ = wmstipo8BJ;
    }

    public int getWmstipo12EC() {
        return wmstipo12EC;
    }

    public void setWmstipo12EC(int wmstipo12EC) {
        this.wmstipo12EC = wmstipo12EC;
    }

    public int getWmstipo13EB() {
        return wmstipo13EB;
    }

    public void setWmstipo13EB(int wmstipo13EB) {
        this.wmstipo13EB = wmstipo13EB;
    }

    public int getWmsCantRegistros() {
        return wmsCantRegistros;
    }

    public void setWmsCantRegistros(int wmsCantRegistros) {
        this.wmsCantRegistros = wmsCantRegistros;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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
        hash += (idTblPmmWms != null ? idTblPmmWms.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPmmWms)) {
            return false;
        }
        TblPmmWms other = (TblPmmWms) object;
        if ((this.idTblPmmWms == null && other.idTblPmmWms != null) || (this.idTblPmmWms != null && !this.idTblPmmWms.equals(other.idTblPmmWms))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cuadratura.mavenproject2.TblPmmWms[ idTblPmmWms=" + idTblPmmWms + " ]";
    }
    
}
