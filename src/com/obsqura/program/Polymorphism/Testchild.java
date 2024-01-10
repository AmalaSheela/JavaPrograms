package com.obsqura.program.Polymorphism;

public class Testchild extends Testparent {
	
	void print()
	{
		
		super.print();
		System.out.println(" child method");
	}

	public static void main(String[] args) {
		
		Testchild t = new Testchild();
		t.print();
		
		
		
	}

}
