//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();

		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i < 10; i++) {
			int randomNumber = randomMaker.nextInt(5);
			if(randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "You are awesome");
			} else if(randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "You are nice");
			} else if(randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "You are good at everything.");
			} else if(randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "You look good.");
			} else {
				JOptionPane.showMessageDialog(null, "You are so fun!!");
			}
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
