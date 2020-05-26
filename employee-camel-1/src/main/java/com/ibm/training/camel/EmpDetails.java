package com.ibm.training.camel;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\\,")
public class EmpDetails {

	@DataField(pos=1)
	String name;
	@DataField(pos=2)
	Float salary;
	@DataField(pos=3)
	String role;
	@DataField(pos=4)
	String doj;
	@DataField(pos=5)
	String location;
	@DataField(pos=6)
	String workStatus;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	@Override
	public String toString() {
		return "EmpDetails [name=" + name + ", salary=" + salary + ", role=" + role + ", doj=" + doj + ", location="
				+ location + ", workStatus=" + workStatus + "]";
	}
	
	
	
	
}
