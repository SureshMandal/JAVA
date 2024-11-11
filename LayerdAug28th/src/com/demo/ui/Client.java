package com.demo.ui;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		EmployeeService service= new EmployeeServiceImpl();
		
		Employee emp= new Employee(123, "devasena", 9000, "kuntala");
		
		//service.addEmployee(emp);
		
		Employee emp1=service.findEmployeeById(123);
		System.out.println(emp1);
		
		emp1.setEmpadd("kochi");
		emp1.setEmpname("bahubali");
		emp1.setEmpsal(70000);
		
		//service.updateEmployee(emp1);
		service.deleteEmployee(emp1);
	}
}
