package tricentis.atributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AtributesVehicleData {

	@FindBy(how = How.ID, using = "make")
	public WebElement selectMake;

	@FindBy(how = How.ID, using = "model")
	public WebElement selectModel;

	@FindBy(how = How.ID, using = "cylindercapacity")
	public WebElement editCylinderCapacity;

	@FindBy(how = How.ID, using = "engineperformance")
	public WebElement editEnginePerformance;

	@FindBy(how = How.ID, using = "dateofmanufacture")
	public WebElement inputDateofManufacture;

	@FindBy(how = How.ID, using = "numberofseats")
	public WebElement editNumberofSeats;

	@FindBy(how = How.ID, using = "righthanddriveyes")
	public WebElement inputRightHandDriveyes;

	@FindBy(how = How.ID, using = "numberofseatsmotorcycle")
	public WebElement selectNumberofSeatsMotorcycle;

	@FindBy(how = How.ID, using = "fuel")
	public WebElement editFuelType;

	@FindBy(how = How.ID, using = "payload")
	public WebElement editPayLoad;

	@FindBy(how = How.ID, using = "totalweight")
	public WebElement editTotalWeight;

	@FindBy(how = How.ID, using = "listprice")
	public WebElement editListPrice;

	@FindBy(how = How.ID, using = "licenseplatenumber")
	public WebElement editLicensePlateNumber;

	@FindBy(how = How.ID, using = "annualmileage")
	public WebElement editAnnualMileage;
	
	@FindBy(how = How.ID, using = "nextenterinsurantdata")
	public WebElement buttoNextEnterInsurantData;
	

}