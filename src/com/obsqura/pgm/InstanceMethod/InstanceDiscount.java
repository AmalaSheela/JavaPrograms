package com.obsqura.pgm.InstanceMethod;

public class InstanceDiscount {
	//Method1

	public double calTotal(int item1,int item2)
	 {
	double total = item1+item2;
	System.out.println("total is"  + total);
	return total;
	 }
	 
	//Method2
	public double checkDiscount(double total)
	 {
	double discount =0;

	if(total>5000)
	 {
	discount=0.2*total;
	 }
	return discount;
	 }
	//main method

	public static void main(String args[])
		{
	InstanceDiscount obj = new InstanceDiscount();
	double totalamount=obj.calTotal(10000,20000);
	double discountamount =obj.checkDiscount(totalamount);
	double finalamount=totalamount - discountamount;
	System.out.println("finalamount is " + finalamount);
		}

	
}
