package br.com.demoguru.elements;

import org.hamcrest.Factory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterElementMap {

    @FindBy(linkText = "REGISTER")
    public WebElement linkRegister;
    @FindBy(xpath = "//td/table/tbody/tr/td[2]/table/tbody/tr/td/img")
    public WebElement imgRegister;
    @FindBy(name="firstName")
    public WebElement firtName;
    @FindBy(name = "lastName")
    public WebElement lastName;
    @FindBy(name = "phone")
    public WebElement phone;
    @FindBy(id = "userName")
    public WebElement userName;
   @FindBy(name = "address1")
   public WebElement address1;
    @FindBy(name = "city")
    public WebElement city;
   @FindBy(name = "state")
    public WebElement state;
    @FindBy(name = "postalCode")
    public WebElement postalCode;
    @FindBy(name="country")
    public WebElement country;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(name = "confirmPassword")
    public WebElement confirmPassword;
    @FindBy(name = "submit")
    public WebElement btnEnviar;
}
