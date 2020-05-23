package com.sapient.springIOC.Employee;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static boolean findEmployee(EmployeeBlueprint temp, int id) {

		boolean found = false;

		if (temp.getId() == id) {

			System.out.println("Details of the Employee:");
			System.out.println("Id: " + temp.getId());
			System.out.println("Name: " + temp.getName());
			System.out.println("City: " + temp.getCity());
			found = true;
		}
		return found;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("/*-------Part-1------*/");
		System.out.println("Using XML Based Container");

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter employee id:  ");
		int id = scanner.nextInt();
		boolean found = false;

		for (int i = 1; i < 6; i++) {

			EmployeeBlueprint temp = (EmployeeBlueprint) context.getBean("emp" + i);
			found = found | findEmployee(temp, id);

		}

		if (!found) {
			System.out.println("No employee found with id: " + id);
		}

		System.out.println("\n/*-------Part-2------*/");
		System.out.println("Using Java Based Container");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);

		System.out.print("Enter employee id:  ");
		id = scanner.nextInt();
		found = false;

		for (int i = 1; i < 6; i++) {

			EmployeeBlueprint temp = (EmployeeBlueprint) ctx.getBean("emp" + i);
			found = found | findEmployee(temp, id);

		}

		if (!found) {
			System.out.println("No employee found with id: " + id);
		}

		scanner.close();

	}

}
