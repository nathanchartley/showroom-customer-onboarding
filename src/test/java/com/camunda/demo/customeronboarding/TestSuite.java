package com.camunda.demo.customeronboarding;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({ VersicherungsneuantragProcessTest.class, VersicherungsneuantragScenarioTest.class,
	DmnRuleTests.class, ApplicationOnlineFacadeTests.class })
public class TestSuite {
}
