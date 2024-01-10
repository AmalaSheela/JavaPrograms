package com.obsqura.program.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {

		int flag = 0;
		List<String> list = new ArrayList<String>();
		list.add("Blue");
		list.add("Black");
		list.add("Yellow");
		list.add("Pink");
		list.add("white");
		System.out.println(list);

		System.out.println("Enter element to search : ");
		Scanner scan = new Scanner(System.in);
		String element = scan.nextLine();

		if (list.contains(element)) {
			System.out.println("Element found in the array" + element);
		} else {
			System.out.println("Element not found in the array" + element);
		}

		/*
		 * for (int i = 0; i < list.size(); i++) {
		 * 
		 * if (element.equals(list.get(i))) {
		 * System.out.println("Element found in the array" + element); flag = 1; break;
		 * }
		 * 
		 * 
		 * }
		 */

	}

}
