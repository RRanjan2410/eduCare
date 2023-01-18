package Practice_Maven;

import org.testng.annotations.Test;

public class Sample3 {
	
	@Test(groups = "regression")
	public void test5() {
		System.out.println("==== test5 ====");
	}
	
	@Test(groups = "smoke")
	public void test6() {
		System.out.println("==== test6 =====");
	}



}
