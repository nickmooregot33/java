import javax.swing.JOptionPane;
import java.lang.Exception;

public class Addition{
	public static void main( String args[] ){
		Addition obj = new Addition();

		boolean test = true;
		int number1 = 0;
		int number2 = 0;

		//get input using message boxes
		try{
			number1 = obj.getData();
			number2 = obj.getData();
		}
		catch(Exception e){
			test = false;
		}
		

		//use the input; do the sum
		if (test){
			int sum = number1 + number2;

			//give the output
			JOptionPane.showMessageDialog( 
				null, 
				"The sum is " + sum, 
				"Sum of Two Integers",
			       	JOptionPane.PLAIN_MESSAGE
			);
		}
	}
//###########################################################################################
	private int getData() throws Exception{
		//repeat until user cancels or inputs valid data
		while(true){
			try{
				String numString;
				int number;
				if ((numString = JOptionPane.showInputDialog("Enter the dragon")) == null) throw new Exception();
				number = Integer.parseInt(numString);
				return number;
			}
			catch(java.lang.NumberFormatException wrong_input){
				JOptionPane.showMessageDialog( 	
					null, 
					"What I really want is for you to enter an integer.", 
					"Exception thrown.  Not an integer", 
					JOptionPane.WARNING_MESSAGE
				     	);
			}
		}
	}
}

