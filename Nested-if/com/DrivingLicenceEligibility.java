package com;

public class DrivingLicenceEligibility {

	public static void main(String[] args) {
		int age =18;
		boolean passedtest = true;
		
		if(age>=18) {
			System.out.println("Eligible for driving test ");
		if(passedtest) {
			System.out.println("Eliginle for Driving Licence");
		}else {
			System.out.println("Driving Test Not Passed");
		}

	}else {
		System.out.println("Underage");
	}

}
}
