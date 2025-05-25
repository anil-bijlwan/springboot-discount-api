import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    @Inject
    private DiscountController discountController;

    public DiscountResponse calculateDiscount(DiscountRequest request) {
        double discountRate = 0.10;
        double purchaseAmount = request.getPurchaseAmount();

        double discountAmount = purchaseAmount * discountRate;
        double finalAmount = purchaseAmount - discountAmount;

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("customerName", request.getCustomerId());
        responseMap.put("finalAmount", finalAmount);

        DiscountResponse discountResponse = new DiscountResponse(request.getCustomerId(), finalAmount);
        discountResponse.setResponseMap(responseMap);

        return discountResponse;
    }

}