
//all import declarations must appear before the first class declaration
//java.lang does not need to be imported, like not needing to link to stdio.h with -l on the command line
//java api documentation is at:
//java.sun.com/javase/8/docs/api/
//and you can download it to your computer at:
//java.sun.com/javase/downloads/index.jsp

import java.util.Scanner; //importing class Scanner

public class adding{
  public static void main{
    //create scanner object to scan input in from command window
    Scanner input = new Scanner(System.in);//System.in appears to be STD_IN or something similar
    
    /*declare our used variables*/
    int number1, 			//declarations like this can be split up onto separate lines
        number2,			//so we can add comments to each variable
        sum;				//while still keeping it as one statement for the compiler
    
    /*initialize our variables*/
    System.out.print("Enter first integer: ");
    number1 = input.nextInt(); 	//looks like an iterator, but we're using it like scanf("%d",&number1) here, complete with 
    							//killing the program when the user hits something other than an int
    System.out.print("Enter second integer: ");
    number2 = input.nextInt(); //same
    
    /*add the numbers and output to screen*/
    sum = number1 + number2; //add numbers
    System.out.printf("Sum is %d.\n",sum); //display sum
  }
}
