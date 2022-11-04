package end_user;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.booking.com");
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("abed88@yahoo.com");//enter a real email
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"new_password\"]")).sendKeys("123456KiKi*");
        driver.findElement(By.xpath("//*[@id=\"confirmed_password\"]")).sendKeys("123456KiKi*");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();

		
		Thread.sleep(5000);
		for(int i= 0 ; i<10 ; i++ ) {
			
			driver.findElement(By.id("rKuFgjievNGPfXi")).click();
			
		}
		
		
		
	}

}
