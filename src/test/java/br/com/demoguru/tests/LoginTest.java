package br.com.demoguru.tests;

import br.com.demoguru.communs.BaseTest;
import br.com.demoguru.steps.LoginStep;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.manipulation.Alphanumeric;

@OrderWith(Alphanumeric.class)
public class LoginTest extends BaseTest {


    @Test
    public void deveClicarNoLinkSinOn(){
        LoginStep loginStep = new LoginStep();
        loginStep.deveClicarNoLinkSinOn();
    }
    @Test
    public void deveRealizarLogin(){
        LoginStep loginStep = new LoginStep();
        loginStep.deveRealizarLogin();
    }
    @Test
    public void deveValidarMsgSucesso(){
        LoginStep loginStep = new LoginStep();
        deveRealizarLogin();
        loginStep.deveValidarMsgSucesso();
    }
}
