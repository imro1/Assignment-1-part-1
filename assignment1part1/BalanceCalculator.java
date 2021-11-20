import java.util.Scanner;

/*
*in this code i am programming a interest calculator for banking, investing etc.
 */

/**
 *
 * @author imran
 */
public class BalanceCalculator {
    public static void main(String[]args){
        Scanner console = new Scanner(System.in);
        
        //the user's inputs
        System.out.print("Please enter the initial balance: ");
        int initialB = console.nextInt();
        System.out.print("PLease enter the annual interest rate: ");
        double rate = console.nextDouble();
        System.out.print("Please enter number of years the client wants to save money in the bank: ");
        int years = console.nextInt();
        
        //the calculation
        double r = rate / 100;
        double finalB = initialB * Math.pow( 1 + r, years );
 
        
        //the output
        System.out.printf("\n%-20s %s %s \n","Initial Balance",":", initialB);
        System.out.printf("%-20s %s %s \n","Annual Interest Rate",":", rate);
        System.out.printf("%-20s %s %d \n","Saving Years",":", years);
        System.out.printf("----------------------------\n");
        System.out.printf("%-20s %s %.2f \n","Balance After" + years,"years:",finalB);
    }  
    
}
