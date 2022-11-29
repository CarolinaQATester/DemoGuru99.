package br.com.demoguru.tests;

import br.com.demoguru.communs.BaseTest;
import br.com.demoguru.steps.RegisterStep;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.manipulation.Alphanumeric;

@OrderWith(Alphanumeric.class)
public class RegisterTest extends BaseTest {

    @Test
    public void deveClicarEmRegister(){
        RegisterStep registerStep = new RegisterStep();
        registerStep.deveClicarEmRegister();
        registerStep.deveValidarTesto();

    }
    @Test
    public void deveRealizarRegistro() {
        RegisterStep registerStep = new RegisterStep();
        registerStep.deveClicarEmRegister();
        registerStep.deveRealizarRegistro();
    }

}
