package br.com.demoguru.steps;

import br.com.demoguru.pages.LoginPage;
import org.junit.Assert;

public class LoginStep {


    public void deveClicarNoLinkSinOn(){
        LoginPage loginPage = new LoginPage();
        loginPage.deveClicarNoLinkSinOn();
    }
    public void deveRealizarLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.deveRealizarLogin();
    }

    public void deveValidarMsgSucesso(){
        LoginPage loginPage = new LoginPage();

        String msgSucesso = loginPage.msgSucesso.getText();
        Assert.assertEquals("Login Successfully", msgSucesso);
    }
}
