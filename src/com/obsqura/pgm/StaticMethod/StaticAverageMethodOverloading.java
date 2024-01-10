package com.obsqura.pgm.StaticMethod;

public class StaticAverageMethodOverloading {
	
		//Method overloading with int type
		public static int calculateAverage(int a,int b, int c)
		 {
		int sum;
		sum = (a+b+c)/3;
		return sum;
		 }
		//Method overloading float type
		public static float calculateAverage(float x,float y,float z)
		 {
		float sum;
		sum = (x+y+z)/3;
		return sum;
		 }

		public static void main(String args[])
		 {
		int temp1=StaticAverageMethodOverloading.calculateAverage(10,20,30);
		float temp2=StaticAverageMethodOverloading.calculateAverage(11.25f,20.5f,35.2f);

		System.out.println("Average of three numbers" +  temp1);
		System.out.println("Average of three numbers" +  temp2);

		}
}
