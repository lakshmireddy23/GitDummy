package rama.sita;

public class ThrowTest {
	static void validate(int age) {
		if (age<18) {
			throw new ArithmeticException(" U r not-eligble");
		}
		else {System.out.println("yes U can vote");}
	}
	

	public static void main(String[] args) {
		validate(15);
		
		System.out.println("program close");

	}

}
