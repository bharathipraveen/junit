package org.test.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.Baseclass;

public class FacebookLogin extends Baseclass{
	public FacebookLogin() {
	PageFactory.initElements(driver, this); 
	}
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
    private WebElement pass;
	@FindBy(xpath="//input[@value='Log In']")
    private WebElement login;
	
		public WebElement getUsername() {
			return username;
		}
		public WebElement getPass() {
			return pass;
		}
		public WebElement getLogin() {
			return login;
		} 
		
}
