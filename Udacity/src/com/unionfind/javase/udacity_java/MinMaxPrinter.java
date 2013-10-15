package com.unionfind.javase.udacity_java;

import java.util.Scanner;



public class MinMaxPrinter {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int min = 0;
		int max = 0;
		/*System.out.print("Enter an integer: ");
		if (scanner.hasNextInt()){
			if (scanner.nextInt() < min){
				min = scanner.nextInt();
			} else if (scanner.nextInt() > max){
				max = scanner.nextInt();
			}*/
			do {
				System.out.print("Enter an integer: ");
				int val = scanner.nextInt();
				if (val < min)
					min = scanner.nextInt();
				else if (scanner.nextInt() > max)
					max = scanner.nextInt();
			} while (scanner.hasNextInt());
		//}
		
		System.out.print("Min = " + min + ", Max = " + max);
		
	}

}
