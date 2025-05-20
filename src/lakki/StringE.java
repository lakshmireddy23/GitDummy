package lakki;

public class StringE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rahul setty laxman";
		String[] ab=s.split(" ");
		//String[] ab=s.split("setty");
		System.out.println(ab[0]);
		System.out.println(ab[1]);
		System.out.println(ab[2]);
		//System.out.println(ab[1].trim());
		for(int i=s.length()-1; i>=0; i--)
		{	
			System.out.println(s.charAt(i));
		}
	}

}
