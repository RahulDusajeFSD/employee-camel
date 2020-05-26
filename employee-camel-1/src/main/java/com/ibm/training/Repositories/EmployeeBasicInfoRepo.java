package com.ibm.training.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ibm.training.beans.EmployeeBasicInfo;

@Repository
public interface EmployeeBasicInfoRepo extends CrudRepository<EmployeeBasicInfo, Integer>{

	
	@Query(value="select employee_basic_info.name , employee_basic_info.salary , "
			+ "employee_basic_info.role, "
			+ "employee_hire_info.joined, company_employee_relation.location, "
			+ "company_employee_relation.work_status from employee_hire_info INNER JOIN employee_basic_info"
			+ " ON employee_hire_info.id=employee_basic_info.id INNER JOIN company_employee_relation "
			+ "ON employee_hire_info.id=company_employee_relation.id and employee_hire_info.id = :id" ,nativeQuery = true)
	public String getEempDetailsById(@Param("id") Integer id);
}
