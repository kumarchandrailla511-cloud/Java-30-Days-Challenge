package com;

public class LargestOfThree {
	public static void main(String[] args) {
		int a = 40;
		int b = 85;
		int c = 60;
		
		if(a>b&&a>c) {
			System.out.println("a is largest");
		}else if(b>a&&b>c) {
			System.out.println("b is largest");
		}else{
			System.out.println("c is largest ");
		}
	}

}
