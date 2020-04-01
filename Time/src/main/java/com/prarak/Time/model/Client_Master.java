package com.prarak.Time.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Client_Master {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long client_ID;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long project_ID;
	private String client_Name;
	private String address;
	private String contact_Person;
	private long contact_Number;
	@ManyToOne
	private Project_Master project_master;
	
	
	public Project_Master getProject_master() {
		return project_master;
	}
	public void setProject_master(Project_Master project_master) {
		this.project_master = project_master;
	}
	public long getClient_ID() {
		return client_ID;
	}
	public void setClient_ID(long client_ID) {
		this.client_ID = client_ID;
	}
	public String getClient_Name() {
		return client_Name;
	}
	public void setClient_Name(String client_Name) {
		this.client_Name = client_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact_Person() {
		return contact_Person;
	}
	public void setContact_Person(String contact_Person) {
		this.contact_Person = contact_Person;
	}
	public long getContact_Number() {
		return contact_Number;
	}
	public void setContact_Number(long contact_Number) {
		this.contact_Number = contact_Number;
	}
	@Override
	public String toString() {
		return "Client_Master [client_ID=" + client_ID + ", client_Name=" + client_Name + ", address=" + address
				+ ", contact_Person=" + contact_Person + ", contact_Number=" + contact_Number + "]";
	}
	
	
}