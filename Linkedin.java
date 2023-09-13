package first;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Linkedin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.xpath("//div[@class='form__input--floating mt-24']/input[@type='text']")).sendKeys("barathkesavan2310@gmail.com");
		driver.findElement(By.xpath("//div[@class='form__input--floating mt-24']/input[@id='password']")).sendKeys("Barath@23!");
		driver.findElement(By.xpath("//div[@class='login__form_action_container ']/button")).click();
		
	}

}
