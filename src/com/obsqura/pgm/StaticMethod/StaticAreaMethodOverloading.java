package com.obsqura.pgm.StaticMethod;

public class StaticAreaMethodOverloading {
	//method overloading 
	public static int areaOfFigures(int l,int w)
	{
	int rectanglearea = l*w;
	return rectanglearea;
	}
	//method overloading-single parameter
	public static int areaOfFigures(int a)
	{
	int squarearea=a*a;
	return squarearea;
	}
	//method overloading -single parameter
	public static float areaOfFigures(float r)
	{
	float circlearea=3.14f*r*r;
	return circlearea;
	}
	//main method
	public static void main(String args[])
	{
	int a1=StaticAreaMethodOverloading.areaOfFigures(5,10);
	int a2=StaticAreaMethodOverloading.areaOfFigures(3);
	float a3 =StaticAreaMethodOverloading.areaOfFigures(0.5f);
	System.out.println("Area of Rectangle is  " + a1);
	System.out.println("Area of Square is  " + a2);
	System.out.println("Area of Circle is  " + a3);
	}


}
