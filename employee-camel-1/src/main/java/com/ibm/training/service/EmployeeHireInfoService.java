package com.ibm.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.Repositories.EmployeeHireInfoRepo;
import com.ibm.training.beans.EmployeeHireInfo;

@Service
public class EmployeeHireInfoService {

	@Autowired
	EmployeeHireInfoRepo ehrepo;
	
	public void hireEmp(EmployeeHireInfo ehire) {
		
		ehrepo.save(ehire);
	}

}
