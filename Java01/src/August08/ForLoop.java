package August08;

public class ForLoop {

	public void forTest() {
		for(int i =0;i<=8;i++)			// Initialization, Conditional, Iteration.
			{
			System.out.print(" "+i);   							// for Same line and space b/w numbers
			}
		System.out.println();									// for next line to shift
		
		System.out.println();									// for leaving a line

		for(int i=8;i>=0;i--) 			// Level Indicator of tank from 8 to 0 ltr.
			{
			if (i == 1) {
				System.err.println(i+" Tank level low");
				continue;
			}if (i == 0) {
				System.err.println(i+" Tank empty");
			    break;
			}else 
				{
				System.out.println(i+" Tank Full");
				}
			}
}
		
	
	public static void main(String[] args) {;
		ForLoop A = new ForLoop();
		A.forTest();
	}
}
