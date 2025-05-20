package rama.sita;

public class Student {
	protected int rollno=101;
	
	protected Student() {
		rollno=102;
	}
	
	protected void Printrn() {
		System.out.println(rollno);
	}
	
	public void abc() {
		Printrn();
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.abc();
	}

}
