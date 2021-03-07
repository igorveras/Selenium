package tricentis.atributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AtributesProductData {
	
	@FindBy(how = How.ID, using = "startdate")
	public WebElement inputStartDate;
	
	@FindBy(how = How.ID, using = "insurancesum")
	public WebElement selectInsuranceSum;
	
	@FindBy(how = How.ID, using = "meritrating")
	public WebElement selectMeritrating;
	
	@FindBy(how = How.ID, using = "damageinsurance")
	public WebElement selectDamageInsurance;
	
	@FindBy(how = How.ID, using = "EuroProtection")
	public WebElement checkEuroProtection;
	
	@FindBy(how = How.ID, using = "courtesycar")
	public WebElement selectCourtesyCar;
	
	@FindBy(how = How.ID, using = "nextselectpriceoption")
	public WebElement buttonNextSelectPriceOption;
	

}