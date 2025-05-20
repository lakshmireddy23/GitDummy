package lakki;

public abstract class Vehicle {
	Vehicle (){
		
		this(900, "ram");
		System.out.println("i am default cons");
	}
	
private Vehicle(int a, String b) {
	System.out.println("i am default cons:"+ a+" "+b);
}
}

/*class Bar extends Vehicle{

	Bar(){
		
	}
	
	public static void main(String[] args) {
		Bar d =new Bar();
	}
}  */