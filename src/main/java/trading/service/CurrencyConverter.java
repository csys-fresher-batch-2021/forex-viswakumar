package trading.service;

import java.text.DecimalFormat;

public class CurrencyConverter {
	 public static double converter(double dollar,double inr) {
		 double zero=0;
	  if(dollar < 0 || inr <0)
	  {
		  return zero;
	  }
	  else {
   	  if(dollar== 0) {
   		  
   		  double dollarValue=inr*0.0134;
   		  DecimalFormat decimal = new DecimalFormat("0.0000");
   			dollarValue = Double.parseDouble(decimal.format(dollarValue));
   		  return dollarValue;
   	  }
   	  else {
   		  double inrValue=dollar*74.57;
   		  DecimalFormat decimal = new DecimalFormat("0.0000");
   			inrValue = Double.parseDouble(decimal.format(inrValue));
   		  return inrValue;
   	  }
    }
 }
}
