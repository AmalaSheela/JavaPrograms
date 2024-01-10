package com.obsqura.program.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RetriveElement {
	
public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Blue");
		list.add("Black");
		list.add("Yellow");
		list.add("Pink");
		list.add("white");
		System.out.println("Enter the index ");
	
	Scanner scan = new Scanner(System.in);
	int index = scan.nextInt();
	if (index >= 0 && index < list.size()) {
        String element = list.get(index);
        System.out.println("Element at index " + index + ": " + element);
    } else {
        System.out.println("Invalid index. Index should be between 0 and " + (list.size() - 1));
    }
	
}	
		
	}
	
	

