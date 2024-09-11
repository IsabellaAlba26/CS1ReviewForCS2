import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    //constructor has the same name as the file and it has no return type
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 2007;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();
        specialOfTheDay("Pumpkin Spice Latte");
        countCups();
        baristasChoice();

        CoffeeDrink PumpkinSpiceLatte = new CoffeeDrink(2, "Pumpkin Spice",true);
        CoffeeDrink PumpkinColdBrew = new CoffeeDrink(3,"Pumpkin",false);

        System.out.print("Pumpkin Spice Latte ");
        PumpkinSpiceLatte.printInfo();
        System.out.println();
        System.out.print("Pumpkin Cold Brew ");
        PumpkinColdBrew.printInfo();


    }

    // Method to generate a random discount
    public void randomDiscount() {
        int randomInt;
        randomInt=(int)(Math.random()*30);
        System.out.println("Your random discount is: " + randomInt + "%");
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        System.out.println("Today's special is a " + special + "!");
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");
        for(int x=1; x<6; x=x+1){
            if(x<5){
            System.out.print(x + ", "); }
            else{
                System.out.print(x);
            }
        }
        System.out.println();
        for(int x=2; x<12; x=x+3){
            if(x<11) {
                System.out.print(x + ", ");
            }else{
                System.out.print(x);
            }
        }
        System.out.println();
        for(int x=8; x>-1; x=x-1){
            if (x>0) {
                System.out.print(x + ", ");
            }else{
                System.out.print(x);
            }
        }
        System.out.println();

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        double randomDecimal;
        randomDecimal=Math.random();
        if (randomDecimal<0.25){
            System.out.println("We recommend a Pumpkin Spice Latte.");
        }
        else if (randomDecimal<0.5){
            System.out.println("We recommend a Pumpkin Cold Brew.");
        }
        else if (randomDecimal<0.75){
            System.out.println("We recommend a Pumpkin Chai.");
        }
        else{
            System.out.println("We recommend an Apple Cinnamon Latte.");
        }
    }
}

