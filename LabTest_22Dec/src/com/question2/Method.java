package com.question2;

public class Method extends Rectangle{

	
	public Method(double lenght, double breadth, double side) {
	super(lenght, breadth);
	// TODO Auto-generated constructor stub
}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
         System.out.println("------------------Rectangle-------------------");

	Rectangle rt = new Rectangle(9.0,7);
     rt.area();
     rt.perimeter();
     
     System.out.println("------------------Square-------------------");
     Square s = new Square(9);
     s.area();
     s.perimeter();
     
     
}

}
