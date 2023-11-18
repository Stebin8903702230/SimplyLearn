package August13;

public class StringTypes {

	public static void main(String[] args) {
		
		String s = "Lixon Mandro";
		String S1= "lixon mandro";
		
		System.out.println(s);				// to print the value given to variable.
		System.out.println(S1);					
		System.out.println(s.length());			// to find the number of character in the words
		System.out.println(s.concat(" Samuel"));	// to add to the existing words
		System.out.println(s+" Jacob");			
		System.out.println(s.equals(S1));		// to compare
		System.out.println(s.equals("Lixon Mandro"));
		System.out.println(s.equals("lixon jacob"));
		System.out.println(s.equalsIgnoreCase(S1));	// to compare Lowercase / Uppercase
		System.out.println(s.indexOf('n'));			// first position of character
		System.out.println(s.lastIndexOf('o'));		// Last position of character
		System.out.println(s.charAt(5));			// to print the character located in 5th position
		System.out.println(s.charAt(0));
	}
}
