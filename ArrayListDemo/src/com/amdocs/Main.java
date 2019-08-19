package com.amdocs;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(10);
		numbers.add(1);
		
		System.out.println("List size " + numbers.size());
		Collections.sort(numbers);
		System.out.println("List numbers" + ":");
		for(int element : numbers) {
			System.out.println(element);
		}
	}

}
