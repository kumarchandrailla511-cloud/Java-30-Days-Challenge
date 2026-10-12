package com;

public class EmployeeBonus {

	public static void main(String[] args) {
		int experiance=5 ;
		int salary = 30000;
		int bonus = 0;
		
		if(experiance>=5) {
			
			if(salary<30000) {
				System.out.println("Eligible for 20% bonus");
				 bonus = salary*20/100;
				System.out.println("Bonus Amount "+bonus);
				System.out.println("Final Amount "+(salary+bonus));
			}else {
				System.out.println("Eligible for 10% bonus");
				 bonus = salary*10/100;
				System.out.println("Bonus Amount "+bonus);
				System.out.println("Final Amount "+(salary+bonus));
			}
		}else {
			System.out.println("Final salary "+salary);
		}

	}

}
