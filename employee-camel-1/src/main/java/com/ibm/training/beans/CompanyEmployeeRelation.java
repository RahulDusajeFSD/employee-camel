package com.ibm.training.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class CompanyEmployeeRelation {

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CompanyEmployeeRelation(Integer id, String role, String workStatus, String location) {
		super();
		this.id = id;
		this.role = role;
		this.workStatus = workStatus;
		this.location = location;
	}

	public CompanyEmployeeRelation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Id
	Integer id;

	String role;

	String workStatus;

	String location;

}
