package com.obsqura.pgm.InstanceMethod;

public class Instanceaccount {
	//Method1
	public int currentbalance(int balance)
	{
		return balance;
		
	}

	//Method2
	public int deposit(int amount, int currentBalance)
	{
	 currentBalance =  currentBalance + amount;
	 return currentBalance;
	}
		

	//Method3
	public int withDraw(int amount,int currentbalance)
	{
	currentbalance=currentbalance-amount;
	return currentbalance;
	}

	//Main method
	public static void main(String args[])
	{
	int amount=1000;
	Instanceaccount obj = new Instanceaccount();
	int bal = obj.currentbalance(amount);
	System.out.println("Balance is " + bal);

	bal = obj.deposit(250, bal);
	System.out.println("Balance is " + bal);

	bal = obj.withDraw(350, bal);
	System.out.println("Balance is " + bal);

	}

	

}
