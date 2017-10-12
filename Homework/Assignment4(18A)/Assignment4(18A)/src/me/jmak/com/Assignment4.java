package me.jmak.com;

import java.util.Scanner;

/**
 * @author Josh McIntyre
 * Purpose: To calculate exponentiations quickly.
 */
public class Assignment4 {

    public static void main(String[] args) {
        
        int a, b;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input the first integer: ");
        a = input.nextInt();
        System.out.println("\nPlease input the exponent integer: ");
        b = input.nextInt();
        
        System.out.println("\n" + a + " to the power of " + b + " is " + fastExponent(a, b));
    }
    
    public static int fastExponent(int a, int b) {
        int result = 1;
        
        if (b == 0) {
            result = 1;
            System.out.println("\n" + a + " to the power of " + b + " is: " + result);
            return result;
        }
        
        if (b == 0) {
            result = a;
            System.out.println("\n" + a + " to the power of " + b + " is: " + result);
            return result;
        }
        
        while (b != 0) {
            if (b%2 != 0) {
                result = result*a;
            }

           b = b/2;
           a = a*a;
        }
        
        return result;
    }
    
}
