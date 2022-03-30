package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
            driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
            driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
            driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arunachalam");
            driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Divya.S.A");
            driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non-IT");
            driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("divi1257@gmail.com");
            WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
            Select state = new Select(dropdown);
            state.selectByVisibleText("New York");
            driver.findElement(By.className("submitButton")).click();
            driver.findElement(By.linkText("Edit")).click();
            driver.findElement(By.id("updateLeadForm_description")).clear();
    		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Checking update");
    		driver.findElement(By.className("smallSubmit")).click();
            System.out.println("Title is"+driver.getTitle());
            
            		
	}
 
}
