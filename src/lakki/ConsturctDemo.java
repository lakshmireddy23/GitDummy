package lakki;

public class ConsturctDemo {
	String name;
	int code=8;
	
	// simple  non parameters constructor
	public ConsturctDemo()
	{ 
		System.out.println("this is simple constructor");
	 }
	
	// parameters constructor
	public ConsturctDemo(String str)
	{ this.name=str;
	System.out.println(str);
	 } 
	
	// 2 parameters constructor
	public ConsturctDemo(int a, int b)
	{ int c=a+b;
		System.out.println(c);
 }
	
	public void cDemo() 
	{
		System.out.println(name+" "+code); } 
	
	//Main method block
	public static void main(String[] args) {
		
		ConsturctDemo cd= new ConsturctDemo();
		ConsturctDemo cd1= new ConsturctDemo("ramu");
		ConsturctDemo cd2=new ConsturctDemo(10, 30);
		
	//	cd2.cDemo();
	
		

	}

}
