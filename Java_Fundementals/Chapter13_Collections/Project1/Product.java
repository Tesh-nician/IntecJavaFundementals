package Project1;

public class Product {
    String name;
    int productID;

    public Product(String name, int productID) {
        this.name = name;
        this.productID = productID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productID=" + productID +
                '}';
    }
}
