package com.choucair.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (features = "src/test/resources/features/"
				 //tags = "@tag3"
				 )




public class RunnerFeatures {

}
