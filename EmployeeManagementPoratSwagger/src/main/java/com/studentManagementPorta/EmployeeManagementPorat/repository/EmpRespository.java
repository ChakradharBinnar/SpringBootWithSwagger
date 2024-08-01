package com.studentManagementPorta.EmployeeManagementPorat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentManagementPorta.EmployeeManagementPorat.entity.Employee;

@Repository
public interface EmpRespository extends JpaRepository<Employee, Integer> {

}
