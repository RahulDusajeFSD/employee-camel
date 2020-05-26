package com.ibm.training.beans;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class EmployeeHireInfo {


	public Integer getId() {
		return id;
	}

	public EmployeeHireInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeHireInfo(Integer id, Date joined) {
		super();
		this.id = id;
		this.joined = joined;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Date getJoined() {
		return joined;
	}

	public void setJoined(Date joined) {
		this.joined = joined;
	}



	@Id
	Integer id;

	@Basic(optional = false)
	@Column(name = "joined", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	 Date joined;

}