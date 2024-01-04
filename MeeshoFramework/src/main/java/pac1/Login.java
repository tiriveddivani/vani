package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	
    @FindBy (xpath = "//input[@id='username']")
    private WebElement Username;
    
    @FindBy (xpath = "//input[@name='pwd']")
    private WebElement Password;
    
    @FindBy (xpath = "//input[@id='keepLoggedInCheckBox']")
    private WebElement keepmesignin;
    
    @FindBy (xpath = "//a[@id='loginButton']")
    private WebElement LoginButton;
    
    public Login(WebDriver driver) {
    	PageFactory.initElements(driver,this); 	
    }
    public void Logintoapplication() {
    	Username.sendKeys("vanit.marolix@gmail.com");
    	Password.sendKeys("yu5t%YMN");
    	keepmesignin.click();
    	LoginButton.click();
    }   
}
