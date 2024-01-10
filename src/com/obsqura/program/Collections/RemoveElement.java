package com.obsqura.program.Collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Blue");
		list.add("Black");
		list.add("Yellow");
		list.add("Pink");
		list.add("white");
		//before removing
		System.out.println("Before removing element from array list");
		System.out.println(list);
		//after removing
		list.remove(2);
		System.out.println("After removing element from array list");
		System.out.println(list);
}	
}
