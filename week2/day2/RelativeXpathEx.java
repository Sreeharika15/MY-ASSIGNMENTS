package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver(); 

		driver.get("https://www.nykaa.com/");
		
		driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']")).click();
		
	}

}
