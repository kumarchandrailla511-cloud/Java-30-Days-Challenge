package com;

public class Largest {
	
	public static void main(String[] args) {
		int a = 50;
		int b = 50;
		int c = 20;
		
		if(a>=b && a>=c) {
			System.out.println("a is the large number");
		}else if(b>=c && b>=a) {
			System.out.println("b is the large number");
		}else {
			System.out.println("c is the large number");
		}
	}

}
