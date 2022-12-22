package com.question2;

public class Square extends Rectangle {
	
	
	double side;
	
	double area, perimeter;

	public Square(double side) {
		super(side, side);
		this.side = side;
	}
	
	public void area () 
	{
		area = (side * side);
		System.out.println("Area of Square is : "+area);
	}
	public void perimeter() 
	{
		perimeter = 4*side;
		System.out.println("Perimeter of Square is: "+perimeter);
	}
	

}
