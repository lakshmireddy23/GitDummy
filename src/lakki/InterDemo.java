package lakki;

public class InterDemo implements Myinter,Myinter2{
	

	@Override
	public void m1() {
		 System.out.println("m1 meth");
		
	}

	@Override
	public void m2() {
		 System.out.println("m2 meth");
		
	}
	
	
	//add extra method 
	public void m3() {
		 System.out.println("m3 meth");
		 
	}
	
	public static void main(String[] args) {

		Myinter id=new InterDemo();
		id.m1();
		id.m2();

//       id.m3();   wrong call--this belongs to class level implementation
		
		InterDemo cl=new InterDemo();
		cl.m3();
		
		Myinter2 id2=new InterDemo();

		id2.m4();
		id2.m5();

		
		// id.x=20;    final keyword set default
		System.out.println(x);
	}

	@Override
	public void m4() {
		 System.out.println("m4 meth");
	
	}

	@Override
	public void m5() {
		 System.out.println("m5 meth");
    }
	
	
}
	

