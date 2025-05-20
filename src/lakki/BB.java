package lakki;

/*
 * public class Ang {
	int x=10;
	{
		System.out.println("A nsb");	
		System.out.println("x:"+x);
	}	
		 Ang() {
		 
			System.out.println("A const");
			 x=5;
		}
	}*/
public class BB extends Ang{
	int y=20;
	{
		System.out.println("B nsb");
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	
		 BB() {
					 super();
			 y=30;
			System.out.println("B const");

		}

	public static void main(String[] args) {
		
		System.out.println("main method");

		BB b=new BB();
		System.out.println("x:"+ b.x);	
		System.out.println("y:"+ b.y);
	
	}
}
