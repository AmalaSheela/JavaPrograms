package com.obsqura.program.Inheritance;

public class aBasicPay {

	int basicpay=25000;
	int bonus=3000;
	int deduction=1200;
//basicpay	
public int getBasicPay()
	{

	return basicpay;
	}
//deduction
public void deduction()
{
	
	System.out.println("deduction is" + deduction);
}
//bonus
public void bonus()
{
	
	System.out.println("bonus is" + bonus);
}
}