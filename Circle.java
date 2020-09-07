package com.sapient.shapes;
#changes on branch2
public class Circle{
	public int Radius;
	Circle()
	{
	/*changes made again in constructor*/
	}
	Circle(int Radius)
	{
	  this.Radius=Radius;	
	}
	void calculateAreaOfCircle(int Radius)
	{
		System.out.println(3.14*Radius*Radius);
		/*changes made by me */
                System.out.println("Area of circle");

	}

}
