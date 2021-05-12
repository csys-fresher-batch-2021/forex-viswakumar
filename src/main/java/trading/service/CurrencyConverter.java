package trading.service;

import java.text.DecimalFormat;

public class CurrencyConverter {
	public static double converter(double amount, String currencyType) {
		double zero = 0;
		if (amount < 0) {
			return zero;
		} else {
			if (currencyType.equalsIgnoreCase("dollar")) {

				double dollarValue = amount * 0.0134;
				DecimalFormat decimal = new DecimalFormat("0.0000");
				dollarValue = Double.parseDouble(decimal.format(dollarValue));
				return dollarValue;
			} else {
				double inrValue = amount * 74.57;
				DecimalFormat decimal = new DecimalFormat("0.0000");
				inrValue = Double.parseDouble(decimal.format(inrValue));
				return inrValue;
			}
		}
	}
}
