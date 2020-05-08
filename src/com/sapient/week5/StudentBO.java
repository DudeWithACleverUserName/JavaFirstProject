package com.sapient.week5;

import java.util.Arrays;

public class StudentBO {

	public void readDetails(StudentPOJO student) {

		System.out.print("Enter ID: ");
		student.setId(Read.in.nextInt());
		System.out.print("Enter name: ");
		student.setName(Read.in.next());
		System.out.print("Enter city: ");
		student.setCity(Read.in.next());

	}

	public void displayDetails(StudentPOJO student) {

		System.out.println("Details of the student:");
		System.out.println("ID: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("City: " + student.getCity());

	}

	public void displayStudentsFromCity(StudentPOJO[] students, String city) {

		System.out.println("Details of students from " + city + " are:");

		for (StudentPOJO student : students) {
			if (student.getCity().equals(city)) {
				displayDetails(student);
				System.out.println();
			}
		}

	}

	public void sortByName(StudentPOJO[] students) {

		Arrays.sort(students, new NameComparator());
		System.out.println("Students sorted by name.");
		for (StudentPOJO student : students) {

			displayDetails(student);

		}

	}

	public void sortByCityName(StudentPOJO[] students) {

		Arrays.sort(students, new CityComparator());
		System.out.println("Students sorted by city name.");
		for (StudentPOJO student : students) {

			displayDetails(student);

		}

	}

	public void displayStudentWithID(StudentPOJO[] students, int id) {

		int present = 0;

		for (StudentPOJO student : students) {
			if (student.getId() == id) {
				System.out.println("Student found with ID: " + id);
				displayDetails(student);
				present = 1;
			}
		}

		if (present == 0) {
			throw new StudentNotFoundException(String.format("Student with id: %d not found.", id));
		}

	}

}
