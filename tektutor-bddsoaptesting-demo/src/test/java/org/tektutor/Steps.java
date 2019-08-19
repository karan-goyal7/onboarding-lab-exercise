package org.tektutor;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	private String soapWSDLURL;
	private String rpnMathExpression;
	private String actualResult;
	
	@Given("I have deployed the RPNCalculator SOAP at URL {string}")
	public void setSOAPWSDLURL(String wsdlURL) {
	    soapWSDLURL = wsdlURL; 
	}

	@Given("the input is {string}")
	public void setInput(String rpnMathExpression) {
	    this.rpnMathExpression = rpnMathExpression;
	}

	@When("I invoke the SOAP API")
	public void invokeRPNCalculatorSOAPAPI() {
	    RPNCalculatorSoap rpnWebService = new RPNCalculatorSoap();
	    RPNCalculator rpnCalculator = rpnWebService.getRPNCalculator();
	    
	    actualResult = rpnCalculator.evaluate(rpnMathExpression);
	}

	@Then("I expect the response as {string}")
	public void i_expect_the_response_as(String expectedResponse) {
		assertEquals(expectedResponse, actualResult);
	    
	}

}
