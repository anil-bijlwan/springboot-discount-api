import java.util.HashMap;
import java.util.Map;

public class DiscountResponse {

    private String customerName;
    private double finalAmount;

    public DiscountResponse(String customerName, double finalAmount) {
        this.customerName = customerName;
        this.finalAmount = finalAmount;
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

    @Override
    public String toString() {
        return "DiscountResponse{" +
                "customerName='" + customerName + '\'' +
                ", finalAmount=" + finalAmount +
                '}';
    }

}