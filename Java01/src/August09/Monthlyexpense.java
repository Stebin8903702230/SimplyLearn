package August09;

public class Monthlyexpense {

	int Petrol;
	int Food;
	static int RoomRent = 6000;
	final int MobileRecharge = 399;
	String Donation = "Child care";
	boolean MonthlyBudget;
	
		public void Day1() {
			int Petrol = 50;
			int Food = 300;
			double Day1; 
			Day1 = Petrol + Food;
			System.out.println("1st day P+F = "+ Day1);
		}
	
		public void Day2() {
			int Petrol = 100;
			int Food = 500;
			double Day2; 
			Day2 = Petrol + Food;
			System.out.println("2nd day P+F = "+ Day2);
		}
		public void Days30() {
			Petrol = 75;
			Food = 400;
			double Day30; 
			Day30 = Petrol + Food;
			System.out.println("30days P+F =  "+ Day30);
		}

		public void Monthly() {
			int sum; 
			sum = Petrol + Food + RoomRent + MobileRecharge;
			{
				System.out.println("Total exp :" + sum);
			}
		}
	public static void main(String[] args) {;
			Monthlyexpense S = new Monthlyexpense();
			S.Day1();
			S.Day2();
			S.Days30();
			S.Monthly();
	}
			
}
	
	
