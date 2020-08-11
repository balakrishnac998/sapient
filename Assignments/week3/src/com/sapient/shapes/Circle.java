package com.sapient.shapes;

public class Circle {
	  private int radius;
	public void setRadius(int sideLength)
	{
		this.radius=sideLength;
	}
	 public double calculateArea() {
		  
		return 3.14*(this.radius)*(this.radius);
	}

}
