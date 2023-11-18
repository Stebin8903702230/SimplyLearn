package com.RunTimePolymorphism;

public class PriceWithMRP extends Products {
	

			public void mobile (int DiscountPriceMobile) {
				
				super.mobile(30000);
				
				DiscountPriceMobile	= DiscountPriceMobile-100;
				System.out.println("Mobile Discount Price \t:"+ DiscountPriceMobile);
			}
			
			public void Bag (float DiscountPriceBag) {
				
				super.Bag(DiscountPriceBag);
				
				DiscountPriceBag	= (float) (DiscountPriceBag - 0.02) ;
				System.out.println("Bag Discount Price \t:"+ DiscountPriceBag);
			}

			
		public static void main (String[] args ) {
			Products p = new Products();
			p.mobile(25000);
			p.Bag(2000);
				System.out.println("====================");
			
				
			PriceWithMRP MRP	= new PriceWithMRP();
			MRP.mobile(6000);
			
				System.out.println("_____________________");
			MRP.Bag(2000);
			
			
						
			
		}
			
}
