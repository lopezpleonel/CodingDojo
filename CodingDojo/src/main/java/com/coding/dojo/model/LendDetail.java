package com.coding.dojo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_LEND_DETAIL")
public class LendDetail {

	@Column(name = "LENDDETAILID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lendDetailId;
	
	@Column(name = "LENDID")
	private Integer lendid;
	
	@Column(name = "LEND_DATE", nullable = true)
	private Date lend_date;

	@Column(name = "AMOUNT", nullable = false)
	private float amount;
	
	@Column(name = "BORROWID")	
	private Integer borrowid;
	
	public LendDetail() {
	}
	
	public LendDetail(Integer lendDetailId, Integer lendid, Date lend_date, float amount, Integer borrowid) {
		super();
		this.lendDetailId = lendDetailId;
		this.lendid = lendid;
		this.lend_date = lend_date;
		this.amount = amount;
		this.borrowid = borrowid;
	}
	
	public Integer getLendDetailId() {
		return lendDetailId;
	}
	public void setLendDetailId(Integer lendDetailId) {
		this.lendDetailId = lendDetailId;
	}
	public Integer getLendid() {
		return lendid;
	}
	public void setLendid(Integer lendid) {
		this.lendid = lendid;
	}
	public Date getLend_date() {
		return lend_date;
	}
	public void setLend_date(Date lend_date) {
		this.lend_date = lend_date;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Integer getBorrowid() {
		return borrowid;
	}
	public void setBorrowid(Integer borrowid) {
		this.borrowid = borrowid;
	}

}
