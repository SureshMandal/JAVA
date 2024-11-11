package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao dao;
	
	public EmployeeServiceImpl() {
		dao= new EmployeeDaoImpl();
	}
	
	
	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransactions();
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransactions();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransactions();
	}

	@Override
	public Employee findEmployeeById(int empid) {
		Employee emp=dao.getEmployeeById(empid);
		return emp;
	}

}
