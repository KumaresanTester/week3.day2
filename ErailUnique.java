package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Unchecked the Sort on Date Check box
		driver.findElement(By.id("chkSelectDateOnly")).click();

//		Entered the From Station and To Station
		WebElement eleSource = driver.findElement(By.id("txtStationFrom"));
		eleSource.clear();
		eleSource.sendKeys("Chennai Egmore");
		eleSource.sendKeys(Keys.ENTER);
		WebElement eleDestination = driver.findElement(By.id("txtStationTo"));
		eleDestination.clear();
		eleDestination.sendKeys("Mumbai Central");
		eleDestination.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

//		Get Elements of Train Lists
		List<WebElement> eleTrainLists = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[@style=';']/a"));
		List<String> trainNameList = new ArrayList<String>();
		for (int i = 0; i < eleTrainLists.size(); i++) {
			trainNameList.add(eleTrainLists.get(i).getText() + "\n");
		}
		int trainSize = trainNameList.size();
		System.out.println("Number of Full Lists of Train using List Interface is "+trainSize);

//		Train Lists added in Set		
		Set<String> trainName = new HashSet<String>();
		for (int i = 0; i < trainSize; i++) {
			trainName.addAll(trainNameList);
		}

//		Print the Size of Train Lists
		System.out.println("Number of Trains Available using Set Interface is " + trainName.size());
	}
}
