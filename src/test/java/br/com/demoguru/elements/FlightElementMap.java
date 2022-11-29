package br.com.demoguru.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightElementMap {

    @FindBy(xpath= "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")
    public WebElement linkFlights;
    @FindBy (name="tripType")
    public WebElement tripType;
    @FindBy(xpath = "//input[2]")
    public WebElement radioOneWay;
    @FindBy (name="passCount")
    public WebElement  passCount;
    @FindBy (name="fromPort")
    public WebElement formPort;
    @FindBy (name="fromMonth")
    public WebElement fromMonth;
    @FindBy (name="fromDay")
    public WebElement fromDay;
    @FindBy (name="toMonth")
    public WebElement toMonth;
    @FindBy (name="toDay")
    public WebElement toDay;
    @FindBy(name = "toPort")
    public WebElement toPort;
    @FindBy(name = "servClass")
    public WebElement servClass;
    @FindBy (xpath="//font/font/input")
    public WebElement radioBusinssClass;
    @FindBy (name="airline")
    public WebElement airline;
    @FindBy (name="findFlights")
    public WebElement btnContinue;

    @FindBy(xpath= "//*[normalize-space(text()) and normalize-space(.)='CONTACT'])[1]/following::font[2]" )
    public WebElement textoNaTela;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/a/img")
    public WebElement btnBackHome;


}
