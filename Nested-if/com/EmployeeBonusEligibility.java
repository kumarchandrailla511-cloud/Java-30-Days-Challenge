package com;

public class EmployeeBonusEligibility {

	public static void main(String[] args) {
		int Experiance=3;
		int salary = 35000;
		
		if(Experiance>=2) {
			if(salary<30000) {
				System.out.println("Eligible for bonus");
			}else {
				System.out.println("Salary to high for bonus");
			}
		}else {
			System.out.println("Not enough Experiance");
		}

	}

}
