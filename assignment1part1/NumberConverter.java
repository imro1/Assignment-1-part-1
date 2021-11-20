package assignment1part1;


import java.util.Scanner;

/*

import java.util.Scanner;

/**
This is a code that converts an octal number to a decimal number with the use of "For" method.
 */

/**
 *Assignment_Task3 
 *@imran
 */
public class NumberConverter {
    
    public static void main(String[]args) {    
        Scanner console = new Scanner(System.in);
        
        //the user's input
        System.out.print("Please enter a 4-digits octal number:");
        int octalNum = console.nextInt();
        
        //the result is equal to 0
        int result = 0;
        
        //copy of user's input 
        int copy_octalNum = octalNum;
        
        for (int i = 0; copy_octalNum > 0; i++) {
        
            //delete the last digit
            int ld = copy_octalNum % 10;
       
            //the us of mathpow(power)
            double power = Math.pow(8,i);
                
            
            
            //the calculation
            result += (ld * power);
            copy_octalNum =copy_octalNum/ 10;
       
        }
        //output the answer
        System.out.printf("\n%-5s %s %d \n","Octal Number",":", octalNum);
        System.out.printf("%-5s %s %d \n","Decimal Number",":", result);
       
    }
}
//ps. this code took me many hours to understand