package P2;

//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample 
{
	/*@BeforeMethod
    public void open()
    
    {
    	System.out.println(" code to open the url");
    }
    */
	@Test(priority=2)
	public void login()
	
	
	{
		System.out.println("code for login");
		
	}
	
	@Test(priority = 3)
	public void registernewuser()
	{
		System.out.println("code to create new user");
	}
	@Test(priority=1)
	public void inbox()
	{
		System.out.println("This is Inbox");
	
	}
	
}



