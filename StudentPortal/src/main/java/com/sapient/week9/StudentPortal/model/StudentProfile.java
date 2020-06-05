package com.sapient.week9.StudentPortal.model;

public class StudentProfile {

	private int rollNumber;
	private String name;
	private int marks;
	private char grade;

	public StudentProfile() {
		super();
	}

	public StudentProfile(int rollNumber, String name, int marks, char grade) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

}
