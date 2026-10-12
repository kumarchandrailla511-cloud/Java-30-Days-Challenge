package com;

public class StudentScholarship {

	public static void main(String[] args) {
		int marks=95;
		int attendence=60;
		long familyIncome = 100000;
		int scholarShip =0;
		
		if(marks>=80) {
			if(attendence>=75) {
				if(familyIncome<=200000) {
					scholarShip=20000;
					System.out.println("Eligible for scholarship");
					System.out.println(scholarShip);
				}else {
					scholarShip = 10000;
					System.out.println("Eligible for scholarship");
					System.out.println(scholarShip);
				}
			}else {
				System.out.println("Not Eligible for scholarship");
			}
			
		}else {
			System.out.println("Not Eligible for scholarship");
		}

	}

}
