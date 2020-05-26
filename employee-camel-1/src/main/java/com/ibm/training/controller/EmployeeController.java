package com.ibm.training.controller;

import java.io.FileWriter;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.training.beans.CompanyEmployeeRelation;
import com.ibm.training.beans.EmployeeBasicInfo;
import com.ibm.training.beans.EmployeeHireInfo;
import com.ibm.training.service.CompanyEmployeeRelationService;
import com.ibm.training.service.EmployeeBasicInfoService;
import com.ibm.training.service.EmployeeHireInfoService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeBasicInfoService ebservice;
	
	@Autowired
	EmployeeHireInfoService ehservice;
	
	
	@Autowired
	CompanyEmployeeRelationService ceservice;
	
@PostMapping("/registerEmp")
public void registerEmp(@RequestBody EmployeeBasicInfo ebasic)
{
	ebservice.registerEmp(ebasic);
}


@PostMapping("/hireEmp")
public void hireEmp(@RequestBody EmployeeHireInfo ehire)
{	
	ehservice.hireEmp(ehire);
}

@PostMapping("/companyEmpRel")
public void companyEmpRel(@RequestBody CompanyEmployeeRelation cerel)
{
	ceservice.companyEmpRel(cerel);
}

@GetMapping("/empDetails/{id}")
String empDetailsById(@PathVariable Integer id)
{
	return ebservice.empDetailsById(id);
}



@GetMapping("/copyData/{id}")
public void copyData(@PathVariable Integer id) throws Exception
{
	convertData(id);
}

String g=null;
public void convertData(Integer id) throws Exception
{
	
FileWriter file = new FileWriter("CsvFile/tx.txt");
 g=ebservice.empDetailsById(id);
 
file.write(g);
file.close();
	
}
}

