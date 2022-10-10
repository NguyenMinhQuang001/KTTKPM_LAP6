package com.example.DemoQuanlychuyenbaySBAMQ.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {

	@Id
	@Column(name = "macb", length = 5, nullable = false)
	private String maCb;

	@Column(name = "ga_di", length = 50)
	private String gaDi;

	@Column(name = "ga_den", length = 50)
	private String gaDen;

	@Column(name = "do_dai")
	private int doDai;

	@Column(name = "gio_di")
	private Date gioDi;

	@Column(name = "gio_den")
	private Date gioDen;

	@Column(name = "chi_phi")
	private int chiPhi;

	public String getMaCb() {
		return maCb;
	}

	public void setMaCb(String maCb) {
		this.maCb = maCb;
	}

	public String getGaDi() {
		return gaDi;
	}

	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}

	public String getGaDen() {
		return gaDen;
	}

	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}

	public int getDoDai() {
		return doDai;
	}

	public void setDoDai(int doDai) {
		this.doDai = doDai;
	}

	public Date getGioDi() {
		return gioDi;
	}

	public void setGioDi(Date gioDi) {
		this.gioDi = gioDi;
	}

	public Date getGioDen() {
		return gioDen;
	}

	public void setGioDen(Date gioDen) {
		this.gioDen = gioDen;
	}

	public int getChiPhi() {
		return chiPhi;
	}

	public void setChiPhi(int chiPhi) {
		this.chiPhi = chiPhi;
	}

	public ChuyenBay(String maCb, String gaDi, String gaDen, int doDai, Date gioDi, Date gioDen, int chiPhi) {
		super();
		this.maCb = maCb;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.doDai = doDai;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.chiPhi = chiPhi;
	}

	public ChuyenBay() {
		super();
	}

	@Override
	public String toString() {
		return "ChuyenBay [maCb=" + maCb + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}

}
