package lakki;

public class Samp extends InterDemo{

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

}
