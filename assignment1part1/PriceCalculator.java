import java.util.Scanner;

/*
*This code is meant to demonstrate the price calculator in java edition.
*It also asks for the user's inputs and does the calculation to output the final values.
*It uses Scanner as well.
*/

/**
 * Assignment_Task2
 * @imran
 */
public class PriceCalculator {
    
   public static void main(String[]args) {
       
       Scanner console = new Scanner(System.in);
       
       //the user's inputs
       System.out.print("Please enter the  item price: ");
       double price = console.nextDouble();
       System.out.print("Please enter the discount ratio: ");
       double discount = console.nextDouble();
        
       //federal and provincial taxes
       double fedTax = 5;
       double provTax = 9.975;
       
       //the calculation and formulas
       double discountedPrice = price - ( price * discount / 100 );
       double fedTaxed = discountedPrice * fedTax / 100;
       double provTaxed = discountedPrice * provTax / 100;
       double finalPrice = discountedPrice + provTaxed + fedTaxed;
       
       //the output
       System.out.printf("\n%-20s %s %.2f \n","Original Price",":", price);
       System.out.printf("%-20s %s %.2f \n","Discount Ratio",":", discount);
       System.out.printf("%-20s %s %.2f \n","Price Before Tax",":",discountedPrice);
       System.out.println("----------------------------");
       System.out.printf("%-20s %s %.2f \n","Federal Tax",":", fedTaxed);
       System.out.printf("%-20s %s %.2f \n","Provincial Tax",":", provTaxed);
       System.out.printf("%-20s %s %.2f \n","Final Price",":", finalPrice);
       
    }
}
        