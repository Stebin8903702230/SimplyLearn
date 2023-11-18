package August07;

public class switchStatement {;

	public static void main(String[] args) {;
			int errorcode = 409;
			
			switch(errorcode) {
			case 400 :    // instead of numbers, string funtion also can be used with double quotes(").
				System.out.println("Bad request");
				break;
				
			case 401 :
				System.out.println("Unauthorised");
				break;
				
			case 403 :
				System.out.println("Forbidden");
				break;
				
			case 404 :
				System.out.println("Not found");
				break;
				
			case 405 :
				System.out.println("Method not allowed");
				break;
				
			case 500 :
				System.out.println("Internal server error");
				break;
				
			default :
				System.out.println("Invalid error code");
				break;
				
			case 502 : 
				System.out.println("Bad Gateway");
				break;
		}
		
	}

}
