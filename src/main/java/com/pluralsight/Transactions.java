package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transactions {
    LocalDateTime today = LocalDateTime.now();
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd|HH:mm:ss");
    String formatedDate = today.format(fmt);
    String description;
    String vendor;
    double amount;
    int securityPin;
    long cardNumber;
    String expoDate;

public Transactions(String formatedDate, String description, String vendor, double amount) {
    this.formatedDate = formatedDate;
    this.description = description;
    this.vendor = vendor;
    this.amount = amount;
}
public String getformatedDate(){
    return formatedDate;
    }
public void setFormatedDate(String formatedDate){
    this.formatedDate = formatedDate;
    }
public String getDescription(){
    return description;
}
public void setDescription(String description){
    this.description = description;
}
public String getVendor(){
    return vendor;
}
public void setVendor(String vendor){
    this.vendor = vendor;
}
public double getAmount() {
        return amount;
}
public void setAmount(double amount) {
        this.amount = amount;
}
private void paymentMethed(long cardNumber, String expoDate, int securityPin){
    this.cardNumber = cardNumber;
    this.expoDate = expoDate;
    this.securityPin = securityPin;
}

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getExpoDate(){
        return expoDate;
    }

    public void setExpoDate(String expoDate) {
        this.expoDate = expoDate;
    }

    public int getSecurityPin() {
        return securityPin;
    }

    public void setSecurityPin(int securityPin) {
        this.securityPin = securityPin;
    }
}


