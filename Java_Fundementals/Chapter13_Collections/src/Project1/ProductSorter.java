package Project1;

import java.util.List;

public class ProductSorter {
    List<Product> products;
    List<FoodProduct> foodProducts;
    List<HealthProduct> healthProducts;
    List<ElectricProduct> electricProducts;

    public ProductSorter() {
    }

    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }

    public int aantalProducten(List<Product> productList) {
        return productList.size();
    }

    //Nu komen we bij de interresante methode: “sortProduct(Product product)”
    //De methode gaat een product toevoegen aan de lijst van producten, maar ook in de correcte sub list.
    //Een food product zal in de lijst van producten EN in de lijst van food producten komen.
    //PAS OP: We willen geen duplicaten hebben! Als we proberen een object toetevoeg die een ID heeft die
    //al in de lijsten zit, voeg je die NIET toe!


}
