package com.Runner;

import org.junit.runner.RunWith;
import com.BaseClassMethods.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Public\\Jdk\\Lime\\src\\test\\java\\com\\Lime_feature\\LimeShopMen.feature",
								glue = "com.StepDef", monochrome = true, dryRun = false, 
								plugin= {"json:Folder/limelog.json", "html:F2/limelogn.html",
										"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class Runner_Class extends BaseClass {
	
	
	
}
