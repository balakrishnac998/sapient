package com.sapient.shapes;

public class Shapes {
	int numberOfSides;
	double area;
	 void calculateShapeArea(int numberOfSides,int sideLength)
	{
		switch(numberOfSides)
		{
		case 1: Circle circle=new Circle();
		  circle.setRadius(sideLength);
		  area=circle.calculateArea();
		  System.out.println("The Area of the circle is "+area);
		  break;
		case 3: Triangle triangle=new Triangle();
		     triangle.setSides(sideLength);
		       area =triangle.calculateArea();
		      System.out.println("The Area of the Triangle is "+area);
		      break;
		case 4:
			Square square=new Square();
			square.setSides(sideLength);
		     int area=square.calculateArea();
			System.out.println("The Area of the Square is "+area);
			break;
			default:
				System.out.println("No Shapes present");
		  
		        
		        
		}
	}

	public static void main(String[] args) {
		Shapes Shapes=new Shapes();
		//testcase 1
		Shapes.numberOfSides=3;
		int sideLength=12;
		 Shapes.calculateShapeArea( Shapes.numberOfSides, sideLength);
		 
		 //testcase 2
		 Shapes.numberOfSides=4;
			 sideLength=15;
			 Shapes.calculateShapeArea( Shapes.numberOfSides, sideLength);
		
			//testcase 3
			 Shapes.numberOfSides=5;
				 sideLength=15;
				 Shapes.calculateShapeArea( Shapes.numberOfSides, sideLength);
			 
		 

	}

}
