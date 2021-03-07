package tricentis.atributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AtributesSelectingPrice {

	@FindBy(how = How.XPATH, using = "//*[@id=\"selectultimate\"]")
	public WebElement radioSelectUltimate;

	@FindBy(how = How.ID, using = "nextsendquote")
	public WebElement buttonNextSendQuote;

}