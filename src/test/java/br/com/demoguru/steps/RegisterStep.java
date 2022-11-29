package br.com.demoguru.steps;

import br.com.demoguru.pages.RegisterPage;
import org.junit.Assert;

public class RegisterStep {


    public void deveClicarEmRegister(){
        RegisterPage registerPage = new RegisterPage();
        registerPage.deveClicarEmRegister();

    }
    public void deveValidarTesto(){
        RegisterPage registerPage = new RegisterPage();
        registerPage.deveValidarTexto();
    }

    public void deveRealizarRegistro(){
        RegisterPage registerPage = new RegisterPage();
        registerPage.deveRealizarRegistro();
    }
}
