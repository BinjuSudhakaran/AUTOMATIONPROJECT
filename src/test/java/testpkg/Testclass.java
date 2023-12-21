package testpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Pageclass;
import utilitypkg.Utilityclass;
public class Testclass extends Baseclass
{
	
		@Test
	public void login() throws Exception
	{
			Pageclass ob=new Pageclass(driver);
			
		ob.clickLogin();
		String xl="C:\\Users\\dell\\OneDrive\\Desktop\\Book1.xlsx";
		String Sheet="Sheet1";
		System.out.println("Hi");
		int rowCount=Utilityclass.getRowCount(xl,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Utilityclass.getCellValue(xl,Sheet,i,0);
			System.out.println("username="+UserName);
			String Pwd=Utilityclass.getCellValue(xl, Sheet, i, 1);
			System.out.println("password="+Pwd);
			
			ob.loginPage(UserName,Pwd);
	    }
	}
	@Test
	public void test2()
	{
		Pageclass ob=new Pageclass(driver);
		//Pageclass ob=new Pageclass(driver);
		ob.certify();
	}
}


