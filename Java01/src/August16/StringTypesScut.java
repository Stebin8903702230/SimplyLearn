package August16;

public class StringTypesScut {
	public static void main(String[] args) {
		
		String s = "Lixon Mandro";
		String S1 = "lixon mandro";
		String A1  = "  Lixon Mandro  ";
		
		System.out.println(s);					// to print the value given to variable.
		System.out.println(S1);	
		
		int length = s.length(); 				// Ctrl+ 2, l (to use while Return type method)
		System.out.println(length);				// to find the number of character in the words
		
		String concat = s.concat(" Samuel");
		System.out.println(concat);				// to add to the existing words
		
		System.out.println(s+" Jacob");			
		
		boolean equals = s.equals(S1);
		System.out.println(equals);				// to compare two values
		
		boolean equals2 = s.equals("Lixon Mandro");
		System.out.println(equals2);			// To compare the string
		
		boolean equals3 = S1.equals("lixon jacob");
		System.out.println(equals3);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(S1);
		System.out.println(equalsIgnoreCase);	// to compare Lowercase / Uppercase
		
		int indexOf = s.indexOf('n');
		System.out.println(indexOf);			// first index(position) of character
		
		int lastIndexOf = s.lastIndexOf('o');
		System.out.println(lastIndexOf);		// index of character from the last.
		
		char charAt = s.charAt(6);
		System.out.println(charAt);			// to print the character located in 5th position
		
		boolean startsWith = s.startsWith("Lix");
		System.out.println(startsWith);		// to check the string whether that starts with the given string
		
		boolean endsWith = s.endsWith("dro");
		System.out.println(endsWith);		// to check the string whether that ends with the given string
		
		boolean contains = s.contains("and");
		System.out.println(contains);		// to check the string whether that the given string is available anywhere
		
		System.out.println(A1);
		String trim = A1.trim();			// to trim the unwanted space (front/ Back)
		System.out.println(trim);		
		
		String replace = S1.replace("xon", "on");	// Replace the string with the given string
		System.out.println(replace);
		
		String substring = s.substring(3);
		System.out.println(substring);				// to print the string located from the specified index
		
		String substring1 = s.substring(1, 8);
		System.out.println(substring1);				// 
		
		String[] split = S1.split(" ");		// to split the string using a character and divide into multiple strings
			for (int i=0; i<split.length;i++) {  // multiple strings/ values will be stored as an Array
		System.out.println(split[i]);
			}
	}
}


