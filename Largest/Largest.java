/***********************************************************************
 Program Name: Largest.java
 Programmer's Name: Steven Bennett
 Program Description: Program accepts user input of 10 integers and
 determines and displays largest number input.
 ***********************************************************************/ 

import javax.swing.JOptionPane;

public class Largest {

	public static void main(String[] args) {
		
		//declare variables
		int number = 0;
		int largest = 0;
		int counter = 0;
		
		while(counter < 10){
			//prompt for user input
			try {
			number = Integer.parseInt(JOptionPane.showInputDialog("Enter digit from 0 to 9.   " + "Count: " + counter));
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Input invalid! Enter digit form 0 to 9.", 
						"D A T A  E R R O R", JOptionPane.ERROR_MESSAGE);
				counter--;
			}
			
			//if statement to validate input
			if ((number < 0) || (number > 9)) {
				JOptionPane.showMessageDialog(null, "Input invalid! Enter digit from 0 to 9.", "D A T A  E R R O R", JOptionPane.ERROR_MESSAGE);
				counter--;
			}
			else {
				//if statement to test if input is greater than largest
				if (number > largest){
					largest = number;
				}
				
			}
			
			counter++;
		}
		
		//display output of largest number entered.
		JOptionPane.showMessageDialog(null, "The largest number input is: " + largest, "Largest Input", JOptionPane.PLAIN_MESSAGE);
		
	}

}

