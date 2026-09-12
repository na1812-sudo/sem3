class Product {
    String productId;
    String productName;

    // Constructor
    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}

public class Main {
    public static void main(String[] args) {

        Product product = new Product("P-1042", "Wireless Mouse");

        System.out.println(product.productId + " - " + product.productName);
    }
}