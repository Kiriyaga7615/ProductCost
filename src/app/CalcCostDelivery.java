package app;

public class CalcCostDelivery extends CalcCostBase {

    private static final double deliveryPrice = 256;

    @Override
    public double calcCost(Product product) {
        return product.getPrice() + deliveryPrice;
    }
}
