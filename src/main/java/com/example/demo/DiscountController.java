package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.DiscountRequest;
import com.example.demo.DiscountResponse;

@RestController
@RequestMapping("/discount")
public class DiscountController {

    @Autowired
    private DiscountService discountService;

    @PostMapping
    public DiscountResponse calculateDiscount(@RequestBody DiscountRequest request) {
        return discountService.calculateDiscount(request);
    }

}