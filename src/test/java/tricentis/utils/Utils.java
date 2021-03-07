package tricentis.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	WebDriver driver;

	/**
	 * Metodo responsavel por navegar ate a pagina destino
	 */
	public WebDriver setBrowser() {

		String pathChromeDriver = "C:\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", pathChromeDriver);
		driver = new ChromeDriver();

		return driver;

	}

}