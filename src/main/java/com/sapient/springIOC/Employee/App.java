package com.sapient.springIOC.Employee;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static Scanner scanner = new Scanner(System.in);

	public static void findEmployee(ApplicationContext ctx) {

		System.out.print("Enter employee id:  ");
		int id = scanner.nextInt();

		boolean found = false;
		for (int i = 1; i < 6; i++) {

			EmployeeBlueprint temp = (EmployeeBlueprint) ctx.getBean("emp" + i);

			if (temp.getId() == id) {

				System.out.println("Details of the Employee:");
				System.out.println("Id: " + temp.getId());
				System.out.println("Name: " + temp.getName());
				System.out.println("City: " + temp.getCity());
				found = true;
			}
		}
		if (!found) {
			System.out.println("No employee found with id: " + id);
		}

	}

	public static void main(String[] args) {

		System.out.println("/*-------Part-1------*/");
		System.out.println("Using XML Based Container");

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		findEmployee(context);

		System.out.println("\n/*-------Part-2------*/");
		System.out.println("Using Java Based Container");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);

		findEmployee(ctx);

		scanner.close();

	}

}
