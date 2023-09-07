package br.com.devxlabs.ravin.utils;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MathUtilsTest {
	
	public static MathUtils mt;
	
	@BeforeClass
	public static void setUp() {
		mt = new MathUtils();
	}
	
	@Test
	public void sum_shouldSumTwoNumbers() {
		//Arrange
		float numberA = 10;
		float numberB = 5.0f;
		float numberC = 3.0f;
		float expectedResult = numberA + numberB + numberC;
		
		//Act
		float result = mt.sum(numberA, numberB, numberC);
		
		//Assert
		assertEquals(expectedResult, result, 0);
	}
	
	@Test()
	public void divide_throwArithmticDivideException() {
		//Arrange
		int numberA = 10;
		int numberB = 0;
		
		//Assert
		assertThrows(ArithmeticException.class, () -> mt.divide(numberA, numberB));
	}
}
