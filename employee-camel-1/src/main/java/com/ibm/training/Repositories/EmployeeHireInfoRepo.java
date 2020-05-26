package com.ibm.training.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.training.beans.EmployeeHireInfo;

@Repository
public interface EmployeeHireInfoRepo extends CrudRepository<EmployeeHireInfo, Integer>{
	

}
