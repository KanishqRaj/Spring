package com.example.Project_1.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DInfo")
public class Donorinfo {
	
	@Id
	@Column(name="ID")
	private int donorid;
	@Column(name="Name")
	private String donorname;
	@Column(name="BloodGroup")
	private String donorbloodgroup;
	@Column(name="Age")
	private int donorage;
	@Column(name="MobileNumber")
	private String donormobno;
	@Column(name="Address")
	private String donoraddress;
	@Column(name="Email-ID")
	private String donoremail;
	@Column(name="Availability")
	private String donoravailablility;
	@Column (name="Sex")
	private String donorsex;
	public int getDonorid() {
		return donorid;
	}
	public void setDonorid(int donorid) {
		this.donorid = donorid;
	}
	public String getDonorname() {
		return donorname;
	}
	public void setDonorname(String donorname) {
		this.donorname = donorname;
	}
	public String getDonorbloodgroup() {
		return donorbloodgroup;
	}
	public void setDonorbloodgroup(String donorbloodgroup) {
		this.donorbloodgroup = donorbloodgroup;
	}
	public int getDonorage() {
		return donorage;
	}
	public void setDonorage(int donorage) {
		this.donorage = donorage;
	}
	public String getDonormobno() {
		return donormobno;
	}
	public void setDonormobno(String donormobno) {
		this.donormobno = donormobno;
	}
	public String getDonoraddress() {
		return donoraddress;
	}
	public void setDonoraddress(String donoraddress) {
		this.donoraddress = donoraddress;
	}
	public String getDonoremail() {
		return donoremail;
	}
	public void setDonoremail(String donoremail) {
		this.donoremail = donoremail;
	}
	public String getDonoravailablility() {
		return donoravailablility;
	}
	public void setDonoravailablility(String donoravailablility) {
		this.donoravailablility = donoravailablility;
	}
	public String getDonorsex() {
		return donorsex;
	}
	public void setDonorsex(String donorsex) {
		this.donorsex = donorsex;
	}
	
	
	
}