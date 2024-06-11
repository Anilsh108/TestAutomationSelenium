
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class ParameterizedTest {

	    @Test
	    @Parameters({"param1", "param2"})
	    public void testMethod(String param1, String param2) {
	        System.out.println("Parameter 1: " + param1);
	        System.out.println("Parameter 2: " + param2);
	        // Test logic using the parameters
	    }
	}

	
//	@BeforeSuite
//	public void BeforeSuite()
//	{
//		System.out.println("Executes before all tests in a suite");//done
//	}
//	
//	@AfterSuite
//	public void AfterSuite()
//	{
//		System.out.println("Executes After all tests in a suite");//done
//	}
//	
//	public void print3()
//	{
//		System.out.println("test method3");//default method 1
//	}
//	
//	public void print4()
//	{
//		System.out.println("test method4");//default method 2
//	}
//	@Test
////	@Test(enabled=false)
//	public void print1()
//	{
//		System.out.println("test print1()");
//	}
//	
//	@Test(dependsOnMethods={"print1"})
//	public void print2()
//	{
//		System.out.println("it depends on print1()");
//	}
//	
//	@BeforeTest
//	public void Beforetest()
//	{
//		System.out.println("Beforetest method");
//	}
//	
//	@AfterTest
//	public void Aftertest()
//	{
//		System.out.println("Aftertest method");
//	}
//	
//	@BeforeMethod
//	public void BeforeMethod()
//	{
//		System.out.println("BeforeMethod");
//	}
//	
//	
//	@AfterMethod
//	public void AfterMethod()
//	{
//		System.out.println("AfterMethod");
//	}
//	
//	@AfterClass
//	public void AfterClass()
//	{
//		System.out.println("AfterClass method");
//	}
//	
//	@BeforeClass
//	public void BeforeClass()
//	{
//		System.out.println("BeforeClass method");
//	}
	


		