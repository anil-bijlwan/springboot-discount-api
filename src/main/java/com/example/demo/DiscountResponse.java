package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class DiscountResponse {

    private String customerName;
    private double finalAmount;
    private Map<String, Object> responseMap;

    public DiscountResponse(String customerName, double finalAmount, Map<String, Object> responseMap) {
        this.customerName = customerName;
        this.finalAmount = finalAmount;
        this.responseMap = responseMap;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public void setResponseMap(Map<String, Object> responseMap) {
        this.responseMap = responseMap;
    }

    @Override
    public String toString() {
        return "DiscountResponse{" +
                "customerName='" + customerName + '\'' +
                ", finalAmount=" + finalAmount +
                '}';
    }

}