package week02.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
			ChromeDriver driver= new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
						
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.xpath("//a[text()='Accounts']")).click();
				driver.findElement(By.linkText("Create Account")).click();
				driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
				driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys("Selenium Automation Tester");
				driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Local acc");
				driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("site acc");
				driver.findElement(By.xpath("//input[@id ='annualRevenue']")).sendKeys("5623");
				//industry dropdown
				WebElement h = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
				Select a = new Select(h);
				a.selectByVisibleText("Computer Software");
				
				WebElement f = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
				Select x = new Select(f);
				x.selectByVisibleText("S-Corporation");
				
				WebElement g = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
				Select l = new Select(g);
				l.selectByValue("LEAD_EMPLOYEE");
				
				WebElement m = driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
				Select p = new Select(m);
				p.selectByIndex(6);
				
				WebElement k = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
				Select o = new Select(k);
				o.selectByValue("TX");
				
				driver.findElement(By.xpath("//input[@onclick='submitFormWithSingleClick(this)']")).click();			
				
	}

}
