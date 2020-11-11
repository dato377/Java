package ge.edu.btu;

import ge.edu.btu.currency.impl.CurrencyServicempl;

public class Main {
    public static void main(String[] args) {

        CurrencyServicempl currencyService = new CurrencyServicempl();

        currencyService.setExchangeRate(1.33);
        double result=currencyService.convert(3.44);
        System.out.println(result);







    }






}
