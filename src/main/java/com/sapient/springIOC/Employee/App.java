package com.sapient.springIOC.Employee;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter employee id:  ");
		int id = scanner.nextInt();
		boolean found = false;

		for (int i = 1; i < 6; i++) {

			EmployeeBlueprint temp = (EmployeeBlueprint) context.getBean("emp" + i);
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
}
