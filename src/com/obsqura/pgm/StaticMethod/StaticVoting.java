package com.obsqura.pgm.StaticMethod;

public class StaticVoting {
	//Method
	public static boolean isEligibleForVoting(int age)
	{

	boolean vote = false;

		if(age>=18)
		{

		 vote =  true;
		}
		 else if(age<18)
		 {
		
		vote =  false;
		 }
		return vote;
	}	

	//main method
	public static void main(String args[])
	{
	int age = 20;
	boolean temp1=StaticVoting.isEligibleForVoting(age);
	System.out.println("Eligible for voiting " + temp1);	
	}
}
