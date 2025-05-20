package lakki;
public class Ant {
	
	public int book(int a, int b){
		int c;
		c=a+b;
		return c; 	
	}
	 
	//INstance block
	{System.out.println("this is my Instntce block");}
	
	//static block
	static {System.out.println("this is static block");}
	
	//simple method
	public Ant()
	{
		System.out.println("this is contructor area"); }
	
	
	public static void main(String[] args) {
		System.out.println("this is main method");
		Ant a1 =new Ant();
		
		int k=a1.book(2,3);
		System.out.println(k);
		
	
		}	{System.out.println("this is my Instntce block2");}

}
