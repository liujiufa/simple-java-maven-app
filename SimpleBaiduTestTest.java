import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleBaiduTestTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testMain1() {
		 System.setProperty("webdriver.chrome.driver", "G:/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.baidu.com/");
		   WebElement element1=driver.findElement(By.id("#quickdelete"));
		   assertEquals( element1.getAttribute("title"),"清空",null);	  
		
	}
	@Test
	public void testMain2() {
		 System.setProperty("webdriver.chrome.driver", "G:/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.baidu.com/");
		   WebElement element=driver.findElement(By.cssSelector("#kw"));
		   assertEquals( element.getText(),"");
		
	}
	@Test
	public void testMain3() {
		 System.setProperty("webdriver.chrome.driver", "G:/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.baidu.com/");
		   assertEquals( driver.getTitle(),"百度一下，你就知道",null);
		
	}
	

}
