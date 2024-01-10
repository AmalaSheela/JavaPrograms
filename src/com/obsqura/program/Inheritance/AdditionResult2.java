package com.obsqura.program.Inheritance;

public class AdditionResult2 extends NumbersAddition{
	public void CheckAdditionResult()
	{	
		int number = super.sumOfTwoNumbers(20,30);
		if(number%10==0)
		{
			System.out.println("The sum is divisible by 10");
		}
		else 
		{
			System.out.println("The sum is not divisible by 10");
		}
		
	}

	public static void main(String[] args) {
		AdditionResult2 num = new AdditionResult2();
		num.CheckAdditionResult();
		
	}

}
