package rama.sita;

public class Exhandling {

	public static void main(String[] args) {
		System.out.println("main 1");
		
		
try {
			int a=10, b=0;
			int c = a/b;
			System.out.println(c);
			System.out.println("try block");

		}
   
catch     (ArithmeticException ae) {
		   System.out.println("hai this catch block");

		ae.printStackTrace();
	}
finally  {
	      System.out.println("this is finally");
}
   }
		
	}


