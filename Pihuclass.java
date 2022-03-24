package PihuPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pihuclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Pihu welcome to Selenium Training");

System.setProperty("webdriver.chrome.driver", "C:\\Users\\praprati\\Desktop\\Selenium Workspace\\PihuSelenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	}

}
