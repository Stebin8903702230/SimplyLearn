package August16;

public class Split {
	
		String s =  "Name";
		
	public void separate() {
		String[] split = s.split("");		
			for (int i=0; i<split.length;i++) {
		System.out.println(split[i]);
			}
	}	
			
			
	public static void main (String[] args) {
		Split s = new Split();
		s.separate();
	
	}
}
