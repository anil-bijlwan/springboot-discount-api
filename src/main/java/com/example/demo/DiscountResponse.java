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

    public double getFinalAmount() {
        return finalAmount;
    }

    public Map<String, Object> getResponseMap() {
        return responseMap;
    }

}