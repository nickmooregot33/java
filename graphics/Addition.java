import javax.swing.JOptionPane;

public class Addition{
	public static void main( String args[] ){
		boolean always = true;
		while(always){
			String firstNumber = JOptionPane.showInputDialog("Enter the dragon");
			String secondNumber = JOptionPane.showInputDialog("Enter the fist");


			try{
				int number1 = Integer.parseInt(firstNumber);
				int number2 = Integer.parseInt(secondNumber);
				int sum = number1 + number2;
				JOptionPane.showMessageDialog( null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
				break;
			}
			catch(java.lang.NumberFormatException dumbException){
				JOptionPane.showMessageDialog( null, "You didn't give me two integers.  Perhaps I shouldn't use movie names as the prompt.", "Exception thrown.  Not integers", JOptionPane.PLAIN_MESSAGE);
			};
		}
	}
}

