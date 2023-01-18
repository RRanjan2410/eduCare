package Practice_Maven;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test(groups = "smoke")
	public void create() {
		System.out.println("project created");
	}
	
	@Test(groups = "regression")
	public void update() {
		System.out.println("project updated");
	}

}
