package br.com.demoguru.pages;

import br.com.demoguru.communs.BaseTest;
import br.com.demoguru.elements.RegisterElementMap;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends RegisterElementMap {

    public RegisterPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    public void deveClicarEmRegister(){
        linkRegister.isDisplayed();
        linkRegister.click();
    }
    public void deveValidarTexto(){
        boolean img = imgRegister.isDisplayed();
        Assert.assertTrue("", img);
    }
    public void deveRealizarRegistro(){
        firtName.clear();
        firtName.sendKeys("Teste carol");
        lastName.clear();
        lastName.sendKeys("teste");
        phone.clear();
        phone.sendKeys("99999999");
        email.clear();
        email.sendKeys("carolti2013@gmail.com");
        address1.clear();
        address1.sendKeys("teste teste tests");
        city.clear();
        city.sendKeys("teste rio");
        state.clear();
        state.sendKeys("Rio");
        postalCode.clear();
        postalCode.sendKeys("123456789");

        WebElement element = country;
        element.click();
        Select cmbCountry = new Select(element);
        cmbCountry.selectByVisibleText("BRAZIL");

        userName.clear();
        userName.sendKeys("Teste Carol");
        password.clear();
        password.sendKeys("pwd1232456");
        confirmPassword.clear();
        confirmPassword.sendKeys("pwd1232456");

        btnEnviar.click();

    }
}
