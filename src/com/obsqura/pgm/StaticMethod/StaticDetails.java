package com.obsqura.pgm.StaticMethod;

public class StaticDetails {

		//method1
		public static String nameOf(String s1)
		{
		 return s1;
		}

		//method2
		public static int ageOf(int s2)
		{
		 return s2;
		}

		  //main method
		public static void main(String args[])
		{
			String temp = StaticDetails.nameOf("Amala");
			int temp1=StaticDetails.ageOf(28);

			System.out.println("Name is " + temp);
			System.out.println("Age is " + temp1);
		
	}

}
