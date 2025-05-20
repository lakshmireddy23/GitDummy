package rama.sita;

public class StrBuffMethods {

	public static void main(String[] args) {

	/*	StringBuilder s1=new StringBuilder("durga");
		StringBuilder s2=new StringBuilder("durga");
		
	System.out.println(s1==s2);//false
	System.out.println(s1.equals(s2));//false
*/		
		StringBuilder s1=new StringBuilder("durga raoo");
		String s2="welcome to laxman";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		int[] a= {1,2,3,8,5,6};
		System.out.println(a.length);
		
		//Now below to start strbuffer methods.......................
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity()); //16
		sb.append("abcdefghjklinsdf");
		   System.out.println(sb.capacity()); // still 16 only
		   sb.append("z");
		   System.out.println(sb.capacity()); //34
	
		StringBuffer sb1=new StringBuffer("durga");
		System.out.println(sb1.charAt(3));
		
		try {System.out.println(sb1.charAt(13));}
		catch(Exception e) {System.out.println("StrIndOutofBoundExc");}
				
		sb1.setCharAt(3,'k');
		System.out.println(sb1); //durka
		
		StringBuffer sb2=new StringBuffer("durga rao");
		sb2.append(" i am remo");
		sb2.append(1.5);
		sb2.append(false);
		   System.out.println(sb2);
		   
			StringBuffer sb3=new StringBuffer("abcdefgh");
		//sb3.insert(2,"zym");
		//sb3.insert(3, 12.45);
	     //sb3.insert(7,false);
		   //System.out.println(sb3);
		
			// System.out.println(sb3.delete(2, 5));//abfgh  from to end-1
			// System.out.println(sb3.deleteCharAt(2));
			 //System.out.println(sb3.reverse());
		//	sb3.setLength(4);
		//	System.out.println(sb3);     
			
			
			StringBuffer sb4=new StringBuffer();
			sb4.ensureCapacity(1000);
          //System.out.println(sb4.capacity()); 
			sb4.append("romeo");
			System.out.println(sb4.capacity()); //	1000
			sb4.trimToSize();
			System.out.println(sb4); //romeo
			System.out.println(sb4.capacity()); //	5

			
			
				 
			 
			 
			 
			 
		


		
		
		
		
		
		
		
		
		

		
	}

}
