package ge.edu.btu.currency.impl;

import ge.edu.btu.currency.CurrencyService;

public class CurrencyServicempl implements CurrencyService {


    private double exchangerate;
    @Override

    public double convert(double amount)  { return  amount/this.exchangerate;}

    @Override
    public void setExchangeRate(double value) { this.exchangerate=value;}




}
