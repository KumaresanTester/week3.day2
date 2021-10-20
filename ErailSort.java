package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Get CheckBox Elements and unchecked the checked Box
		List<WebElement> eleCheckBox = driver
				.findElements(By.xpath("//table[@id='tableTopMenu']//input[@type='checkbox']"));
		for (int i = 0; i < eleCheckBox.size(); i++) {
			if (eleCheckBox.get(i).isSelected()) {
				eleCheckBox.get(i).click();
				System.out.println("Unchecked the Checked Box");
			}
		}
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

//		Get Elements of Train Lists and Train Names
		List<WebElement> eleTrainLists = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[@style=';']/a"));
		System.out.println("Number of Trains Available " + eleTrainLists.size());
		List<String> trainNameList = new ArrayList<String>();

		for (int i = 0; i < eleTrainLists.size(); i++) {
			trainNameList.add(eleTrainLists.get(i).getText() + "\n");
		}

//		Sort the TrainName List
		Collections.sort(trainNameList);
		System.out.println("Train Names List Below:");
		System.out.println(trainNameList);
	}
}
