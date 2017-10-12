package evens.and.odds;

import java.util.Scanner;

/**
 * @author Josh McIntyre
 * Purpose: Just a simple application testing whether or not an inputted
 *          number is even or odd.
 */

public class EvensAndOdds {

    public static void main(String[] args) {
        
        boolean on = true;
        int value = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while (on) {
            System.out.print("Please input an integer: ");

            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                on = false;
            } else {
                System.out.println("That is not a valid integer please try again!");
                scanner.next();
            }
        }
        
        if (value % 2 == 0) {
            System.out.println(value + " is an even number!");
        } else {
            System.out.println(value + " is an odd number!");
        }
    }
    
}
