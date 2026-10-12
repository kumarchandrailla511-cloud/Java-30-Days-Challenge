package com;

public class ElectricityBill {

	public static void main(String[] args) {
		int units = 250;
		int bill = 0;
		boolean isSeniorCitizen = true;
		
		if(units<=100) {
			bill = units*5;
			if(isSeniorCitizen) {
				int Discount =bill*10/100;
				System.out.println("Dicount "+ Discount);
				System.out.println("Total bill " +(bill-Discount));
			}else {
				System.out.println("No discount");
			}
		}else {
			bill = units*8;
			if(isSeniorCitizen) {
				System.out.println("Total Bill "+ bill);
				int Discount =bill*10/100;
				System.out.println("Dicount "+Discount);
				System.out.println("Total bill " + (bill-Discount));
				
			}else {
				System.out.println("dicount 0");
				System.out.println("Final bill " + bill);
			}
		}

	}

}
