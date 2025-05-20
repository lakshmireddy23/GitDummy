package lakki;

public class Example {
	String name;
	String address;
static	String city="banglore";

 //static { System.out.println((i));}

public Example(String a, String b){
	name=a;
	address=b;
	
	    
	    }
   
	public void display() {
		System.out.println(name+" "+address+" "+city); 
	
	} 
	/*public static void getCity() {
		System.out.println(city);
		
	} */
	
	public static void main(String[] args) {
		
		Example sv1=new Example("laki","klanka");
		Example sv2=new Example("bokka","klanka2");

		
	sv1.display();
		sv2.display();
		//StaticVar.getCity();	
		
	}	}