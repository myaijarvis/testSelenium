package teatSelenium;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpletest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:/eclipse/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.baidu.com/");
		
		System.out.println("Home page title:" + driver.getTitle());
		System.out.println("Home page title url" + driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String assertest = driver.getTitle();
		WebElement element = driver.findElement(By.cssSelector("#kw"));

		element.sendKeys("Java");
		
		element.submit();
		
		Thread.sleep(1000);
		
		WebElement result = driver.findElement(By.xpath("//*[@id=\"2\"]/h3/a"));
		System.out.println(result.getText());

		assertEquals(assertest, "百度一啊下，你就知道");
		driver.quit();
	}

}
