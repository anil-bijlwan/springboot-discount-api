import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.method.annotation.RequestBody;

import javax.inject.Inject;

@RestController
public class DiscountController {

    @Inject
    private DiscountService discountService;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Discount Calculator!";
    }

    @PostMapping("/calculate-discount")
    public DiscountResponse calculateDiscount(@RequestBody DiscountRequest request) {
        return discountService.calculateDiscount(request);
    }

}