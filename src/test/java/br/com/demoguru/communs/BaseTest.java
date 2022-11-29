package br.com.demoguru.communs;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    private static WebDriver driver;

    public String url = "https://demo.guru99.com/test/newtours/";
    public String path = "/opt/chromedriver";

    @Before
    public void abrirBrowser(){
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();

        driver.get(url);

    }
    @After
    public void fecharBrowser(){
        driver.close();;
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
