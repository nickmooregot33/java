
import java.util.Scanner; //importing class Scanner

public class adding{
  public static void main{
    //create scanner object to scan input in from command window
    Scanner input = new Scanner(System.in);
    
    /*declare our used variables*/
    int number1;
    int number2;
    int sum;
    
    /*initialize our variables*/
    System.out.print("Enter first integer: ");
    number1 = input.nextInt(); //iterator in the scanner I guess
    System.out.print("Enter second integer: ");
    number2 = input.nextInt(); //same
    
    /*add the numbers and output to screen*/
    sum = number1 + number2; //add numbers
    System.out.printf("Sum is %d.\n",sum); //display sum
  }
}
