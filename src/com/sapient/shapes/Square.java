package com.sapient.shapes;

import java.math.BigDecimal;

public class Square {

	public void calculateArea(int sideLength) {
		
		BigDecimal sides = new BigDecimal(sideLength);

		System.out.println("The Area of the square is: " + sides.multiply(sides));
		
		
	}

}
