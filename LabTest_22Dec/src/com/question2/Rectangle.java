package com.question2;

public class Rectangle {

		double lenght;
		double breadth;
		double area;
		double perimeter;
		
		
		public Rectangle(double lenght, double breadth) {
			super();
			this.lenght = lenght;
			this.breadth = breadth;
		}

		public  void area() {
			
			 area = (lenght*breadth);
			 System.out.println("Area of rectangle is: "+area);

		}

		public void perimeter()
		{
	       perimeter =(2*(lenght+breadth));
	       System.out.println("Perimeter of Rectangle is: "+perimeter);
		}

}
