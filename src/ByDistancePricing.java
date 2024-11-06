public class ByDistancePricing implements PricingStrategy {
    @Override
    public double calculatePrice(double distance) {
        return distance * 1.5;
    }
}
