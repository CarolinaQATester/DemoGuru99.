package br.com.demoguru.steps;

import br.com.demoguru.pages.FlightPage;
import org.junit.Assert;

public class FlightStep {

    public void devePreencherCamposFlight(){
        FlightPage flightPage = new FlightPage();
        flightPage.devePreencherCamposFlight();
    }
    public void deveValidarTextoAposPreenchimento(){
        FlightPage flightPage = new FlightPage();
        flightPage.devePreencherCamposFlight();

        String msgPreenchimento = flightPage.textoNaTela.getText();
        Assert.assertEquals("        After flight finder - No Seats Avaialble  ", msgPreenchimento);

    }
    public void deveVoltarParaTelaHome(){
        FlightPage flightPage = new FlightPage();
        flightPage.devePreencherCamposFlight();
        flightPage.deveVoltarParaTelaHome();
    }
}
