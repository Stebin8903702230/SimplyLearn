package HidingImplementationPart;

public class PaymentMethod extends SuperMarketStockProduct {

	@Override
	public void Electronics() {
		System.out.println("Pay by cash \t :");
	}

	@Override
	public void Watches() {
		System.out.println("Pay by cash \t :");
		
	}

	@Override
	public void Fancy() {
		System.out.println("Pay by cash \t :");
		
	}
	
		public void perfume() {
			System.out.println("Pay by Cashback \t:");
		}
		
		
		public static void main (String [] args) {
			PaymentMethod PAY = new PaymentMethod();
			PAY.Dress();
			PAY.Electronics();
			PAY.Watches();
			PAY.Fancy();
			PAY.perfume();
		}

}
