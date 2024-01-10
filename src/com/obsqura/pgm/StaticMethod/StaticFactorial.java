package com.obsqura.pgm.StaticMethod;

public class StaticFactorial {
	//method
	public static int factorialOfNumber(int number)
	  {

		int  fact = 1;	
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
	    }
		return fact;
	   }

	//main method
	public static void main(String args[])
	 {
	 int num = 4;
	 int temp1 = StaticFactorial.factorialOfNumber(num);
	 
	System.out.println("Factorial of " + num +" is " + temp1);

	 }
	 
	}
