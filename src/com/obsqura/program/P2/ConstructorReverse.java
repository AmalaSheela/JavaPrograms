package com.obsqura.program.P2;

class ConstructorReverse
{

int number;
//constructor 1
public  ConstructorReverse()
{
System.out.println("Reverse of given number ");

}

//constructor2
public ConstructorReverse(int number)
 {
	 
	this();
	this.number=number;
	 int reverse=0;
	 int temp=number;
	 int remainder;
	 while(number!=0)
   {
	remainder = number%10;
	reverse = reverse*10 + remainder;
	number = number/10;
   }
   System.out.println(reverse);
 }
 //main method
 public static void main(String args[])
 {
 ConstructorReverse obj2 = new ConstructorReverse(456);

 }
}
 
 

	
 