package Encapsulation;

public class CommonClass {
	
	public static int a = 120;
	private static String name = "Arul Singh";
	protected static long d = 8903702230L;		// Contact Number
	public String Address = "Sacret Heart";
	static boolean b = true;
	
		public int studentID() {
			int call = 5;
			System.out.print("Student ID"+"\t" + ": ");
			return call;
		}
		
		private void studentName() {
			System.out.print("Student Name"+"\t" + ": ");
		}
		
		protected void studentContact() {
			System.out.print("Student Contact"+"\t" + ": ");
		}
		
		void studentAddress() {
			System.out.print("Student Address"+"\t" + ": ");
		}
		
		
			public static void main (String[] args) {
			CommonClass x = new CommonClass();
			x.studentID();			System.out.println(a);
			x.studentName();		System.out.println(name);
			x.studentContact();		System.out.println(d);
			x.studentAddress();		System.out.println(x.Address);
			
		}

}
