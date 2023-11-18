package August10;

public class ArrayNonPrimitiveDataType {
	// Array method using Non-primitive data type
		public void arrayTest() {
			String city[] = new String[6];	// Memory assigned to store multiple variable (0 to 5).
										// "Null" for Non-primitive DataType if not assigned.
			city [0] = "Chennai";		// Individual name if required shall be assigned.
			city [1] = "Trichy";
			city [5] = "Madurai";
			city [2] = "Coimbatore";
			city [3] = "Kanyakumari";
		/*	city [10]= 10;	//Cannot be executed since the assigned name starts from 0 to 5 [6 names]*/
			System.out.println(city[3]); 		// To execute the specified output.
			System.out.println("=======");
			System.out.println(city.length);	// Length of array
			System.out.println("----------");
			System.out.println(city[3].indexOf("y")); // letter locator in a name
			System.out.println("***********");
			System.out.println(city [3].toUpperCase()); // To UpperCase
			System.out.println("^^^^^^^^^^^^");
//	 	To execute multiple variables in sequence.	
		// Method 01
			for (int i=2; i<city.length;i++) {	// Conditions can be changed as per requirements.
				System.out.println(city[i]);	// To execute names in sequence with conditional iteration.
			}
				System.out.println("++++++++");
		// Method 02		
			for (String a : city) {				// To execute names in sequence without conditional.
				System.out.println(a);
			}
		}

		public static void main (String[] args) { 
			ArrayNonPrimitiveDataType Oc = new ArrayNonPrimitiveDataType();
				Oc.arrayTest();
		}
}
