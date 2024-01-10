package com.obsqura.program.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateElements {

public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Blue");
		list.add("Black");
		list.add("Yellow");
		list.add("Pink");
		list.add("white");
		System.out.println(list);
		Iterator<String> ir = list.iterator();
		System.out.println("using iterator");
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
}	
		
	
}
