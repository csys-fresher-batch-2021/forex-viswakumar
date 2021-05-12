package trading;

import trading.service.CurrencyConverter;

public class CurrencyConverterTest {
	public static void main(String[] args) {
		//test1
		double dollar=88;
		String inr ="inr";
		double actual=CurrencyConverter.converter(dollar, inr);
		System.out.println( dollar+" is equal to " +actual+"Rs");
         
		//test2
				double dollar1=74;
				String inr1 ="dollar";
				double actual1=CurrencyConverter.converter(dollar1, inr1);
				System.out.println( dollar1 +" is equal to "+actual1+"$");
	}
}
