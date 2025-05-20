package lakki;

public class ParentC {

	int a=10, b=15;
	 void add() {
		 System.out.println(a+b);
	 }}
	 
	 class subs extends ParentC {

			int a=10, b=15;
			 void sub() {
				 System.out.println(a-b);
			 }}
			 
			 
			 class multi extends subs {

					int a=10, b=15;
					 void mul() {
						 System.out.println(a*b);
					 }}
	 
					 class division extends multi {

							int a=10, b=15;
							 void div() {
								 System.out.println(a*b);
							 }}
		class Ram{
	
	public static void main(String[] args) {
		
		division obj=new division();
		obj.add();
		obj.sub();
		obj.div();
		
	}}
	


