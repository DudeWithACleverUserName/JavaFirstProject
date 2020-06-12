package com.sapient.week10.EmployeeMicroservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoService {

	private static List<EmployeeProfile> employeeList = new ArrayList<>();

	static {
		employeeList.add(new EmployeeProfile(1, "Jack", "Denmark", 29));
		employeeList.add(new EmployeeProfile(2, "Ferg", "Tunisia", 24));
		employeeList.add(new EmployeeProfile(3, "Rose", "Sweden", 25));
		employeeList.add(new EmployeeProfile(4, "Afiq", "Sydney", 23));
	}

	public List<EmployeeProfile> findAllEmployees() {

		return employeeList;

	}

	public List<EmployeeProfile> findEmployeeByName(String name) {

		List<EmployeeProfile> foundList = new ArrayList<>();

		for (EmployeeProfile employee : employeeList) {

			if (employee.getName().equalsIgnoreCase(name)) {
				foundList.add(employee);

			}

		}

		return foundList;

	}

	public EmployeeProfile findEmployeeById(int id) {

		for (EmployeeProfile employee : employeeList) {

			if (employee.getId() == id) {
				return employee;
			}

		}

		return null;

	}

	public void insertEmployee(EmployeeProfile emp) {

		employeeList.add(emp);

	}

	public void modifyEmployeeById(EmployeeProfile emp, int id) {

		for (EmployeeProfile employee : employeeList) {

			if (employee.getId() == id) {
				if (emp.getName() != null) {
					employee.setName(emp.getName());

				}
				if (emp.getCity() != null) {
					employee.setCity(emp.getCity());

				}
				if (emp.getAge() != 0) {
					employee.setAge(emp.getAge());

				}
				break;
			}

		}
	}

	public void deleteEmployeeById(int id) {

		if (findEmployeeById(id) != null) {
			employeeList.remove(findEmployeeById(id));
		}

	}

}
