package hwRegExp.deal;

public class Banana extends Product {

    public static final Double BANANA_DISCOUNT = 0.7;

    public Banana(String name, Double price, Integer quantity) {
        super(name, price, quantity);
    }

    @Override
    public Double getTotalSum() {

        if (this.getQuantity() > 10) {
            return super.getTotalSum() - (super.getTotalSum() * BANANA_DISCOUNT);
        }

        return super.getTotalSum();
    }
}
