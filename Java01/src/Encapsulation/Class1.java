package Encapsulation;

public class Class1 extends CommonClass {
		public static int a = 420;
		long y = 9456763246L;
		protected static long d = 45687895121L;
		
		public static void main(String[] args) {
			CommonClass p = new CommonClass();
			Class1 k = new Class1();
			p.studentID();				System.out.println(a);
			p.studentContact(); 		System.out.println(k.y);
			p.studentAddress();			System.out.println(p.Address);
		}

}
