package com.obsqura.program.P2;

public class Stringpalindrome {
	
	public boolean isPalindrome(String s) {

		StringBuffer s1 = new StringBuffer(s);
		String reverse = s1.reverse().toString();
		if (s.equals(reverse)) {
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {

		Stringpalindrome sp = new Stringpalindrome();
		boolean pal = sp.isPalindrome("malayalam");
		
		if(pal)
		{
		System.out.println("Is a palindrome");
		}else
		{
        System.out.println("Not a palindrome");
		}
    }
		
	}


