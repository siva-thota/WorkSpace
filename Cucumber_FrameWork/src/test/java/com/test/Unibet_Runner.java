package com.test;
import org.junit.runner.RunWith;

import com.setup.Setup;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"html:target/html-report"},features={Setup.sUNIBETFEATURE,Setup.sUNIBETNEGATIVESCENARIOFEATURE})
public class Unibet_Runner implements Setup {
		
}