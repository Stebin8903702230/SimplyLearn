package August011;

public class twoDarrPriDataTyp {
	public void arr2D() {					// 2-Dimensional Array method
		int arr[][] = new int [5][3];		// [No. of Row] [No. of Column]
		
		arr[0][0]   = 23;					// assigning value
		arr[0][1]   = 33;
		arr[2][2]   = 10;
		arr[4][1]   = 5;
		arr[3][2]   = 7;
		arr[4][2]   = 15;
		System.out.println(arr[0][0]);		// To execute specific value
		System.out.println("------------------");
	
	// Method 1	: To execute all values in sequence with conditional iterating.
		for (int i=0; i<arr.length; i++) {			// Iterating the no. of rows.
			for (int j=0; j<arr[i].length; j++) {	// Iterating the no. of columns.
				System.out.print(arr[i][j]);		// Print values of each row
				System.out.print("\t");				// for Tab space
			}
			System.out.println();
		}
		System.out.println("===================");
		
	// Method 2 : To execute all values in sequence without conditional iterating.
		{
		for (int[] s : arr ) {						// to Assign array rows and columns in s
			for(int s1 : s) {						// to transfer single value to execute
				System.out.print(s1+" ");
				System.out.print("\t");
			}
			System.out.println();
		}
		}
		System.out.println("___________________");
	}
		public static void main(String[] args) {
			twoDarrPriDataTyp t = new twoDarrPriDataTyp();
			t.arr2D();
		}
}
