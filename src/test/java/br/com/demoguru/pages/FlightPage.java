package br.com.demoguru.pages;

import br.com.demoguru.communs.BaseTest;
import br.com.demoguru.elements.FlightElementMap;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightPage extends FlightElementMap {

    public FlightPage() {
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    public void deveSelecionarMenuFlight(){
        linkFlights.click();
    }
    public void devePreencherCamposFlight(){
        LoginPage loginPage = new LoginPage();
        loginPage.deveRealizarLogin();

        linkFlights.click();
        //deveVerificarRadioTypeSelecionado();
        radioOneWay.click();
        WebElement elementPassCount = passCount;
        elementPassCount.click();
        new Select(passCount).selectByVisibleText("2");

        WebElement elementFromPort = formPort;
        elementFromPort.click();
        new Select(formPort).selectByVisibleText("London");

        WebElement elementFromMonth = fromMonth;
        elementFromMonth.click();
        new Select(fromMonth).selectByVisibleText("August");

        WebElement elementFromDay = fromDay;
        elementFromDay.click();
        new Select(fromDay).selectByVisibleText("13");

        WebElement elementToPort= toPort;
        elementToPort.click();
        new Select(toPort).selectByVisibleText("London");

        WebElement elementToMonth = toMonth;
        elementToMonth.click();
        new Select(toMonth).selectByVisibleText("August");

        WebElement elementtoDay = toDay;
        elementtoDay.click();
        new Select(toDay).selectByVisibleText("13");

        radioBusinssClass.click();
        //deveVerificarRadioServiceClassSelecionado();
        WebElement elemenAirline = airline;
        elemenAirline.click();
        new Select(airline).selectByVisibleText("Blue Skies Airlines");

        btnContinue.click();


    }
    public void deveVoltarParaTelaHome(){
        btnBackHome.click();
    }
    public void deveVerificarRadioTypeSelecionado() {
        Assert.assertTrue(tripType.isSelected());
    }
    public void deveVerificarRadioServiceClassSelecionado(){
        Assert.assertTrue(servClass.isSelected());
    }
}

