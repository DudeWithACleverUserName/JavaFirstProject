package com.sapient.week5;

public class StudentRunner {

	public static void main(String[] args) {
		System.out.print("Enter the number of students: ");
		int n = Read.in.nextInt();

		System.out.println("Enter the details of students:");

		StudentPOJO[] students = new StudentPOJO[n];

		StudentBO implStudent = new StudentBO();

		for (int i = 0; i < students.length; i++) {

			students[i] = new StudentPOJO();

			implStudent.readDetails(students[i]);

		}

		System.out.println("\nFunctions available:");
		System.out.println("1. Display student details with a particular city");
		System.out.println("2. Display student details sorted by name");
		System.out.println("3. Display student details sorted by city name");
		System.out.println("4. Display student details with a particular ID");
		System.out.println("Enter choice(1-4)");
		int choice = Read.in.nextInt();

		while (choice < 5 && choice > 0) {

			switch (choice) {

			case 1:
				System.out.print("Enter city name: ");
				String city = Read.in.next();
				implStudent.displayStudentsFromCity(students, city);
				break;

			case 2:
				implStudent.sortByName(students);
				break;

			case 3:
				implStudent.sortByCityName(students);
				break;

			case 4:
				try {
					System.out.print("Enter ID of the student: ");
					int id = Read.in.nextInt();
					implStudent.displayStudentWithID(students, id);
				} catch (StudentNotFoundException ex) {
					ex.printStackTrace();
				}

				break;

			default:
				break;
			}
			System.out.println("Enter choice(1-4)");
			choice = Read.in.nextInt();

		}

	}

}
