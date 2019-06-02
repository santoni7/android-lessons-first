package com.bigdig.myfirstandroidapp.model;

public class BankCard {
    private String ownerName;
    private String cardNumber;
    private float amount;
    private String expirationDate;
    private int pin;

    public BankCard(String ownerName, String cardNumber, float amount, String expirationDate, int pin) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.expirationDate = expirationDate;
        this.pin = pin;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
