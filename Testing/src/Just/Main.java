package Just;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;



public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		browser ob = new browser();
		ob.Chrome();
		ob.Edge();
	}	
}

class browser {
	public static WebDriver driver;
	
	public void Chrome() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		file ob = new file();
		ob.main1();
	}
	
	public void Edge() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		file ob = new file();
		ob.main1();
	}
}

class file extends browser{
	public void main1() throws InterruptedException {
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sachin"+ Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
		
	}
}


