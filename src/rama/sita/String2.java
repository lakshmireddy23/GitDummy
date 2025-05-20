package rama.sita;
public class String2 {
public static void main(String[] args) {

		String s1=new String("Laxman Reddy");
		String s2=new String("Laxman Reddy");
           System.out.println(s1==s2); // false
			
		String s3="Laxman Reddy";
		   System.out.println(s1==s2); // false
		   
		String s4= "Laxman Reddy";
		   System.out.println(s3==s4); // true
		   
		String s5="Laxman"+" Reddy";
		  System.out.println(s4==s5); // true
		  
		String s6="Laxman";
		
		String s7=s6+"Reddy";
		  System.out.println(s4==s7); // false
   
		  final	String s8="Laxman";
	String s9=s8+"Reddy";
	  System.out.println(s4==s9); // false
	}

}
