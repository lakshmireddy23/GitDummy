package rama.sita;

public class ThrowTest2 {
	
	public void display()
	{
		int a=3/0;
		System.out.println(a);
	}
	public static void main(String[] args)  {
		ThrowTest2 t1=new ThrowTest2();
		
		try {
		t1.display();}
		catch(ArithmeticException aer) {
		System.out.println("areaer");
		}
}
}