package trading.validator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import trading.service.CurrencyConverter;



public class CurrencyConverterValidation {
 
	@Test //negative input  
	public void test() {
		double doller=-1;
		double inr =400;
		double actual=CurrencyConverter.converter(doller, inr);
		assertEquals(0.0,actual,0.001);  //method return type is double ,it returns 0.0 if negative input
	}
	@Test //negative input 
	public void test1() {
		double doller=0;
		double inr =-3;
		double actual=CurrencyConverter.converter(doller, inr);
		assertEquals(0.0,actual,0.001);
	}
	
}
