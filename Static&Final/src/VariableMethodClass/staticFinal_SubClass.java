package VariableMethodClass;

// import VariableMethodClass.staticFinal_SuperClass;

public class staticFinal_SubClass {
		
					public static void main (String[] args) {
					//	staticFinal_SubClass.Method2();					//static methods can be executed by creating extends in subclasses.
						staticFinal_SuperClass.Method2();				//Without creating object, we can use Static Methods from SuperClass.
						
						
						
						staticFinal_SuperClass m = new staticFinal_SuperClass();
						m.Method1();
					//	m.Method2();		The static method Method2() from the type staticFinal_SuperClass should be accessed in a static way
						m.Method3();
						
						
						
					/*	staticFinal_SubClass k = new staticFinal_SubClass();
						k.Method1();		// Extends option can access this Method() from SuperClass.
						k.Method2();		The static method Method2() from the type staticFinal_SuperClass should be accessed in a static way  
						k.Method3();				*/
					}
}
