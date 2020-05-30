package com.sapient.week8.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class AddEmployeeTest {

	AddEmployee employeeList;
	Employee temp;

	@Before
	public void setUp() {

		employeeList = Mockito.mock(AddEmployee.class);

		temp = new Employee(8, "Yogesh", "Delhi");

		Mockito.when(employeeList.getEmployee(8)).thenReturn(temp);
		Mockito.when(employeeList.getEmployee(2)).thenReturn(null);

	}

	@Test
	public void testGetEmployeeForValidId() {

		assertEquals(employeeList.getEmployee(8), temp);

		Mockito.verify(employeeList).getEmployee(8);

	}

	@Test
	public void testGetEmployeeForInvalidId() {

		assertEquals(employeeList.getEmployee(2), null);

		Mockito.verify(employeeList).getEmployee(2);

	}

}
