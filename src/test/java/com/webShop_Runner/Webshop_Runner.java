package com.webShop_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\webshop.feature",glue="com.webShop_Step")

public class Webshop_Runner {

}
