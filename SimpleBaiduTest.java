import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SimpleBaiduTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "G:/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.baidu.com/");
   System.out.println("ҳ�������"+driver.getTitle());
   
   WebElement element=driver.findElement(By.cssSelector("#kw"));
   WebElement element1=driver.findElement(By.id("#quickdelete"));
  
   System.out.println("��������ֵ"+ element1.getAttribute("title"));
   element.sendKeys("�ƿ�רҵ�γ�����");
   element.submit();
   
   
   try {
	Thread.sleep(100000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   driver.quit();
	}
	

}
