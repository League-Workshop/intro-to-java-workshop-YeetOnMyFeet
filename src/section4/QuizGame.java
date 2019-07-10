package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		int score = 0;
		// 1.  Create a variable to hold the user's score 
		String answer = JOptionPane.showInputDialog("Is the sky a hamburger?");
		// 2.  Ask the user a question 
		
		// 3.  Use an if statement to check if their answer is correct
		if (answer.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "You are dumb");
			
			
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Good job you answered the question correctly!");
			
		
		}
		score = score + 1;
		String answer2 = JOptionPane.showInputDialog("How many US president's are there?");
				if(answer.equalsIgnoreCase("45")) {
					JOptionPane.showMessageDialog(null, "Correct");
				}
				else { JOptionPane.showMessageDialog(null, "Wrong");
			
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
