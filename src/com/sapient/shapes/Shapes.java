package com.sapient.shapes;

import java.util.Scanner;

public class Shapes {
	private int numberOfSides;
	
	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public void calculateShapeArea( int numberOfSides, int sideLength) {
		
		
		if(numberOfSides == 1) {
			
			Circle circle = new Circle();
			circle.calculateArea(sideLength);			
			
		}
		else if(numberOfSides == 3) {
			
			Triangle triangle = new Triangle();
			triangle.calculateArea(sideLength);
			
		}
		else if(numberOfSides == 4) {
			
			Square square = new Square();
			square.calculateArea(sideLength);
			
		}
		else {
			System.out.println("No Shapes present.");
			
		}
		
	
		
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of sides: ");
		
		Shapes shapes = new Shapes();
		
		shapes.setNumberOfSides(scanner.nextInt());
		
		
		System.out.print("Enter the side length: ");
		int sideLength = scanner.nextInt();		
	
		shapes.calculateShapeArea(shapes.getNumberOfSides(),sideLength);
		
		
	


	}

}
