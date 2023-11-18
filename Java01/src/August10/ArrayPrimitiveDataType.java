package August10;

public class ArrayPrimitiveDataType {
	// Array method using primitive data type
	public void arrayTest() {
		int marks[] = new int[20];	// Memory assigned to store multiple variable (0 to 19).
									// Default value for primitive DataType if not assigned.
		marks [0] = 12;				// Individual value if required shall be assigned.
		marks [1] = 46;
		marks [5] = 90;
		marks [16]= 86;
		marks [19]= 75;
		marks [2] = 50;
		marks [12]= 31;
		marks [3] = 40;
	/*	marks [20]= 10;	//Cannot be executed since the assigned value starts from 0 to 19 [20 values]*/
		System.out.println(marks[16]); 		// To execute the specified output.
		System.out.println("=======");
		
// 	To execute multiple variables in sequence.	
	// Method 01
		for (int i=0; i<marks.length;i++) {	// Conditions can be changed as per requirements.
			System.out.println(marks[i]);	// To execute values in sequence with conditional iteration.
		}
			System.out.println("++++++++");
	// Method 02		
		for (int a : marks) {		// To execute values in sequence without conditional.
			System.out.println(a);
		}
	}

	public static void main (String[] args) { 
		ArrayPrimitiveDataType Ob = new ArrayPrimitiveDataType();
			Ob.arrayTest();
	}
}

