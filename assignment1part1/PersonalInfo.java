import java.util.Scanner;

/*
/**
 *Assignment_Task1
 * @author imran
 */
public class PersonalInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
                
        //The input scanner code to request the name
        System.out.print("Please enter your name: ");
        String name= console.nextLine();      
       
        //The input scanner code to request the age
        System.out.print("Please enter your age: ");
        int age= console.nextInt();
      	
 	//Switching from number input to text input
	console.nextLine();

        //The input scanner code to request the gender
        System.out.print("Please enter your gender: ");
        String gender= console.nextLine();
      
        //The input scanner code to request the department
        System.out.print("Please enter your department: ");
        String department= console.nextLine();
      
        //The input scanner code to request the value of PI
        System.out.print("Please enter the value of  PI (3.1415926): ");
        double pi= console.nextDouble();
     
        //The output scanner code of the answers
        System.out.printf("\n%-20s %s %s \n", "Name",":",name);
        System.out.printf("%-20s %s %d \n", "Age",":",age);
        System.out.printf("%-20s %s %s \n","Gender",":",gender);
        System.out.printf("%-20s %s %s \n","Department",":",department);
        System.out.printf("%-20s %s %.2f \n","PI",":",pi);
    } 
   
 }


    
