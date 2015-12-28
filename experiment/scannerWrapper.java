/*******************************************************
 * badabing.java                                       *
 * 	-a program to get comfortable with some of the *
 * 	syntax differences between java and c++.  I'm  *
 * 	getting comfortable with java.util.Scanner and *
 * 	function calls, at the moment.                 *
 *******************************************************/

import java.util.Scanner; 	//import the scanner

//still need to clarify 'static' vs 'non-static' function behaviors and implementation specifics
public class scannerWrapper{
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
	String messages[] = {	"Give us a",		//beginning of message
	       			"n Int.\n",		//datatype  
				" String.\n",		//datatype 
				" Long.\n",		//datatype 
				" Double.\n",		//datatype 
				"You gave us something else.\n"	//message_two
			};
	//test the getLine method		
		System.out.printf("You gave us:\t\'%s\'\n",getLine(messages[0]+messages[2]));
	//test the getInt method		
		System.out.printf("You gave us:\t\'%s\'\n",getInt(messages[0]+messages[1], messages[5]));
	//test the getLong method		
		System.out.printf("You gave us:\t\'%s\'\n",getLong(messages[0]+messages[3], messages[5]));
	//test the getDouble method		
		System.out.printf("You gave us:\t\'%s\'\n",getDouble(messages[0]+messages[4], messages[5]));
	};
	
/*******************************************************
 * getString()                                         *
 * 	gets a line from standard input                *
 * 	inputs - none                                  *
 * 	returns - newline terminated String            *
 *******************************************************/
	public static String getLine(String message){
		Scanner getter = new Scanner(System.in);
		System.out.printf("%s",message);
		return getter.nextLine();
	};

/*******************************************************
 * getInt()                                            *
 * 	gets an Int from standard input                *
 * 	inputs - none                                  *
 * 	returns - the int obtained from standard in    *
 *******************************************************/
	public static int getInt(String message_one, String message_two){
		Scanner getter = new Scanner(System.in);
		while(true){
			System.out.printf("%s",message_one);	//"Give us a new Int."
			try{
				return getter.nextInt();
			}
			catch(java.util.InputMismatchException not_an_int){
				System.out.println(message_two);	//"You gave us something else."			
				getter.next();
			}
		}
	};

/*******************************************************
 * getLong()                                           *
 * 	gets a long from standard input                *
 * 	inputs - none                                  *
 * 	returns - the long obtained from standard in   *
 *******************************************************/
	public static long getLong(String message_one, String message_two){
		Scanner getter = new Scanner(System.in);
		while(true){
			System.out.printf("%s",message_one);	//"Give us a new Int."
			try{
				return getter.nextLong();
			}
			catch(java.util.InputMismatchException not_a_long){
				System.out.println(message_two);	//"You gave us something else."			
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
	public static double getDouble(String message_one, String message_two){
		Scanner getter = new Scanner(System.in);
		while(true){
			System.out.printf("%s",message_one);	//"Give us a new floating point numbern"
			try{
				return getter.nextDouble();
			}
			catch(java.util.InputMismatchException not_a_double){
				System.out.println(message_two); 	//"You gave us something else."			
				getter.next();
			}
		}
	};
}
