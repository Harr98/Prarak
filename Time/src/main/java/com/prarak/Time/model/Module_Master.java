package com.prarak.Time.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Module_Master {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long module_ID;
	private String module_Name;
	private String module_Specification;
	private long project_ID;
	public long getModule_ID() {
		return module_ID;
	}
	public void setModule_ID(long module_ID) {
		this.module_ID = module_ID;
	}
	public String getModule_Name() {
		return module_Name;
	}
	public void setModule_Name(String module_Name) {
		this.module_Name = module_Name;
	}
	public String getModule_Specification() {
		return module_Specification;
	}
	public void setModule_Specification(String module_Specification) {
		this.module_Specification = module_Specification;
	}
	public long getProject_ID() {
		return project_ID;
	}
	public void setProject_ID(long project_ID) {
		this.project_ID = project_ID;
	}
	@Override
	public String toString() {
		return "Module_Master [module_ID=" + module_ID + ", module_Name=" + module_Name + ", module_Specification="
				+ module_Specification + ", project_ID=" + project_ID + "]";
	}
	
	
}
