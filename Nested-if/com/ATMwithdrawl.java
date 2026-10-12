package com;

public class ATMwithdrawl {

	public static void main(String[] args) {
		int balance = 10000;
		int withdrawAmount = 6000;
		int pin =1234;
		
		if(pin==1234) {
			if(withdrawAmount>0&&withdrawAmount<=balance) {
				System.out.println("withdrawl successful");
				System.out.println("Remaining blance - " +(balance-withdrawAmount));
			}else {
				System.out.println("Insufficient amount Or invalid");
			}
		}else {
			System.out.println("Incorrect Pin");
		}
		

	}

}
