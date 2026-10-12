package com;

public class PositiveEvenOdd {
	
	public static void main(String[] args) {
		int a = -5;
		
		if(a>0) {
			System.out.println("Positive");
			if(a%2==0) {
				System.out.println("Even number");
				}else {
					System.out.println("Odd number");
				}
			
		}else {
			System.out.println("Negative");
		}
	}

}
