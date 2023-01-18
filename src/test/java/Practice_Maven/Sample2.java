package Practice_Maven;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups = "smoke")
	public void edit() {
		System.out.println("project edited");
	}
	
	@Test(groups = "regression")
	public void update() {
		System.out.println("project updated");
	}

}
