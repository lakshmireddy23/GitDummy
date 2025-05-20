package lakki;

public class Staticdemo {
	int add(int a,int b)
	{
		int ant;
		ant= a+b;
		return ant;
	}
	

	public static void main(String[] args) {
		
		Staticdemo ad= new Staticdemo();
		
		int s =ad.add(10, 15);
		
		System.out.println(s);
	}

}



