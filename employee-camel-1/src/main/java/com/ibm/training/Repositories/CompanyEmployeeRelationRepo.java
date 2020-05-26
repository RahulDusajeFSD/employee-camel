package com.ibm.training.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.training.beans.CompanyEmployeeRelation;

@Repository
public interface CompanyEmployeeRelationRepo extends CrudRepository<CompanyEmployeeRelation, Integer>{

	
}
