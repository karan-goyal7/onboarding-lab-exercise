package com.amdocs;

import java.util.Scanner;

public class Addition {
	public int add(int x,int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int firstInput = scan.nextInt();
		int secondInput = scan.nextInt();
		
		Addition addition = new Addition();
		
		int res = addition.add(firstInput, secondInput);
		
		System.out.println("Result" + " : " + res);
	}

}
