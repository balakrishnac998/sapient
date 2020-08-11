package com.sapient.shapes;

public class Square {
	private int sides;
	void setSides(int sideLength)
	{
		this.sides=sideLength;
	}
	 int calculateArea() {
	return this.sides*this.sides;
}

}
