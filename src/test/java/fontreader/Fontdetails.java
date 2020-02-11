package fontreader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fontdetails {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dineshkumar\\eclipse-workspace\\basicconcept\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Wikipedia");
		WebElement d = driver.findElement(By.id("firstHeading"));
		
		String fontcolor = d.getCssValue("color");
	System.out.println("font color :"+ fontcolor);
	String family = d.getCssValue("font-family");
	System.out.println("font_family :"+ family);
	String fontsize = d.getCssValue("font-size");
	System.out.println("font size :"+ fontsize);
	
	}
}
