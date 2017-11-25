package com.example.davidson.cryptocurrency;


import com.example.davidson.cryptocurrency.model.Currency;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class CurrencyExchange {

    @SerializedName("NGN")
    private double NGN;
    @SerializedName("USD")
    private double USD;
    @SerializedName("EUR")
    private double EUR;
    @SerializedName("JPY")
    private double JPY;
    @SerializedName("GBP")
    private double GBP;
    @SerializedName("AUD")
    private double AUD;
    @SerializedName("CAD")
    private double CAD;
    @SerializedName("CHF")
    private double CHF;
    @SerializedName("SEK")
    private double SEK;
    @SerializedName("NZD")
    private double NZD;
    @SerializedName("MXN")
    private double MXN;
    @SerializedName("SGD")
    private double SGD;
    @SerializedName("HKD")
    private double HKD;
    @SerializedName("NOK")
    private double NOK;
    @SerializedName("KRW")
    private double KRW;
    @SerializedName("TRY")
    private double TRY;
    @SerializedName("RUB")
    private double RUB;
    @SerializedName("INR")
    private double INR;
    @SerializedName("BRL")
    private double BRL;
    @SerializedName("ZAR")
    private double ZAR;




    public ArrayList<Currency> getCurrencyList() {
        ArrayList<Currency> currency = new ArrayList<>();

        currency.add(new Currency("Nigerian Naira", getNGN()));
        currency.add(new Currency("US Dollar", getUSD()));
        currency.add(new Currency("Euro", getEUR()));
        currency.add(new Currency("JAPANESE YEN", getJPY()));
        currency.add(new Currency("British Pound", getGBP()));
        currency.add(new Currency("Australian Dollar", getAUD()));
        currency.add(new Currency("Canadian Dollar", getCAD()));
        currency.add(new Currency("Swiss Franc", getCHF()));
        currency.add(new Currency("Swedish krona", getSEK()));
        currency.add(new Currency("New Zealand Dollar", getNZD()));
        currency.add(new Currency("Mexican Peso", getMXN()));
        currency.add(new Currency("Singapore Dollar", getSGD()));
        currency.add(new Currency("Hong Kong Dollar", getHKD()));
        currency.add(new Currency("Norwegian Krone", getNOK()));
        currency.add(new Currency("South Korean", getKRW()));
        currency.add(new Currency("Turkish lira", getTRY()));
        currency.add(new Currency("Russian ruble", getRUB()));
        currency.add(new Currency("Indian rupee", getINR()));
        currency.add(new Currency("Brazilian real", getBRL()));
        currency.add(new Currency("South African Rand", getZAR()));

        return currency;
    }

    public double getNGN() {
        return NGN;
    }

    public void setNGN(double NGN) {
        this.NGN = NGN;
    }

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public double getEUR() {
        return EUR;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR;
    }

    public double getJPY() {
        return JPY;
    }

    public void setJPY(double JPY) {
        this.JPY = JPY;
    }

    public double getGBP() {
        return GBP;
    }

    public void setGBP(double GBP) {
        this.GBP = GBP;
    }

    public double getAUD() {
        return AUD;
    }

    public void setAUD(double AUD) {
        this.AUD = AUD;
    }

    public double getCAD() {
        return CAD;
    }

    public void setCAD(double CAD) {
        this.CAD = CAD;
    }

    public double getCHF() {
        return CHF;
    }

    public void setCHF(double CHF) {
        this.CHF = CHF;
    }

    public double getSEK() {
        return SEK;
    }

    public void setSEK(double SEK) {
        this.SEK = SEK;
    }

    public double getNZD() {
        return NZD;
    }

    public void setNZD(double NZD) {
        this.NZD = NZD;
    }

    public double getMXN() {
        return MXN;
    }

    public void setMXN(double MXN) {
        this.MXN = MXN;
    }

    public double getSGD() {
        return SGD;
    }

    public void setSGD(double SGD) {
        this.SGD = SGD;
    }

    public double getHKD() {
        return HKD;
    }

    public void setHKD(double HKD) {
        this.HKD = HKD;
    }

    public double getNOK() {
        return NOK;
    }

    public void setNOK(double NOK) {
        this.NOK = NOK;
    }

    public double getKRW() {
        return KRW;
    }

    public void setKRW(double KRW) {
        this.KRW = KRW;
    }

    public double getTRY() {
        return TRY;
    }

    public void setTRY(double TRY) {
        this.TRY = TRY;
    }

    public double getRUB() {
        return RUB;
    }

    public void setRUB(double RUB) {
        this.RUB = RUB;
    }

    public double getINR() {
        return INR;
    }

    public void setINR(double INR) {
        this.INR = INR;
    }

    public double getBRL() {
        return BRL;
    }

    public void setBRL(double BRL) {
        this.BRL = BRL;
    }

    public double getZAR() {
        return ZAR;
    }

    public void setZAR(double ZAR) {
        this.ZAR = ZAR;
    }


}
