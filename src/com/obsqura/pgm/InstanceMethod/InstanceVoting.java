package com.obsqura.pgm.InstanceMethod;

public class InstanceVoting {
	//Method
	public boolean isEligibleForVoting(int age)
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
	InstanceVoting 	a1 = new InstanceVoting();
	boolean temp1=a1.isEligibleForVoting(age);
	System.out.println("Eligible for voiting " + temp1);	
	}


}
