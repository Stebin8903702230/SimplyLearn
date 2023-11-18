package hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapString {
	Map<String, String> ID = new HashMap<>();
	String Username;
	String Password;
	Scanner  S = new Scanner(System.in);

	public void hashTest() {
		ID.put("Lixon Mandro", "pwd1");
		ID.put("Antony", "pwd2");
		ID.put("Sandy", "pwd3");
		ID.put("Antony", "pwd4");
		ID.put("Johnson", "pwd5");
		ID.put("Michel", null);
		ID.put("Updated Null", null);
		ID.put("lionel", "pwd6");
		ID.put("Antony", "pwd7");
	//	ID.put(null, 0);
		System.out.println("Username");
		Username = S.next();
		System.out.println("Password:");
		Password = S.next();
		if (ID.containsKey(Username) && ID.containsValue(Password)){
			System.out.println("Ok");
		}else {
			System.out.println("Not ok");
		}
		}
		public static void main (String[] args ) {
			HashMapString h = new HashMapString();
			h.hashTest();
		}
	}
						

