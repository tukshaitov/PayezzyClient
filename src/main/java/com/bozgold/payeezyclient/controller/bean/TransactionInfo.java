package com.bozgold.payeezyclient.controller.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionInfo {
    @JsonProperty("transaction_status")
    private String transactionStatus;

    @JsonProperty("validation_status")
    private String validationStatus;

    @JsonProperty("transaction_type")
    private String transactionType;

    @JsonProperty("transaction_id")
    private String transactionId;

    @JsonProperty("amount")
    private int amount;

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionInfo{" +
                "transactionStatus='" + transactionStatus + '\'' +
                ", validationStatus='" + validationStatus + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                '}';
    }
}
