package com.bozgold.payeezyclient.controller.bean;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.web.bind.annotation.RequestParam;

public class TokenPayRequest {

    @JsonProperty("token_value")
    private String tokenValue;

    @JsonProperty("amount")
    private int amount;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("card_type")
    private String cardType;

    @JsonProperty("cardholder_name")
    private String cardHolder;

    @JsonProperty("exp_date")
    private String expDate;

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "TokenPayRequest{" +
                "tokenValue='" + tokenValue + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardHolder='" + cardHolder + '\'' +
                ", expDate='" + expDate + '\'' +
                '}';
    }
}
