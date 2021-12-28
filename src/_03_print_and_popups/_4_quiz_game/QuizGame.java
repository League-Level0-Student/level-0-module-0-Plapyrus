package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String one = JOptionPane.showInputDialog("When was the first computer programming language created?");
				// 3.  Use an if statement to check if their answer is correct
				if (one.equals("1883")) {
					score +=1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				String two = JOptionPane.showInputDialog("How many letters are in this sentence?");
				if (two.equals("31")) {
					score +=1;
				}
				String three = JOptionPane.showInputDialog("What comes first in the alphabet, M or N?");
				if (three.equals("M")) {
					score +=1;
				}
				if (three.equals("m")) {
					score +=1;
				}
				String four = JOptionPane.showInputDialog("What is the answer to 6x4x8x5x8x3x9x1x0?");
				if (four.equals("0")) {
					score +=1;
				}
		// After all the questions have been asked, tell the user their final score 
		
		
			JOptionPane.showMessageDialog(null, "Your score is "+score);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
