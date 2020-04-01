package com.prarak.Time.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project_Master {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long project_ID;
	private String project_Name;
	private String start_Date;
	private String completion_Date;
	private long client_id;
	private String task_specification;
	
	
	public long getProject_ID() {
		return project_ID;
	}
	public void setProject_ID(long project_ID) {
		this.project_ID = project_ID;
	}
	public String getProject_Name() {
		return project_Name;
	}
	public void setProject_Name(String project_Name) {
		this.project_Name = project_Name;
	}
	public String getStart_Date() {
		return start_Date;
	}
	public void setStart_Date(String start_Date) {
		this.start_Date = start_Date;
	}
	public String getCompletion_Date() {
		return completion_Date;
	}
	public void setCompletion_Date(String completion_Date) {
		this.completion_Date = completion_Date;
	}
	public long getClient_id() {
		return client_id;
	}
	public void setClient_id(long client_id) {
		this.client_id = client_id;
	}
	public String getTask_specification() {
		return task_specification;
	}
	public void setTask_specification(String task_specification) {
		this.task_specification = task_specification;
	}
	@Override
	public String toString() {
		return "Project_Master [project_ID=" + project_ID + ", project_Name=" + project_Name + ", start_Date="
				+ start_Date + ", completion_Date=" + completion_Date + ", client_id=" + client_id
				+ ", task_specification=" + task_specification + "]";
	}
	
	
}