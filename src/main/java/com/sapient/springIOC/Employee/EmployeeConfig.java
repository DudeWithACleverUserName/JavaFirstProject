package com.sapient.springIOC.Employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig {

	@Bean(name = "emp1")
	@Scope("prototype")
	public EmployeeBlueprint emp1() {
		EmployeeBlueprint emp = new EmployeeBlueprint();

		emp.setId(13);
		emp.setName("Yogesh");
		emp.setCity("Delhi");
		return emp;
	}

	@Bean(name = "emp2")
	@Scope("prototype")
	public EmployeeBlueprint emp2() {
		EmployeeBlueprint emp = new EmployeeBlueprint();

		emp.setId(18);
		emp.setName("Akash");
		emp.setCity("Pune");
		return emp;
	}

	@Bean(name = "emp3")
	@Scope("prototype")
	public EmployeeBlueprint emp3() {
		EmployeeBlueprint emp = new EmployeeBlueprint();

		emp.setId(14);
		emp.setName("Kandy");
		emp.setCity("Delhi");
		return emp;
	}

	@Bean(name = "emp4")
	@Scope("prototype")
	public EmployeeBlueprint emp4() {
		EmployeeBlueprint emp = new EmployeeBlueprint();

		emp.setId(15);
		emp.setName("Atri");
		emp.setCity("Bangalore");
		return emp;
	}

	@Bean(name = "emp5")
	@Scope("prototype")
	public EmployeeBlueprint emp5() {
		EmployeeBlueprint emp = new EmployeeBlueprint();

		emp.setId(16);
		emp.setName("Pawan");
		emp.setCity("Gurgaon");
		return emp;
	}

}
