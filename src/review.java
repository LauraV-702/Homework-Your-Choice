/**
 * Laura Villaraza
 * review.java
 * 10-07-24
 * Covered two review topics of java, arrays and HashMap
 * 
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 * The Review class allows for the user to interact with the ice cream 
 * program, and allows for them to select their favorit ice cream flavor.
 */
public class review {

    /**
     * The main method with a provided menu of flavors
     * 
     * @param args
     */
    public static void main(String[] args) {

        //store the flavors and initialize
        HashMap<String, String> flavorDescriptions = new HashMap<>();
        flavorDescriptions.put("Vanilla", ", classic and sweet!");
        flavorDescriptions.put("Chocolate", ", Rich and creamy!");
        flavorDescriptions.put("Strawberry", ", Sweet and fruity!");
        flavorDescriptions.put("Mango", ", Tropical and refreshing!");
        flavorDescriptions.put("Raspberry", ", Tangy and sweet!");

        //array of flowers for display
        String[] flavors ={"Vanilla", "Chocolate", "Strawberry", "Mango", "Raspberry"};
        System.out.print("Here's our flavors selection: ");

        for (String flavor : flavors) {
            System.out.println(flavor);
        }

        Scanner flavorInput = new Scanner(System.in); // Corrected constructor
        System.out.print("Enter your flavor: ");
        String userFlavor = flavorInput.nextLine(); // Read user input

        if (flavorDescriptions.containsKey(userFlavor)) {
            System.out.print("Here you go! " + userFlavor);
            System.out.println(flavorDescriptions.get(userFlavor));
        } else {
            System.out.println("Seems we don't have that flavor :(");
        }
        
        flavorInput.close();
    }
}