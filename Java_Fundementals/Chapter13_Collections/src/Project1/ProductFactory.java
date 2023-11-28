package Project1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class ProductFactory {
    ProductSorter productSorter;

    private String[] foodProducts={"Apple","Steak", "Potatoes","Salad","Pear"};
    String[] healthProducts = {"Face cream","Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    String[] electricProducts= {"Hair dryer","Vacuum", "Mixer", "Washing machine","Dishwasher"};


    public ProductFactory(ProductSorter productSorter){

    }
    //Deze klasse heeft een methode
    //“createProducts(int amount)”. Deze methode gaat een aantal producten aanmaken. Het process
    //gebeurt willekeurig. Elke product wordt op volgende manier aangemaakt:
    //- Gebruik de Random klasse om te bepalen welk soort object gemaakt wordt. (vb: 0 – food product, 1 –
    //health product, 2 - electric product)
    //- Gebruik de Random klasse om te bepalen wat de naam zal zijn (het moet een naam zijn uit de correcte
    //array. De productID zal een random nummer zijn tussen 0 en 150.
    //- Verstuur het object naar de “ProductSorter”.
    public void createProducts(int amount) {

        //create set of random unique ID numbers with size amount.
        //create an empty list of products
        LinkedList<Product> newProducts = new LinkedList<>();


        for (int i=0;i<amount;i++) {
            //add randomly foodProduct, healthProduct or electricProduct to a list.
            //choose a random product from each type and retrieve a random number from a set of unique IDs.
           Random newRandom = new Random();
           int select = newRandom.nextInt(1,4);
           switch (select) {
               case 1: {
                   newProducts.add(foodProducts[newRandom.nextInt(1,6)],newRandom.nextInt(0,151));
               }
           }
               case 2:{
               }
               case 3: {
    }

}
