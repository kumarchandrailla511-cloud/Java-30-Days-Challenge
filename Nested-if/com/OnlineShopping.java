package com;

public class OnlineShopping {

	public static void main(String[] args) {
		int purchaseAmount = 3000;
		int discount = 0;		
		boolean isMember = true;
		
		if(purchaseAmount>=5000) {
			if(isMember) {
				System.out.println("Discount Amount = " +(discount = purchaseAmount*20/100));
				System.out.println("Final Bill = "+ (purchaseAmount-discount));
			}else {
				System.out.println("Discount Amount = " +(discount = purchaseAmount*10/100));
				System.out.println("Final Bill = "+ (purchaseAmount-discount));
			}
		}else {
			System.out.println(" discount "+discount);
			System.out.println("Finall Bill = "+ purchaseAmount );
		}

	}

}
