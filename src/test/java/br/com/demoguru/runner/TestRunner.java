package br.com.demoguru.runner;

import br.com.demoguru.tests.FlightTest;
import br.com.demoguru.tests.LoginTest;
import br.com.demoguru.tests.RegisterTest;
import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({LoginTest.class, RegisterTest.class, FlightTest.class})
public class TestRunner {


}
