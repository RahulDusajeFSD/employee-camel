package com.ibm.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.Repositories.CompanyEmployeeRelationRepo;
import com.ibm.training.beans.CompanyEmployeeRelation;

@Service
public class CompanyEmployeeRelationService {

	@Autowired
	CompanyEmployeeRelationRepo cerepo;
	
	public void companyEmpRel(CompanyEmployeeRelation cerel) {
		
		cerepo.save(cerel);
	}
	
	

}
