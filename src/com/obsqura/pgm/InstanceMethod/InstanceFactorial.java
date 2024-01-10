package com.obsqura.pgm.InstanceMethod;

public class InstanceFactorial {
	
	//method
	public int factorialOfNumber(int number)
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
	InstanceFactorial f1 = new InstanceFactorial();//obj creation
	int temp1 = f1.factorialOfNumber(num);
	 
	System.out.println("Factorial of " + num +" is " + temp1);

	 }


}
