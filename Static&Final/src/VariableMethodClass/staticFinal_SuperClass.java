package VariableMethodClass;
public class staticFinal_SuperClass {
			String variable1		=	"Normal Class Variable1";
			static String variable2	=	"Static Class Variable2";
			final String variable3	=	"Final Class Variable3"; //Its value must be declared and can’t be changed or re-initialized further.
			static String variable4;	// it is not mandatory to initialize the static variable while declaring it.
	
					public void Method1() {
						variable4	= "Hello\n";							
						System.out.println("Public normal method1");
						System.out.println(variable1);
						System.out.println(variable2);
						System.out.println(variable3);
						System.out.println(variable4);
					}

					public static void Method2() {
						variable4	= "Hii\n";							// static variable can be reinitialized.	
						System.out.println("Public static method2");
					//	System.out.println(variable1);					// only Static variables can be called only by static methods.
						System.out.println(variable2);
					//	System.out.println(variable3);					// only Static variables can be called only by static methods.
						System.out.println(variable4);
					}
					
					public final void Method3() {
						System.out.println("Public Final method3");
						System.out.println(variable1);
						System.out.println(variable2);
						System.out.println(variable3);
						System.out.println(variable4);
					}
					
				public static void main (String[] args) {
					staticFinal_SuperClass.Method2();					//static methods can be executed without creating new object.
					
					staticFinal_SuperClass b = new staticFinal_SuperClass();
					b.Method1();
					b.Method3();
				//	b.Method2(); The static method Method2() from the type staticFinal_SuperClass should be accessed in a static way.
				}
}



