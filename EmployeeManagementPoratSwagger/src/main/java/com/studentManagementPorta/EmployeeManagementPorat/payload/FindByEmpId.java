package com.studentManagementPorta.EmployeeManagementPorat.payload;

public class FindByEmpId {
	
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "FindByEmpId [empId=" + empId + "]";
	}

	public FindByEmpId(int empId) {
		super();
		this.empId = empId;
	}

	public FindByEmpId() {
		super();
	}

	
	

}
