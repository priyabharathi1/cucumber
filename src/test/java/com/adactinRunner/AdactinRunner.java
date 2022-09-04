package com.adactinRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\adactin.feature",
glue="com.adactinstep",monochrome= true,
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class AdactinRunner {
	
	

}
