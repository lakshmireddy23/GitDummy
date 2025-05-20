package rama.sita;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		/*
		String s1="HeLlo";
		String s2="hello";
		
		System.out.println(s1.endsWith("lo"));
		
		System.out.println(s1.toCharArray());    //HeLlo       */
		
		String s=new String(" HeLlo world ");
		String s2=new String(" Hello WORLD ");
		
		System.out.println(s.indexOf('o'));      //5
		System.out.println(s.lastIndexOf("l"));  //8
		System.out.println(s.trim()); //(HeLlo world)
		
		System.out.println(s.substring(1));  //eLlo world
		System.out.println(s.substring(2,8));//Llo wo
		System.out.println(Arrays.toString(s.split("\\^")));
		
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s.contains(" wor"));
		System.out.println(s.replace('H','k'));
		System.out.println(s.replace("world", "rakki"));
		System.out.println(s.compareTo(" Hello"));//-32
		
		int i=34567;
		String s3=String.valueOf(i);
		System.out.println(s3);// int value can store in string
		
		String j= "3456";  //  2)"rambabu"
		int s4=Integer.valueOf(j);
		System.out.println(s4);// 1)string value store in int     2) (string j="rambabu"...direct string throw an CE)
		
		String ss1="";
		String ss2=" ";
		String ss3="jimmy"; 
		
		System.out.println(ss1.length());  // 0 
		System.out.println(ss2.length());   // 1	
		
		System.out.println(ss1.isEmpty());  // true
		System.out.println(ss2.isEmpty());  //false
		System.out.println(ss3.isEmpty());  // false
		
		System.out.println(ss1.isBlank());  // true
		System.out.println(ss2.isBlank());  //true		
		System.out.println(ss3.isBlank());  //false      blank means with/without space true, any content false
		
		

		
		
	}


	

}
