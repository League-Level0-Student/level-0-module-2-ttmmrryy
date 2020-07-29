package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random ran1 = new Random();
		
		String lotto = "";
		
		for (int i = 0; i < 6; i++) {
			
			int randomNumber1 = ran1.nextInt(90) + 10;
			lotto += randomNumber1;
			lotto += " ";
			
//			int randomNumber2 = ran1.nextInt(90) + 10;
//			int randomNumber3 = ran1.nextInt(90) + 10;
//			int randomNumber4 = ran1.nextInt(90) + 10;
//			int randomNumber5 = ran1.nextInt(90) + 10;
//			int randomNumber6 = ran1.nextInt(90) + 10;
		
		}
		
		JOptionPane.showMessageDialog(null, "Your lottery number is: " + lotto, "LOTTO", JOptionPane.INFORMATION_MESSAGE);
	}
}
