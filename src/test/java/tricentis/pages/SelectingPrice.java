package tricentis.pages;

import org.openqa.selenium.WebDriver;
import tricentis.atributes.AtributesSelectingPrice;
import tricentis.utils.AutomationTool;
import tricentis.utils.Utils;

public class SelectingPrice extends AtributesSelectingPrice {

	Utils utils = new Utils();
	AutomationTool tool = new AutomationTool();
	WebDriver browser;

	public SelectingPrice(WebDriver driver) {
		this.browser = driver;
	}

	/**
	 * Metodo responsavel por selecionar o plano desejado
	 */
	public void selectingPrice() {

		tool.clickAction(browser, radioSelectUltimate);
		tool.click(browser, buttonNextSendQuote);

	}

}