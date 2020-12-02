package hwRegExp.deal;

public class Apple extends Product {

    public static final Double APPLE_DISCOUNT = 0.1;

    public Apple(String name, Double price, Integer quantity) {
        super(name, price, quantity);
    }

    @Override
    public Double getTotalSum() {

        if (this.getQuantity() > 3) {
            return super.getTotalSum() - (super.getTotalSum() * APPLE_DISCOUNT);
        }

        return super.getTotalSum();
    }
}
