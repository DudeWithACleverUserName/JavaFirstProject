package com.sapient.week8.Junit;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {

	List<Employee> employees = new ArrayList<>();

	public void addEmployee(Employee emp) {

		employees.add(emp);

	}

	public Employee getEmployee(int id) {

		for (Employee employee : employees) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;

	}
}
