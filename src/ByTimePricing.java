public class ByTimePricing implements PricingStrategy {
    @Override
    public double calculatePrice(double time) {
        return time * 2.0;
    }
}
