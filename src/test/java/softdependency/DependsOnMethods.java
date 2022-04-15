package softdependency;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	int a = 1;
	int b = 7;
	
	@Test
	public void step1()
	{
		Assert.assertTrue(a<b);
		System.out.println("Inside step1");
	}
	
	@Test
	public void step2()
	{
		Assert.assertTrue(a>b);
		System.out.println("Inside step2");
	}
	
	@Test(dependsOnMethods = {"step1","step2"},alwaysRun=true)
	public void step3()
	{
		System.out.println("Inside step3");
	}
}
