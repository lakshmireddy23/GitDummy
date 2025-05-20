package rama.sita;

public class ThrowsSub {

	static void validate(int age) throws Throws1
	{
		if (age<18) {
			throw new Throws1(" U r not-eligble");
		}
		else {System.out.println("yes U can vote");}
	}
	

	public static void main(String[] args) {
		
		try {
			validate(15);
		} catch (Throws1 e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("program close");



}}
