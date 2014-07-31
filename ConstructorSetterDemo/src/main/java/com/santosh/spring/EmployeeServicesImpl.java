package com.santosh.spring;

import com.santosh.spring.dao.EmployeeDAO;

public class EmployeeServicesImpl implements EmployeeServices {

	private EmployeeDAO employeeDAO;
		
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public boolean incrementSalary(int empno, double amt) {

		double sal = employeeDAO.getSal(empno);
		
		sal = sal + amt;
		
		employeeDAO.setSal(empno, sal);
		
		return true;
	}
}
