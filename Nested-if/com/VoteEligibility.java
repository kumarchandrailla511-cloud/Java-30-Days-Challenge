package com;


public class VoteEligibility {

	public static void main(String[] args) {
		int age = 18;
		boolean hasVoterId=false;
		
		if(age>=18) {
			
			if(hasVoterId == true) {
				System.out.println("Eligible for vote");
			}
			else {
				System.out.println("Voter Id is required");
			}
		}else {
			System.out.println("Not eligible for vote");
		}

	}

}
