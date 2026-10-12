package com;

public class JobEligibility {

	public static void main(String[] args) {
		int age = 30;
		int graduationPercetage=60;
		boolean hasBacklogs=true;
		
		if(age>=21 && age<=30&&graduationPercetage>=60&&!hasBacklogs) {
			
					System.out.println("Eligible for Interview");
	     	}else {
					System.out.println("Not eligible for interview");
				}
			
		

	}

}
