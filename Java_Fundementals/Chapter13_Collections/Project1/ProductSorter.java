package Project1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ProductSorter {
    //Product initialProduct = new Product("initialiser",99999); niet meer nodig
    Set<Product> products= new HashSet<Product>(){};  // zie ttps://www.baeldung.com/java-initialize-hashset

    List<FoodProduct> foodProducts = new LinkedList<>(); //initialiseren!!!
    List<HealthProduct> healthProducts = new LinkedList<>();
    List<ElectricProduct> electricProducts = new LinkedList<>();



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
    //al in de lijsten zit, voeg je die NIET toe! => set
    public void sortProduct (Product product) {
        //System.out.println("products: "+products); //debugging
        this.products.add(product); //voegt produkten toe aan HashSet produkten.
        System.out.println("sorting: "+product.getClass());//debugging


            //nu filteren wij de produkten voor elke klasse:
            if (product instanceof FoodProduct) {foodProducts.add((FoodProduct) product);}
                else if (product instanceof HealthProduct) {healthProducts.add((HealthProduct) product);}
                else if (product instanceof ElectricProduct) {electricProducts.add((ElectricProduct) product);}
        }



    }


