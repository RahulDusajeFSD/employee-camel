package com.ibm.training.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class EmployeeBasicInfo {

	String name;

	@Id
	Integer id;

	Float salary;

	public EmployeeBasicInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	String role;

	@Override
	public String toString() {
		return "EmployeeBasicInfo [name=" + name + ", id=" + id + ", salary=" + salary + ", role=" + role + "]";
	}

	public EmployeeBasicInfo(String name, Integer id, Float salary, String role) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.role = role;
	}
	
	

}
