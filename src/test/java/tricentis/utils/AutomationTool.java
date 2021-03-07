package tricentis.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationTool {

	final int timeout = 10;

	/**
	 * Metodo responsável por fazer a selecao de um valor na combobox
	 * 
	 * @param driver
	 * @param element
	 * @param value
	 */
	public void select(WebDriver driver, WebElement element, String value) {

		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			Select seletor = new Select(element);
			seletor.selectByValue(value);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao tentar localizar o elemento: " + element);
		}

	}

	/**
	 * Metodo responsavel por setar um valor em um campo de texto
	 * 
	 * @param driver
	 * @param element
	 * @param value
	 */
	public void setText(WebDriver driver, WebElement element, String value) {

		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao tentar localizar o elemento: " + element);
		}

	}

	/**
	 * Metodo responsavel por clicar no elemento
	 * 
	 * @param driver
	 * @param element
	 * @param value
	 */
	public void click(WebDriver driver, WebElement element) {

		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			element.click();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao tentar localizar o elemento: " + element);
		}

	}

	/**
	 * Metodo responsavel por clicar no elemento, caso o metodo comum de click não
	 * funcione
	 * 
	 * @param driver
	 * @param element
	 */
	public void clickAction(WebDriver driver, WebElement element) {

		Actions actions = new Actions(driver);

		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			actions.moveToElement(element).click().build().perform();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao tentar localizar o elemento: " + element);
		}

	}

	/**
	 * Metodo responsavel por fazer o teste aguardar um loading
	 * 
	 * @param driver
	 * @param element
	 */
	public void loading(WebDriver driver, WebElement element) {

		int cont = 0;

		do {
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			cont++;
		} while(element.getSize().getWidth() < 0 && cont < 10);

	}

	/**
	 * Metodo responsavel por validar se o elemento existe em tela
	 * 
	 * @param driver
	 * @param element
	 */
	public void getText(WebDriver driver, WebElement element, String expectedText) {

		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			if(element.getText().equals(expectedText)) {
				System.out.println("O texto esperado foi encontrado no elemento: " + element);
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao tentar localizar o elemento: " + element);
		}
		
//		try {
//			if (driver.) {
//				System.out.println("Elemento existe em tela: " + element);
//			}
//		} catch (Exception e) {
//			System.out.println("Elemento não existe em tela: " + element);
//		}

	}

}