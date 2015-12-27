/*******************************************************
 * badabing.java                                       *
 * 	-a program to get comfortable with some of the *
 * 	syntax differences between java and c++.  I'm  *
 * 	getting comfortable with java.util.Scanner and *
 * 	function calls, at the moment.                 *
 *******************************************************/

import java.util.Scanner; 	//import the scanner

//still need to clarify 'static' vs 'non-static' function behaviors and implementation specifics
public class badabing {
	public static void main(String args[]){
	/*	System.out.printf("%s",args[0]);*/	// apparently the program name is not passed to 'main' in java

	//print out any argument strings passed to 'main'
		if (args.length == 0) 
			System.out.printf("%s","You didn't give an argument.\n");
		else{ 
			for (String s : args)
				System.out.printf("%s ",s);
			System.out.printf("\n");
		}
	//test the getString method		
		System.out.printf("You gave us:\t\'%s\'\n",getString());
	//test the getInt method		
		System.out.printf("You gave us:\t\'%s\'\n",getInt());
	//test the getDouble method		
		System.out.printf("You gave us:\t\'%s\'\n",getDouble());
	};
	
/*******************************************************
 * getString()                                         *
 * 	gets a line from standard input                *
 * 	inputs - none                                  *
 * 	returns - newline terminated String            *
 *******************************************************/
	public static String getString(){
		Scanner getter = new Scanner(System.in);
		System.out.printf("Give us a new string.\n");
		return getter.nextLine();
	};

/*******************************************************
 * getInt()                                            *
 * 	gets an Int from standard input                *
 * 	inputs - none                                  *
 * 	returns - the int obtained from standard in    *
 *******************************************************/
	public static int getInt(){
		Scanner getter = new Scanner(System.in);
		while(true){
			System.out.printf("Give us a new Int.\n");
			try{
				return getter.nextInt();
			}
			catch(java.util.InputMismatchException not_an_int){
				System.out.println("You gave us something else.");			
				getter.next();
			}
		}
	};

/*******************************************************
 * getDouble()                                         *
 * 	gets a Double from standard input              *
 * 	inputs - none                                  *
 * 	returns - the Double obtained from standard in *
 *******************************************************/
	public static double getDouble(){
		Scanner getter = new Scanner(System.in);
		while(true){
			System.out.printf("Give us a new floating point number.\n");
			try{
				return getter.nextDouble();
			}
			catch(java.util.InputMismatchException not_a_double){
				System.out.println("You gave us something else.");			
				getter.next();
			}
		}
	};
}
