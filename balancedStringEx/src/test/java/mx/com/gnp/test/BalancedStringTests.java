package mx.com.gnp.test;

import mx.com.gnp.facade.BalancedString;
import mx.com.gnp.implementation.BalancedStringImpl;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Alex
 *
 */
public class BalancedStringTests {
	
	BalancedString check = new BalancedStringImpl();
	
	@Test
	public void BalanceTestsComplexTrue(){
		String test = "{`+Hola(asdw[awd(aa)dwd]fef)efewefw}";
		boolean result = check.isCorrect(test);
		Assert.assertTrue(result);
	}
	
	@Test
	public void BalanceTestsComplexFalse(){
		String test = "{`+Hola(asdw[awd(a}a)dwd]fef)efewefw}Ñ~";
		boolean result = check.isCorrect(test);
		Assert.assertFalse(result);
	}
	
	@Test
	public void BalanceTestsFalse(){
		String test = "{)";
		boolean result = check.isCorrect(test);
		Assert.assertFalse(result);
	}
	
	@Test
	public void BalanceTestsFalse2(){
		String test = "{]";
		boolean result = check.isCorrect(test);
		Assert.assertFalse(result);
	}
}
