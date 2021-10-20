package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Search Item Name with Bags
		WebElement eleSearchBox = driver
				.findElement(By.xpath("//div[@class='searchbar-view']//input[@placeholder='Search AJIO']"));
		eleSearchBox.sendKeys("Bags");
		eleSearchBox.sendKeys(Keys.ENTER);
		
		// Clicked Men Radio Button
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		Thread.sleep(1000);
		
		// Clicked Category as Fashion Bags
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		Thread.sleep(2000);
		
		// Get Number of Items and Brands available in the page
		List<WebElement> eleBrandLists = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Number of Items Available is " + eleBrandLists.size());
		
		// Get Bags Name available in the page
		List<WebElement> eleBagNames = driver.findElements(By.xpath("//div[@class='brand']/following-sibling::div[1]"));

		List<String> brandName = new ArrayList<String>();
		List<String> bagNames = new ArrayList<String>();

		for (int i = 0; i < eleBrandLists.size(); i++) {

			String getBagNames = eleBagNames.get(i).getText();
			String getBrandName = eleBrandLists.get(i).getText();			

			brandName.add(getBrandName+"\n");
			bagNames.add(getBagNames+"\n");
		}
		System.out.println("List of Brands Names are Below:");
		System.out.println(brandName+"\n");
		System.out.println("List of Bag Names are Below:");
		System.out.println(bagNames);
	}
}
