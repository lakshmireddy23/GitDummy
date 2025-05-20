package lakki;

public class SupM extends Supr1{
	
	void m2() {
		super.m2();
		System.out.println("i am from Child class");

	}

	public static void main(String[] args) {
		SupM s2= new SupM();
//		Supr1 s3= new Supr1();

		//s3.m2();		
		s2.m2();

	}

}
