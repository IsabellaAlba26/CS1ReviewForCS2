// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int pnumberOfCups, String pflavor, boolean phasWhippedCream) {
        numberOfCups=pnumberOfCups;
        flavor=pflavor;
        hasWhippedCream=phasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        System.out.println("Order Deets");
        System.out.println("Number of Cups: " + numberOfCups);
        System.out.println("Flavor: " + flavor);
        System.out.println("Whipped Cream: " + hasWhippedCream);

    }
}
