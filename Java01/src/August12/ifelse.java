package August12;

public class ifelse {
	public void ifTest() {
		int i= 56;
		
	if ((i>=40) && (i<=100)) {
		System.out.println("Pass");
	}else if ((i<39) && (i>0)) {
		System.out.println("Fail");
	}else 
		System.out.println("Invalid marks");
	}
	public static void main (String[] args) {
		ifelse h = new ifelse();
		h.ifTest();
	}
}

