package hwRegExp.deal;

public class Application {

    public static void main(String[] args) {

        Person customer1 = new Person("Sergey", 500.0);
        Person customer2 = new Person("Kate", 800.0);

        Deal deal = new Deal(customer1, customer2);

        deal.addNewProduct(new Banana("Banana", 50.0, 2));
        deal.addNewProduct(new Apple("Apple", 20.0, 5));
        deal.addNewProduct(new Milk("Apple", 60.0, 1));
        deal.addNewProduct(new Product("Cucumber", 30.0, 3));
        deal.addNewProduct(new Product("Pineapple", 100.0, 2));

        deal.listProducts();

        deal.removeProduct(0);

        deal.listProducts();

        deal.performDeal();

        deal.getDeadlineDate();

    }
}
