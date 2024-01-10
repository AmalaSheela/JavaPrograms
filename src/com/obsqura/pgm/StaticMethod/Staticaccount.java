package com.obsqura.pgm.StaticMethod;

public class Staticaccount {
	
	//Method1 
	public static int currentbalance(int balance)
	{
		return balance;
		
	}

	//Method2
	public static int deposit(int amount, int currentBalance)
	{
	 currentBalance =  currentBalance + amount;
	 return currentBalance;
	}
		

	//Method3
	public static int withDraw(int amount,int currentbalance)
	{
	currentbalance=currentbalance-amount;
	return currentbalance;
	}

	//Main method
	public static void main(String args[])
	{
	int amount=1000;
	int bal = Staticaccount.currentbalance(amount);
	System.out.println("Balance is " + bal);
	int bal1 = Staticaccount.deposit(250, bal);
	System.out.println("Balance is " + bal1);
	int bal2 = Staticaccount.withDraw(350, bal);
	System.out.println("Balance is " + bal2);

	}


}
