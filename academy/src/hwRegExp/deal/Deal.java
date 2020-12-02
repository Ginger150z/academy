package hwRegExp.deal;

import java.time.LocalDate;

public class Deal {

    public static final int START_NUMBER_OF_PRODUCTS = 3;

    private Person seller;
    private Person buyer;

    private Product[] products = new Product[START_NUMBER_OF_PRODUCTS];
    private int productCounter = 0;

    private LocalDate deadlineDate = LocalDate.now().plusDays(10);


    public Deal(Person seller, Person buyer) {
        this.seller = seller;
        this.buyer = buyer;

        System.out.println("-----");
        System.out.println("Starting a new deal with \n" +
                "seller: " + seller.toString() + "\n" +
                "buyer: " + buyer.toString());
        System.out.println("-----");

    }

    public void addNewProduct(Product product) {

        if (productCounter + 1 > products.length) {
            Product[] tempArray = new Product[products.length * 2 + 1];
            System.arraycopy(products, 0, tempArray, 0, products.length);
            products = tempArray;
        }

        products[productCounter++] = product;

        System.out.println("-----");
        System.out.println("Successfully added new product to the deal: " + product.toString());
        System.out.println("-----");
    }

    public void removeProduct(int index) {

        if (index > products.length - 1 || index < 0) {
            System.out.println("-----");
            System.out.println("Failed to remove product from the deal: no such index");
            System.out.println("-----");

            return;
        }

        Product productToRemove = products[index];

        if (productCounter != index) {
            System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
        }

        products[productCounter] = null;
        productCounter--;

        System.out.println("-----");
        System.out.println("Successfully removed the product from the deal: " + productToRemove.toString());
        System.out.println("-----");
    }

    public void listProducts() {

        if (products[0] == null) {
            System.out.println("No products in the deal yet!");
            return;
        }

        System.out.println("-----");
        System.out.println("List all the products in the deal:");

        for (int i = 0; i < productCounter; i++){
            System.out.println(products[i]);
            System.out.println("Total sum for the product: " + products[i].getTotalSum());
            System.out.println("-----");
        }
    }

    public void performDeal() {

        Double totalSum = 0.0;

        for (int i = 0; i < productCounter; i ++) {
            totalSum += products[i].getTotalSum();
        }

        if (totalSum > buyer.getMoney()) {
            System.out.println("-----");
            System.out.println("The buyer " + buyer.getName() + " doesn't have enough money!");
            System.out.println("-----");
        } else {
            System.out.println("-----");
            System.out.println("The deal is done!\n" +
                    "The results of the deal:");

            listProducts();

            System.out.println("Overall sum of the deal: " + totalSum);

            seller.setMoney(seller.getMoney() + totalSum);
            buyer.setMoney(buyer.getMoney() - totalSum);

            System.out.println("Result money of the seller: " + seller.getMoney());
            System.out.println("Result money of the buyer: " + buyer.getMoney());

            System.out.println("-----");
        }
    }

    public void getDeadlineDate() {
        System.out.println("Deadline date: " + deadlineDate);
    }

}
