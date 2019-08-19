package org.tektutor;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class RPNCalculatorTest {
	
	private RPNCalculator rpnCalculator;
	private double actualResult, expectedResult;
	
	
	@BeforeClass
	public static void initOnce() {
		System.out.println("Before Class method");
	}
	
	
	@Before
	public void init() {
		rpnCalculator = new RPNCalculator();
		actualResult = expectedResult = 0.0;
	}
	
	@After
	public void cleanUp() {
		rpnCalculator = null;
	}
	
	@AfterClass
	public static void tearDown()
	{
		System.out.println("After Class method");
	}
	
	@Test
	public void testSimpleAddition() {
		
		actualResult = rpnCalculator.evaluate("10 15 +");
		expectedResult = 25.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		
		actualResult = rpnCalculator.evaluate("10 115 +");
		expectedResult = 125.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	
	@Category(SmokeTest.class)
	@Test
	public void testSimpleSubstration() {
		
		actualResult = rpnCalculator.evaluate("100 15 -");
		expectedResult = 85.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		
		actualResult = rpnCalculator.evaluate("10 5 -");
		expectedResult = 5.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	
	@Test
	public void testSimpleMultiplication() {
	
		
		actualResult = rpnCalculator.evaluate("10 15 *");
		expectedResult = 150.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		
		actualResult = rpnCalculator.evaluate("10 5 *");
		expectedResult = 50.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	
	@Test
	public void testSimpleDivision() {
		
		
		actualResult = rpnCalculator.evaluate("100 25 /");
		expectedResult = 4.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		
		actualResult = rpnCalculator.evaluate("10 5 /");
		expectedResult = 2.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	
	@Test
	public void complexRPNMathExpression() {
		
		
		actualResult = rpnCalculator.evaluate("10 25 + 100 10 / *");
		expectedResult = 350.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		
	}

}
