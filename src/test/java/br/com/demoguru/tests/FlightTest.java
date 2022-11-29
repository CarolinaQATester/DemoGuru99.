package br.com.demoguru.tests;

import br.com.demoguru.communs.BaseTest;
import br.com.demoguru.steps.FlightStep;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.manipulation.Alphanumeric;

@OrderWith(Alphanumeric.class)
public class FlightTest extends BaseTest {


    @Test
    public void devePreencherCamposFlight(){

        FlightStep flightStep = new FlightStep();
        flightStep.devePreencherCamposFlight();
    }
    @Test
    public void deveValidarTextoAposPreenchimento(){
        FlightStep flightStep = new FlightStep();
        flightStep.deveValidarTextoAposPreenchimento();

    }
    @Test
    public void deveVoltarParaTelaHome(){
        FlightStep flightStep = new FlightStep();
        flightStep.deveVoltarParaTelaHome();
    }
}
