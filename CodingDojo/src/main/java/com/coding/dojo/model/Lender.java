package com.coding.dojo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TBL_LEND")
public class Lender {

	@Column(name = "LENDID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lendid;
	
	@Column(name = "FIRSTNAME", nullable = false, length = 20)
	private String firsName;
	
	@Column(name = "LASTNAME", nullable = false, length = 20)
	private String lastName;
	
	@Column(name = "EMAIL", nullable = false, length = 100)
	private String email;
	
	@Column(name = "AMOUNT", nullable = false)
	private float amount;
	
	@Column(name = "PSW", nullable = false, length = 100)
	@JsonIgnore	// Hide the password in the json 
	private String psw;
	
	@Column(name = "NEEDEDFOR", nullable = true, length = 100)
	private String neededFor;
	
	@Column(name = "DESCRIPTION", nullable = true, length = 255)
	private String description;
	
	@Column(name = "TYPEID", nullable = true)
	// Define Lender = 1; Borrower = 0
	private Integer typeId;
	
	public Lender() {
	}
	
	public Lender(Integer lendid, String firsName, String lastName, String email, float amount, String psw,
			String neededFor, String description, Integer typeId) {
		super();
		this.lendid = lendid;
		this.firsName = firsName;
		this.lastName = lastName;
		this.email = email;
		this.amount = amount;
		this.psw = psw;
		this.neededFor = neededFor;
		this.description = description;
		this.typeId = typeId;
	}
	
	public Integer getLendid() {
		return lendid;
	}
	public void setLendid(Integer lendid) {
		this.lendid = lendid;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getNeededFor() {
		return neededFor;
	}
	public void setNeededFor(String neededFor) {
		this.neededFor = neededFor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	
}
