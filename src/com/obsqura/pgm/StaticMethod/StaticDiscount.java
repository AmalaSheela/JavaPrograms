package com.obsqura.pgm.StaticMethod;

public class StaticDiscount {
	//Method1

	public static double calTotal(int item1,int item2)
	 {
	double total = item1+item2;
	System.out.println("total is"  + total);
	return total;
	 }
	 
	//Method2
	public static double checkDiscount(double total)
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
		double totalamount=StaticDiscount.calTotal(10000,20000);
		double discountamount =StaticDiscount.checkDiscount(totalamount);
		double finalamount=totalamount - discountamount;
	System.out.println("finalamount is " + finalamount);
		}


}
