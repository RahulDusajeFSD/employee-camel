package com.ibm.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.Repositories.EmployeeBasicInfoRepo;
import com.ibm.training.beans.EmployeeBasicInfo;

@Service
public class EmployeeBasicInfoService {

	@Autowired
	EmployeeBasicInfoRepo ebrepo;
	
	public void registerEmp(EmployeeBasicInfo ebasic) {
		
		ebrepo.save(ebasic);
	}

	public String empDetailsById(Integer id) {
		
	return ebrepo.getEempDetailsById(id);
		
	}

}
