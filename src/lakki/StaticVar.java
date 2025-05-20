package lakki;

public class StaticVar {
	String name;
	String address;
static	String city="banglore";
static int i;
 //static { System.out.println((i));}
	
	StaticVar(String a, String b){
		name=a;
		address=b;
	    
	    i++;
	    System.out.println(i);
	    
	    
		
	}
	public void display() {
		System.out.println(name+" "+address+" "+city);
		}
	/*public static void getCity() {
		System.out.println(city);
		
	} */
	
	public static void main(String[] args) {
		
		StaticVar sv1=new StaticVar("laki","klanka");
		StaticVar sv2=new StaticVar("bokka","klanka2");

		
		sv1.display();
		sv2.display();
		//StaticVar.getCity();
		
		
	}

	}
