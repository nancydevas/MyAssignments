package Week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
				
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		//find leads
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		//Click on phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter phone number & find leads
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9677040077");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement h = driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=11686']"));
		System.out.println(h.getText());
		
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).click();
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
	driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys("11686");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
	}

}
