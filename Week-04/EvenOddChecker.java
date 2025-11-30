
/**
 * A program that checks Even or Odd Number.
 *
 * @Gaurav Bhujel
 * @version 1.1
 */

import java.util.Scanner;

public class EvenOddChecker
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");

        int number = sc.nextInt(); 
        
        sc.close();
        
        if (number % 2 == 0) {
            System.out.println(number + " is an EVEN number.");
        } else {
            System.out.println(number + " is an ODD number.");
        }
    }
}