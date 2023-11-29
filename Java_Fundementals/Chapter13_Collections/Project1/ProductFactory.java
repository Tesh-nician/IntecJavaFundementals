package Project1;

import java.util.HashSet;
import java.util.Random;

public class ProductFactory {
    ProductSorter productSorter;

    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    ProductSorter mySorter = new ProductSorter();

    HashSet productionSet = new HashSet<>();


    //Deze klasse heeft een methode
    //“createProducts(int amount)”. Deze methode gaat een aantal producten aanmaken. Het process
    //gebeurt willekeurig. Elke product wordt op volgende manier aangemaakt:
    //- Gebruik de Random klasse om te bepalen welk soort object gemaakt wordt. (vb: 0 – food product, 1 –
    //health product, 2 - electric product)
    //- Gebruik de Random klasse om te bepalen wat de naam zal zijn (het moet een naam zijn uit de correcte
    //array. De productID zal een random nummer zijn tussen 0 en 150.
    //- Verstuur het object naar de “ProductSorter”.



    //This method creates new products
    public void createProducts(int amount) {

        //create set of random unique ID numbers with size amount.
        //create an empty list of products
        //niet meer nodig:LinkedList<Product> newProducts = new LinkedList<>();


        do {
            //add randomly foodProduct, healthProduct or electricProduct to a list.
            //choose a random product from each type and retrieve a random number from a set of unique IDs.
            Random newRandom = new Random();
            int select = newRandom.nextInt(1, 4);
            switch (select) {
                case 1: {
                    //Product (name,productID)
                    String newName = foodProducts[newRandom.nextInt(0, 5)];
                    int newID = newRandom.nextInt(0, 151);
                    FoodProduct productToBeAdded = new FoodProduct(newName, newID);
                    //newProducts.add(productToBeAdded); //oude methode
                    // System.out.println("TBA: "+productToBeAdded); //debugging
                    mySorter.sortProduct(productToBeAdded);
                    //productionSet.add(productToBeAdded);
                    break;
                }

                case 2: {
                    String newName = healthProducts[newRandom.nextInt(0, 5)];
                    int newID = newRandom.nextInt(0, 151);
                    HealthProduct productToBeAdded = new HealthProduct(newName, newID);
                    //newProducts.add(productToBeAdded); // oude methode
                    //System.out.println("TBA: "+productToBeAdded); debugging
                    mySorter.sortProduct(productToBeAdded);
                    break;
                }
                case 3: {
                    String newName = electricProducts[newRandom.nextInt(0, 5)];
                    int newID = newRandom.nextInt(0, 151);
                    ElectricProduct productToBeAdded = new ElectricProduct(newName, newID);
                    //newProducts.add(productToBeAdded); //oude methode
                    //System.out.println("TBA: "+productToBeAdded); debugging
                    mySorter.sortProduct(productToBeAdded);
                    break;
                }

            } //end switch
        }  while (mySorter.products.size()<=amount-1); //end for-loop


        //nu sorteren wij de products lijst.
        //mySorter.products.forEach(product -> mySorter.sortProduct(product));//niet meer nodig, gebeurt in createProducts methode.

        //Vervolgens print je af hoeveel producten er zijn, en je
        //print elke lijst van subklassen van producten af.

        System.out.println("Aantal produkten: "+mySorter.products.size());
        System.out.println("Food produkten: "+mySorter.getFoodProducts());
        System.out.println("Health produkten: "+mySorter.getHealthProducts());
        System.out.println("Electric produkten: "+mySorter.getElectricProducts());

    } //end method



}
