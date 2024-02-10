package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.junit.Assert;

public class SeleDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mycontactform.com/samples.php");
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]")).click();
        driver.findElement(By.id("email")).sendKeys("fokhrulislam.1989.bd@gmail.com");
        driver.findElement(By.id("subject")).sendKeys("Adnan");
        
	}


}
