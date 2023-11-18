package August011;

public class twoDarrNonPriDataTyp {

	public void arr2D() {
		String arr[][] = new String [5][3];

		arr[0][0]   = "James";
		arr[0][1]   = "Mahesh";
		arr[2][2]   = "John Mathew";
		arr[4][1]   = "Paulson";
		arr[3][2]   = "Lixon Mandro";
		arr[4][0]   = "Stebin";
		arr[0][2]	= "Antony";
		System.out.println(arr[4][0]);
		System.out.println("--------------------------");
	// Method 1	
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("==========================");
	// Method 2
		{
		for (String[] s : arr ) {
			for(String s1 : s) {
				System.out.print(s1);
				System.out.print("\t");
			}
			System.out.println();
		}
		}
		System.out.println("__________________________");
	}
		public static void main(String[] args) {
			twoDarrNonPriDataTyp t = new twoDarrNonPriDataTyp();
			t.arr2D();
		}
}
