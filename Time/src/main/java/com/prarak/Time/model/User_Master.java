package com.prarak.Time.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User_Master {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_ID;
	private String first_Name;
	private String middle_Name;
	private String last_Name;
	private String gender;
	private String dOB;
	private Long mobile_No;
	private String password;
	private String last_Password;
	private String start_Date;
	private String end_Date;
	
	
	public long getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(long user_ID) {
		this.user_ID = user_ID;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getMiddle_Name() {
		return middle_Name;
	}
	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
	}
	public Long getMobile_No() {
		return mobile_No;
	}
	public void setMobile_No(Long mobile_No) {
		this.mobile_No = mobile_No;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLast_Password() {
		return last_Password;
	}
	public void setLast_Password(String last_Password) {
		this.last_Password = last_Password;
	}
	public String getStart_Date() {
		return start_Date;
	}
	public void setStart_Date(String start_Date) {
		this.start_Date = start_Date;
	}
	public String getEnd_Date() {
		return end_Date;
	}
	public void setEnd_Date(String end_Date) {
		this.end_Date = end_Date;
	}
	@Override
	public String toString() {
		return "User_Master [user_ID=" + user_ID + ", first_Name=" + first_Name + ", middle_Name=" + middle_Name
				+ ", last_Name=" + last_Name + ", gender=" + gender + ", dOB=" + dOB + ", mobile_No=" + mobile_No
				+ ", password=" + password + ", last_Password=" + last_Password + ", start_Date=" + start_Date
				+ ", end_Date=" + end_Date + "]";
	}



}