
/**
 * To Make an Scholarship Eligibility Checker.
 *
 * @Gaurav Bhujel
 * @version 1.1
 */
import java.util.Scanner;

public class ScholarshipChecker{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter GPA (e.g., 3.5): ");
        double gpa = sc.nextDouble();
        System.out.println("");
        
        System.out.println("Enter Attendance Percentage (e.g., 90): ");
        int attendance = sc.nextInt();
        System.out.println("");
        
        System.out.print("Enter Attitude Score (1-10): ");
        int attitude = sc.nextInt();
        System.out.println("");
        
        sc.close();

        boolean isEligible = false;
            if (gpa >= 3.2) {
            if (attendance > 80) {
                 if (attitude < 5) {
                    isEligible = true;
                }
            }
        }
        
        System.out.println("---- Eligibility Result ----");
        System.out.println("");
        if (isEligible) {
            System.out.println("The Student Is Eligible For A scholarship.");
        } else {
            System.out.println("The Student Is Not Eligible For A scholarship.");
        }
    }
}