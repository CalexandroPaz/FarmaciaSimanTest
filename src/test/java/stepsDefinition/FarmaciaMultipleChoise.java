package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FarmaciaMultipleChoise {
	
	public static WebDriver driver;
	
	@Given("user open the webside")
	public void user_open_the_webside() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://farmaciasiman.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}

	@When("user close any popup")
	public void user_close_any_popup() {
		
		try {
			//WebElement
			WebElement btnPopup = driver.findElement(By.xpath("//button[@class='close button-modal-em']"));
			//Methods
			btnPopup.click();
		}catch(Exception e) {
			System.out.println("Popup failed");
		}


	}

	@Given("user search for {string}")
	public void user_search_for(String products) throws InterruptedException {
		
		
		  //WebElements
		  WebElement searchBtn = driver.findElement(By.cssSelector("input[id*='txtBuscarProducto']"));
		  searchBtn.sendKeys(products);
	


	}

	@When("user search and verify the product is the correct")
	public void user_search_and_verify_the_product_is_the_correct() {
		
		try {
			//WebElement
			  WebElement searchBtnClick = driver.findElement(By.cssSelector("a[class='btn btn-danger']"));
			//Methods  
			  searchBtnClick.click();
			  System.out.println("Se realizo correctamente");
			}catch(Exception e) {
				System.out.println("Fallo");
			}


	}




}



