package org.tektutor;

import java.util.Scanner;

public class Main {
	
	public static void displaymenu() {
		System.out.println("Main Menu");
		System.out.println("Quick Sort ---->1");
		System.out.println("Insertion Sort--->2");
		System.out.println("Heap Sort--->3");
		System.out.println("Exit--->4");
	}
	
	public static int getChoice() {
		
		System.out.println("Enter your choice : ");
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
		
			
		}

	public static void doWork(int choice) {
		IAlgorithm algorithm = AlgorithmFactory.getAlgorithm(choice);
		algorithm.sort();
	}
	public static void main(String[] args) {
		
		int choice = 0;
		while(choice!=4) {
			displaymenu();
			choice = getChoice();
			if(choice != 4)
				doWork(choice);

	 }
		System.out.println("Application exit successfully!!");
		

   }
}
