package br.com.demoguru.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMap {

    @FindBy(linkText = "SIGN-ON")
    public WebElement linkSignOn;
    @FindBy(name = "userName")
    public WebElement userName;
    @FindBy(name = "password")
    public WebElement password ;
    @FindBy(name ="submit")
    public WebElement btnSubmit;
    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")
    public WebElement msgSucesso;

}
