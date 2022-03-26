package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.UniversalCurrency;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70, "AustralianDollar"),
    CANADIAN_DOLLAR(2.64, "CanadianDollar"),
    CHINESE_YR(13.84, "ChineseYR"),
    EURO(1.88, "Euro"),
    FRANC(2.02, "Franc"),
    POUND(1.64, "Pound"),
    RINGGIT(8.94, "Ringgit"),
    RUPEE(136.64, "Rupee"),
    SINGAPORE_DOLLAR(1.86, "SingaporeDollar"),
    US_DOLLAR(2.0, "USDollar"),
    UNIVERSAL_CURRENCY(1.0, "UniversalCurrency"),
    YEN(231.68, "Yen");

    private final double rate;
    private final String currencyName;

    CurrencyType(double rate, String currencyName) {
        this.rate = rate;
        this.currencyName = currencyName;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {
        for (CurrencyType cur : CurrencyType.values()) {
            if ( cur.currencyName.equals(currency.getClass().getSimpleName())){
                return cur;
            }
        }
     return null;
}}
