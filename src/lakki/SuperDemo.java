package lakki;

class SuperDemo {
	int x=10;   }


class Supr extends SuperDemo{
	int x=20;
	void m1() {
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		
	}
	public static void main(String[] args) {

		Supr s2= new Supr();
		 s2.m1();
		
	}
}



	


