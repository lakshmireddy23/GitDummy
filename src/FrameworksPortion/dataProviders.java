package FrameworksPortion;
 import org.testng.annotations.DataProvider;
 import org.testng.annotations.Test;

public class dataProviders {
	
		public class dataP2 {
		
		@Test(dataProvider="dp")
		public void mobileLoani(String uname, String pwd) {
			System.out.println(uname);
			System.out.println(pwd);

		}

		
	 @DataProvider(name="dp")
	    public Object[][] getData() {
		Object data[][]=new Object[3][2];
		
		//1st set
		data[0][0]="first name";
		data[0][1]="pwd1";
		
		//
		data[1][0]="second name";
		data[1][1]="pwd2";
		
		//
		data[2][0]="third name";
		data[2][1]="pwd3";
		 
		return data;
	}
		
		
	}
}


