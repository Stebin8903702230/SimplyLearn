package August07;

public class Conditionalstatements {

	public void ifTest() {
		
		int errorcode = 500;

			if(errorcode == 400) {
				System.out.println("Bad Request");
				
			}else if(errorcode == 401) {
				System.out.println("Unauthorized");
			
			}else if(errorcode == 403) {
				System.out.println("Forbidden");
				
			}else if(errorcode == 404) {
				System.out.println("Not allowed");
				
			}else if(errorcode == 405) {
				System.out.println("Method not allowed");
				
			}else if(errorcode == 500) {
				System.out.println("Internal server error");
				
			}else {
				System.out.println("Invalid error code");
			}

	}
			public static void main(String[] args) {
				Conditionalstatements A = new Conditionalstatements();
				A.ifTest();
			}
}	