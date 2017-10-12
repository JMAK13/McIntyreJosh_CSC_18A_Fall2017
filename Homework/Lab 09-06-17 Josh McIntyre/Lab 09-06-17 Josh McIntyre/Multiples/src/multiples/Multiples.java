package multiples;

import java.util.Scanner;

/**
 * @author Josh McIntyre
 * Purpose: Reads two integers and tells whether the first integer is a multiple of the second.
 */

public class Multiples {

    public static void main(String[] args) {
        
        boolean on1 = true, on2 = true;
        int val1 = 0, val2 = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while (on1) {
            System.out.print("Please type in the first integer: ");

            if (scanner.hasNextInt()) {
                val1 = scanner.nextInt();
                on1 = false;
            } else {
                System.out.println(val1 + " is not a valid integer please try again!");
                scanner.next();
            }
        }
        
       while (on2) {
            System.out.print("Please type in the second integer: ");

            if (scanner.hasNextInt()) {
                val2 = scanner.nextInt();
                on2 = false;
            } else {
                System.out.println(val2 + " is not a valid integer please try again!");
                scanner.next();
            }
        }
       
       if (val2 % val1 == 0) {
           System.out.println(val1 + " is a multiple of " + val2 + "!");
       } else {
           System.out.println(val1 + " is not a multiple of " + val2 + "!");
       }
    }
    
}
