package br.com.demoguru.pages;

import br.com.demoguru.communs.BaseTest;
import br.com.demoguru.elements.LoginElementMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginElementMap {

    public LoginPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    public void deveClicarNoLinkSinOn(){
        linkSignOn.isDisplayed();
        linkSignOn.click();
    }
    public void deveRealizarLogin(){
        userName.clear();
        userName.sendKeys("carol1234");
        password.clear();
        password.sendKeys("carol1234");

        btnSubmit.click();
    }
}
