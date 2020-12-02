package hwRegExp.deal;

public class Milk extends Product {

    public static final Double MILK_DISCOUNT = 0.5;

    public Milk(String name, Double price, Integer quantity) {
        super(name, price, quantity);
    }

    @Override
    public Double getTotalSum() {

        if (this.getQuantity() > 7) {
            return super.getTotalSum() - (super.getTotalSum() * MILK_DISCOUNT);
        }

        return super.getTotalSum();
    }
}
