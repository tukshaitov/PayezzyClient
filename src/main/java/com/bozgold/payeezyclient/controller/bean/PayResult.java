package com.bozgold.payeezyclient.controller.bean;

public class PayResult {
    private int code;
    private String description;

    public PayResult() {
    }

    public PayResult(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
