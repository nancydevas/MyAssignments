package week02.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeads {

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
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		
		WebElement f = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select x = new Select(f);
		x.selectByVisibleText("Employee");
		
		WebElement g = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select l = new Select(g);
		l.selectByValue("9001");
		
		WebElement m = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select p = new Select(m);
		p.selectByIndex(5);

		WebElement y = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select q = new Select(y);
		q.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
	}

}
