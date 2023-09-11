package com.example.Emptask_restapi.contr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Emptask_restapi.model.Employee;

@RestController

public class EmployeeController {

	@RequestMapping(value ="/get/employees",method = RequestMethod.GET)
	public String getEmployees() {
		final Employee emp = new Employee(" next employee");
		return "Hello"+emp.getName();
	}
}
