package August08;

public class WhileLoop {
		
			public void whileTest() {
				int i=5;										// Initialization
				while(i>0) {									// Conditional
					System.out.println(i+" hi");				
					i--;										// Iteration
				}
			}
										// Before run, check for condition is within the limit. 
				
			
		public static void main(String[] args ) {
			WhileLoop S = new WhileLoop();
			S.whileTest();
			
		}
}
