package com.sapient.shapes;

public class Triangle {
	private int sides;
	public void setSides(int sideLength)
	{
		this.sides=sideLength;
	}
	 double calculateArea() {
		return 0.433*this.sides*this.sides;
	}

}
