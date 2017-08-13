package org.kgzt.mytest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest
{
	private static Calculator	calculator	= new Calculator();

	@Before
	public void setUp() throws Exception
	{
		calculator.clear();
	}

	@Test
	public void testAdd()
	{
		System.out.println("+++");
		calculator.add(2);
		calculator.add(3);
		assertEquals("加法", 5, calculator.getResult());
	}

	@Test
	public void testSubstract()
	{
		System.out.println("---");
		calculator.add(10);
		calculator.substract(2);
		assertEquals("减法", 8, calculator.getResult());
	}

	// @Ignore("ignore multiply")
	@Test
	public void testMultiply()
	{
		System.out.println("***");
		calculator.add(10);
		int result = calculator.multiply(2);
		assertEquals("乘法", 20, result);
	}

	@Test
	public void testDivide()
	{
		System.out.println("///");
		calculator.add(8);
		calculator.divide(2);
		assertEquals("除法", 4, calculator.getResult());
	}

}
