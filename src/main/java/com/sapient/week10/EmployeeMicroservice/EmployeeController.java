package com.sapient.week10.EmployeeMicroservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.week10.EmployeeMicroservice.dao.EmployeeDaoService;
import com.sapient.week10.EmployeeMicroservice.dao.EmployeeProfile;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDaoService daoService;

	@GetMapping("/employees")
	public List<EmployeeProfile> getAllEmployees() {

		return daoService.findAllEmployees();

	}

	@GetMapping("/employees/id/{id}")
	public EmployeeProfile getEmployeeById(@PathVariable int id) {

		return daoService.findEmployeeById(id);

	}

	@GetMapping("/employees/name/{name}")
	public List<EmployeeProfile> getAllEmployeesByName(@PathVariable String name) {

		return daoService.findEmployeeByName(name);

	}

	@PostMapping("/employees")
	public void insertEmployee(@RequestBody EmployeeProfile emp) {

		daoService.insertEmployee(emp);
	}

	@DeleteMapping("/employees/id/{id}")
	public void deleteEmployee(@PathVariable int id) {
		daoService.deleteEmployeeById(id);
	}

	@PatchMapping("/employees/{id}")
	public void modifyEmployee(@PathVariable int id, @RequestBody EmployeeProfile emp) {

		daoService.modifyEmployeeById(emp, id);

	}

}
