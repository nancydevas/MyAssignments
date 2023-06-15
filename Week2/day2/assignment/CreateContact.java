package Week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
				
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/createContactForm']")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Nancy");
		driver.findElement(By.id("lastNameField")).sendKeys("Deva");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Nancy");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Deva");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Quality Analyst");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("gtgggg@gmail.com");
		
		WebElement h = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select a = new Select(h);
		a.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Quality Analyst in IT Company");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String g = driver.getTitle();
		System.out.println(g);
		
		
		
		
	}

}
