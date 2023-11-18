package August12;

public class testArray {
	public void fortest () {
		int arr [] [] = new int [2][5]; {
			arr [0] [0] = 1;
			arr [0] [1] = 2;
			arr [0] [2] = 3;
			arr [0] [3] = 4;
			arr [0] [4] = 5;
			arr [1] [0] = 5;
			arr [1] [1] = 4;
			arr [1] [2] = 3;
			arr [1] [3] = 2;
			arr [1] [4] = 1;
		
			for (int i=0; i< arr.length; i++) {
				for (int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
			public static void main (String[] args) {
				testArray b = new testArray();
				b.fortest();
			}
}
