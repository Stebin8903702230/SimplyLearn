package August08;

public class DoWhile {
				public void doTest() {
					int k=-2;						// Initialization
					do
					{
					System.out.println(k);			// System will print directly the k value. (then iteration, conditional check)
					k++;							// Iteration
					}
					while (k<5);					// Conditional
				}
				
	public static void main(String[] args) {
		DoWhile f  = new DoWhile();
		f.doTest();
	}
}
