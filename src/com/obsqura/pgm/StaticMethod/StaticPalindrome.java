package com.obsqura.pgm.StaticMethod;

public class StaticPalindrome {
	
	//method1-reverse
	public static int reverseOf(int number)
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
	public static void checkpalindrome(int number)
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
		
		int temp1 = StaticPalindrome.reverseOf(345);
		
		System.out.println("Reverse is" + temp1);
		StaticPalindrome.checkpalindrome(554);
		
	
	}
}

