package lakki;

public class Sup2 extends Supr1 {
	
	
		int x=20;
		void m1() {
			int x=30;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(super.x);
			
		}
	

	public static void main(String[] args) {

		Sup2 s2= new Sup2();
		s2.m1();
	}

}
