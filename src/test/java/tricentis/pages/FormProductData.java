package tricentis.pages;

import org.openqa.selenium.WebDriver;

import tricentis.atributes.AtributesProductData;
import tricentis.utils.AutomationTool;
import tricentis.utils.Utils;

public class FormProductData extends AtributesProductData{
	
	Utils utils = new Utils();
	AutomationTool tool = new AutomationTool();
	WebDriver browser;

	public FormProductData(WebDriver driver) {
		this.browser = driver;
	}
	
	/**
	 * Metodo responsavel por preencher o formulario de Produto
	 */
	public void formProdutcData() {
		
		tool.setText(browser, inputStartDate, "12/15/2021");
		tool.select(browser, selectInsuranceSum, "3000000");
		tool.select(browser, selectMeritrating, "Bonus 1");
		tool.select(browser, selectDamageInsurance, "Full Coverage");
		tool.clickAction(browser, checkEuroProtection);
		tool.select(browser, selectCourtesyCar, "Yes");
		tool.click(browser, buttonNextSelectPriceOption);
		
	}

}