package dependency;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {
	int a = 1;
	int b = 7;
	
	@Test(groups={"check"})
	public void step1()
	{
		Assert.assertTrue(a<b);
		System.out.println("Inside step1");
	}
	
	@Test(groups={"check"})
	public void step2()
	{
		Assert.assertTrue(a<b);
		System.out.println("Inside step2");
	}
	
	@Test(dependsOnGroups = {"check"})
	public void step3()
	{
		System.out.println("Inside step3");
	}
}
