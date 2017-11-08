package com.ge.predix.solsvc.training.alarmservice.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HospitalDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long hospitalID;
	private String hospitalName;
	private String address;
	private String email;
	private String phone;
	
	
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
