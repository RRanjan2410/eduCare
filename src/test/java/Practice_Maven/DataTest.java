package Practice_Maven;

import org.testng.annotations.Test;

public class DataTest {
	
	@Test
	public void connectToDB() {
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		String un=System.getProperty("username");
		String pw=System.getProperty("password");
		
		System.out.println("url------"+url);
		System.out.println("browser-----"+browser);
		System.out.println("username------"+un);
		System.out.println("password-----"+pw);
	}

}
//http://rmgtestingserver/domain/Student_Management_System/view/login.php