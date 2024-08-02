package com.studentManagementPorta.EmployeeManagementPorat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagementPorta.EmployeeManagementPorat.entity.Employee;
import com.studentManagementPorta.EmployeeManagementPorat.payload.FindByEmpId;
import com.studentManagementPorta.EmployeeManagementPorat.repository.EmpRespository;

@Service
public class EmpService {
	
	@Autowired
	private EmpRespository empRepo;
	
	public Employee saveEmp(Employee emp) {	
		 return empRepo.save(emp);
	}
	
	public List<Employee> getAllEmp(){
		return empRepo.findAll();
	}
	
	public Optional<Employee> getEmpById(int empId){
		return empRepo.findById(empId);
	}
	
	public void deleteById(int empId){
		empRepo.deleteById(empId);
	}

}
