package August11;

public class twoDimArrayPrimitiveDT {
	
		public void arr2D() {
			int arr[][] = new int [5][2];
			arr[0][0]   = 23;
			arr[0][1]   = 33;
			arr[1][0]   = 63;
			arr[2][0]   = 10;
			arr[4][0]   = 5;
			arr[0][2]   = 8;
			arr[1][1]   = 30;
			
			System.out.println(arr[0][2]);

		}
		
		public static void main (String[] args) {
			twoDimArrayPrimitiveDT Object = new twoDimArrayPrimitiveDT() ;
			Object.arr2D();
		}
}
