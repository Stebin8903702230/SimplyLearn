package August07;

public class loopStatements {

	public void forTest() {
		for(int i =1;i<=5;i++) {
			System.out.println("Stebin "+i);
			}
		for(int i=3;i>=0;i--) {
			System.out.println(i+" "+"Stebin");
			}
	}
	
	public static void main(String[] args) {;
		loopStatements A = new loopStatements();
		A.forTest();
	}
}
