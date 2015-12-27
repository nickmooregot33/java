/*******************************************************
 * badabing.java                                       *
 * 	-a program to get comfortable with some of the *
 * 	syntax differences between java and c++.  I'm  *
 * 	getting comfortable with java.util.Scanner and *
 * 	function calls, at the moment.                 *
 *******************************************************/


import java.util.Scanner;
public class badabing {
	public static void main(String args[]){
	/*	System.out.printf("%s",args[0]);*/	// apparently the program name is not passed to 'main' in java
	//print out any argument strings passed to 'main'
		if (args.length == 0) 
			System.out.printf("%s","You didn't give an argument.\n");
		else if (args.length == 1)
			System.out.printf("%s.\n",args[0]);
		else{ 
			for (String s : args)
				System.out.printf("%s ",s);
			System.out.printf("\n");
		}

	//still need to clarify 'static' vs 'non-static' behaviors
	//	badabing tester = new badabing(); //haven't implemented a constructor at this point in time
		
		System.out.printf("You gave us:\t\'%s\'\n",getString());
	};
	public static String getString(){

		Scanner getter = new Scanner(System.in);
		System.out.printf("Give us a new string.\n");
		String returnval = new String(getter.nextLine());
		return returnval;
	};

	public static int getInt(){
		return 0;
	};

	public static double getDouble(){
		return 0.0;
	};
}
