package Week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.types.Source;

public class Facebook {

	public static void main(String[] args) 
	{
ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Nancyy");
		
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("Deva");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("7904227034");
		driver.findElement(By.id("password_step_input")).sendKeys("Pigeon123");
		
		WebElement t = driver.findElement(By.id("day"));
		Select s = new Select(t);
		s.selectByValue("27");
		
		WebElement h = driver.findElement(By.id("month"));
		Select a = new Select(h);
		a.selectByValue("12");
		
		WebElement g = driver.findElement(By.xpath("//select[@id='year']"));
		Select b = new Select(g);
		b.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//input[@class='_8esa']")).click();
		
		
		
		
		
		
		
	
		
		
	}

}
