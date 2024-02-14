package seleniumpractices;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import omayo.utility.Utility;

public class DataDrivenByExcel extends BaseTest {

	static WebDriver driver;

	public static void main(String args[]) throws IOException {

		driver = BaseTest.launchUrl("newtoururl");

		ArrayList<Object> data = Utility.readExcel(1);

		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));

		firstName.sendKeys(data.get(0).toString());

		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));

		lastName.sendKeys(data.get(1).toString());

		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));

		phone.sendKeys(data.get(2).toString());

		WebElement email = driver.findElement(By.xpath("//input[@id='userName']"));

		email.sendKeys(data.get(3).toString());

	}

}
