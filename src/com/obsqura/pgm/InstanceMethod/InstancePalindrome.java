package com.obsqura.pgm.InstanceMethod;

public class InstancePalindrome {
	
	//method1-reverse
	public int reverseOf(int number)
	{
		 int reverse=0;
		 int temp=number;
		 int remainder;
		 while(number!=0)
	   {
		remainder = number%10;
		reverse = reverse*10 + remainder;
		number = number/10;
	   }
	   return reverse;
	}
	//method2-checkpalindrome
	public void checkpalindrome(int number)
	{
		{
		 int reverse=0;
		 int temp=number;
		 int remainder;
		 while(number!=0)
	   {
		remainder = number%10;
		reverse = reverse*10 + remainder;
		number = number/10;
	   
	   }
		 if(reverse==temp)
		 {
		 System.out.println("Number is Palindrome" + temp);
		 }
		 else
		 {
		System.out.println("Number is not Palindrome" + temp);
			 
		 }
		}
	}

	//main method
		public static void main(String arg[])
		{
			
		InstancePalindrome a1 = new InstancePalindrome();
		int temp2 = a1.reverseOf(345);
		
		System.out.println("Reverse is" + temp2);
		a1.checkpalindrome(554);
		
	}


}
