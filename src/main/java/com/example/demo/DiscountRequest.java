package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class DiscountRequest {

    private String customerId;
    private double purchaseAmount;

    public DiscountRequest(String customerId, double purchaseAmount) {
        this.customerId = customerId;
        this.purchaseAmount = purchaseAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    @Override
    public String toString() {
        return "DiscountRequest{" +
                "customerId='" + customerId + '\'' +
                ", purchaseAmount=" + purchaseAmount +
                '}';
    }

}



