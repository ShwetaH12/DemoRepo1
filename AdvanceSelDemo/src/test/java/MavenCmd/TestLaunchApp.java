package MavenCmd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLaunchApp {

	@Test
	public void LaunchAppTest()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.close();
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("in m2");
	}
}
