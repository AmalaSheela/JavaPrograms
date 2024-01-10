package com.obsqura.pgm.InstanceMethod;

public class InstanceDetails {
	//method1
	public String nameOf(String s1)
	{
	 return s1;
	}

	//method2
	public int ageOf(int s2)
	{
	 return s2;
	}

	//main method
	public static void main(String args[])
	{
		InstanceDetails n = new InstanceDetails();//obj creation

		String name1 = n.nameOf("Amala");//calling
		int age = n.ageOf(28);

		System.out.println("Name is " + name1);
		System.out.println("Age is" + age);

	}
	}



