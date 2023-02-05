package failedrerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedDemo2 {

	@Test
	public void test4() {
		
		System.out.println("test4");
	}
	
	@Test
	public void test5() {
		
		System.out.println("test5");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test6() {
		
		System.out.println("test6");
	}
	
}
