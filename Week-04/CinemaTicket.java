
/**
 *  An Automated Ticket Calculation System.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class CinemaTicket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double finalPrice = 0.0;
        
        System.out.println("---- Gorkha Cinema Ticket Calculator ----");
        System.out.println("");
        
        System.out.println("Enter age group (Child, Adult, or Senior): ");
        String ageGroup = sc.nextLine().trim().toLowerCase();
        System.out.println("");
        
        if (!(ageGroup.equals("child") || ageGroup.equals("adult") || ageGroup.equals("senior")))
        {
             System.out.println("ERROR: Invalid age group entered. Must be 'Child', 'Adult', or 'Senior'.");
             sc.close();
             return;
        }
        
        System.out.println("Enter movie language (Nepali, Hindi, or English): ");
        String language = sc.nextLine().trim().toLowerCase();
        System.out.println("");
        
        if (!(language.equals("nepali") || language.equals("hindi") || language.equals("english")))
        {
             System.out.println("Invalid movie language entered. Must be 'Nepali', 'Hindi', or 'English'. Please Try Again!");
             sc.close();
             return;
        }
        
        System.out.println("Are you a student with a valid ID? ");
        String isStudentStr = sc.nextLine().trim().toLowerCase();
        boolean isStudent = isStudentStr.equals("yes");
        System.out.println("");
        
        if (!(isStudentStr.equals("yes") || isStudentStr.equals("no"))) {
             System.out.println("Invalid input for student status. Must be 'yes' or 'no'. Please Try Again!");
             sc.close();
             return;
            }
            
        System.out.println("Is today a festival day? ");
        String isFestivalStr = sc.nextLine().trim().toLowerCase();
        boolean isFestival = isFestivalStr.equals("yes");
        System.out.println("");
        
        if (!(isFestivalStr.equals("yes") || isFestivalStr.equals("no"))) {
             System.out.println("Invalid input for festival status. Must be 'yes' or 'no'. Please Try Again!");
             sc.close();
             return;
        }
        
        sc.close();
        
        switch (ageGroup) {
            case "child":
                finalPrice = 150.0;
                break;
            case "adult":
                finalPrice = 250.0;
                break;
            case "senior":
                finalPrice = 200.0;
                break;
            default:
                System.out.println("Invalid Age Group Entered. Cannot Calculate Price.");
                return;
        }
        
        if (language.equals("hindi")) {
            finalPrice += 50.0;
        }
        else if
        (language.equals("english"))
        {
            finalPrice += 100.0;
        }
        else if
        (!language.equals("nepali"))
        {
            System.out.println("Movie Language Is Not Recognized. Using Base Price Without Surcharge.");
        }
        
        double priceBeforeDiscount = finalPrice;
        
        if (isStudent) {
            double studentDiscount = finalPrice * 0.20;
            finalPrice -= studentDiscount;
            System.out.println("Applied Student Discount (20%%): -" + studentDiscount);
            System.out.println("");
        }
        
        if (isFestival) {
            double festivalDiscount = finalPrice * 0.15;
            finalPrice -= festivalDiscount;
            System.out.println("Applied Festival Discount (15%%): -" + festivalDiscount);
            System.out.println("");
        }
        
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Base Price before Surcharge: " + (priceBeforeDiscount - (language.equals("hindi") ? 50.0 : language.equals("english") ? 100.0 : 0.0)));
        System.out.println("");
        System.out.println("Price before Discounts: " + priceBeforeDiscount);
        System.out.println("");
        System.out.println("** Final Ticket Price: " + finalPrice + " **");
        System.out.println("");
        System.out.println("----------------------------------------");
    }
}