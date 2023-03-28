package tests;

import org.openqa.selenium.By;
import org.testng.Assert;


public class Login extends BaseClass{
	
	public void login() {
		driver.get("https://courses.ultimateqa.com/users/sign_in");
		
		driver.findElement(By.id("user[email]")).sendKeys("chami.jay6@gmail.com");
		driver.findElement(By.id("user[password]")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		
		Assert.assertTrue(driver.findElements(By.id("//h2[contains(text(),'Products')]")).size() != 0, "----- FAILURE: Login failed -----"); 
		System.out.println("----- SUCCESS: Login success -----");
	}
	
}
