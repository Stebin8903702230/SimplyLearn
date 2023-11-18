package August09;

public class ClassVariable {		// Class
	String s = "Stebin";					// Class variable with initialization
	int xxxx;								// Class variable without initialization
	
	static String name = "james";			// Static variable with initialization
	
	final int err = 400;					// Final variable with initialization
									
		public void method1() {			// Method1
			s = "Asher";					// Existing variable can be assigned by replacing the class variable.
			xxxx = 24;						// 
			name = "gosling";				// 
		/*	err = 401;						//	Final variable cannot be assigned to new value */
			final String names = s;			// Local final variable can be assigned inside the method
			System.out.println(names);		// output from final variable will be executed
			
			int xxxx = 40;
			System.out.println(s);
			System.out.println(xxxx);
			}
		
		public void method2() {
			s = "james";
			System.out.println(xxxx);
		}
		
		public void method3() {
			System.out.println(s);
			System.out.println(xxxx);
		}
		
	public static void main(String[] args ) {
		ClassVariable S = new ClassVariable();
			S.method1();
			S.method2();
			S.method3();
	}
}
