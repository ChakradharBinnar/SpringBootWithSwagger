package com.studentManagementPorta.EmployeeManagementPorat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentManagementPorta.EmployeeManagementPorat.entity.Employee;
import com.studentManagementPorta.EmployeeManagementPorat.service.EmpService;


//http://localhost:8081/api/swagger-ui/index.html --swagger ui

@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@PostMapping("/saveEmp")
	public ResponseEntity<?> saveEmp(@RequestBody Employee emp) {
		try {
			Employee saveEmployee =empService.saveEmp(emp);
			return new ResponseEntity<>(saveEmployee,HttpStatus.CREATED);
		} catch (Exception e) {
			 return new ResponseEntity<>("Error saving user", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/getAllEmp")
	public ResponseEntity<?> getAllEmp(){
		try {
			List<Employee> allEmp = empService.getAllEmp();
			if(allEmp.isEmpty()) {
				return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<>(allEmp, HttpStatus.OK);
		}catch (Exception e) {
			 return new ResponseEntity<>("Error retrieving Employee", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	  

}
