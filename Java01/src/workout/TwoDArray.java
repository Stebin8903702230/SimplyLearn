package workout;

public class TwoDArray {
	
	public void td() {
int arr[][]= {{1,3,5,7,9},{2,4,6,8}};
		
for (int i=0; i<arr.length; i++) {
	for (int j=0; j<arr[i].length; j++) {
		System.out.print(arr[i][j]);
		System.out.print("\t");
	}
}
		System.out.println("\n\n");
		
		for (int [] i :arr) {
			for (int k : i) {
	//	System.out.println(arr[0][0]);
		System.out.print(k + "  ");
			}
		}
	}
	public static void main(String[] args) {
		TwoDArray td = new TwoDArray();
		td.td();
	}
}
