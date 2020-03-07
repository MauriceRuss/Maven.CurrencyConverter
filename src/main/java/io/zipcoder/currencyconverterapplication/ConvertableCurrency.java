package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        //changed return to currencyType.getRate()/this.getType().getRate()
        return currencyType.getRate()/this.getType().getRate();
    }
    CurrencyType getType();
}
