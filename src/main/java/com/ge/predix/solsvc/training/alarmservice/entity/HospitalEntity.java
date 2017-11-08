package com.ge.predix.solsvc.training.alarmservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOSPITAL")
public class HospitalEntity implements Serializable {
	
	 private static final long serialVersionUID = 1L;
	 
	 @Id
	 @GeneratedValue
	 @Column(name = "HOSPITAL_ID") private long hospitalID;
	 @Column(name = "HOSPITAL_NAME")private String hospitalName;
	 @Column(name = "ADDRESS")private String address;
	 @Column(name = "EMAIL")private String email;
	 @Column(name = "PHONE")private String phone;
	 
	 
	public long getHospitalID() {
		return hospitalID;
	}
	public void setHospitalID(long hospitalID) {
		this.hospitalID = hospitalID;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
