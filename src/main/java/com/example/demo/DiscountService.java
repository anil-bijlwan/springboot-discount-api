package com.example.demo;

import org.springframework.stereotype.Service;
import com.example.demo.DiscountRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class DiscountService {

    public DiscountResponse calculate(DiscountRequest request) {
        String customerId = request.getCustomerId();
        if("CUST1001".equals(customerId)) {
            String customerName = "Don Bosco";
            double purchaseAmount = request.getPurchaseAmount();
            double discountRate = request.getDiscountRate();
            double discountAmount = purchaseAmount * discountRate;
            double finalAmount = purchaseAmount - discountAmount;

            Map<String, Object> responseMap = new HashMap<>();
            responseMap.put("status", "success");
            responseMap.put("discountAmount", discountAmount);

            return new DiscountResponse(customerName, finalAmount, responseMap);
        } else {
            return new DiscountResponse("Unknown", 0.0, new hashMap<>());
        }
    }
}