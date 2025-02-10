package stepsDefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FarmaciaSteps {
	
    public static WebDriver driver;
	
	
	@Given("User open the browser FarmaciaSiman")
	public void user_open_the_browser_farmacia_siman() throws InterruptedException {
		
	//	System.setProperty("webdriver.chromre.driver", "C:\\Users\\Latitude 7480\\Desktop\\Alexandro\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// WebDriver driver = new ChromeDriver();
		driver.get("https://farmaciasiman.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}

	@When("User click on search")
	public void user_click_on_search() throws InterruptedException {
	
		
		  
	}

	@Then("User look for acetaminofen")
	public void user_look_for_acetaminofen() throws InterruptedException {
		
		String search = "acetaminofen mk 500";
		  //WebElements
		  WebElement searchBtn = driver.findElement(By.cssSelector("input[id*='txtBuscarProducto']"));
		Thread.sleep(3000);
		 //Methods
		  searchBtn.sendKeys(search);

	}

	@Then("User click in search button")
	public void user_click_in_search_button() {
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

	@Then("User user click in Acetaminofen Calmol Gotas")
	public void user_user_click_in_acetaminofen_calmol_gotas() throws InterruptedException {
	  
		try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	   String scriptJs = "window.scrollBy(0,1000);";
	   js.executeScript(scriptJs);
	   Thread.sleep(2000);
	   System.out.println("Scroll realizado correctamente.");
		} catch(Exception e) {
			System.out.println("No se pudo hace scroll");
		}
		
		//WebElement
		WebElement acetamino = driver.findElement(By.xpath("//img[contains(@lazy-src,'https://d2wuoo4cuot0vy.cloudfront.net/0010-1072/0010-1072_1.thumbail.jpg')]"));
		acetamino.click();
		
		Thread.sleep(4000);
	}

	@Given("User click in Add to the cart")
	public void user_click_in_add_to_the_cart() throws InterruptedException {
		
		try {//WebElement
		WebElement cartBtn = driver.findElement(By.cssSelector("button[ng-click='AgregarProductoDetalleCarrito(producto_Detalle)']"));
		
		Thread.sleep(3000);
	    //Methods
		cartBtn.click();
		System.out.println("Se agrego la compra correctamente");
		} catch(Exception e) {
			System.out.println("Fallo");
		}
	}

	@When("verify if the purchase was added")
	public void verify_if_the_purchase_was_added() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.close();
		 
		
		
		

	}
	
	
	 


}
