package com.prarak.Time.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_ID;
	private String nick_Name;
	private String address;
	private String city;
	private String state;
	private String country;
	private Long pin_Code;
	private String qualification;
	private String designation;
	public long getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(long user_ID) {
		this.user_ID = user_ID;
	}
	public String getNick_Name() {
		return nick_Name;
	}
	public void setNick_Name(String nick_Name) {
		this.nick_Name = nick_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getPin_Code() {
		return pin_Code;
	}
	public void setPin_Code(Long pin_Code) {
		this.pin_Code = pin_Code;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "User_Details [user_ID=" + user_ID + ", nick_Name=" + nick_Name + ", address=" + address + ", city="
				+ city + ", state=" + state + ", country=" + country + ", pin_Code=" + pin_Code + ", qualification="
				+ qualification + ", designation=" + designation + "]";
	}
	
	
	
	
}