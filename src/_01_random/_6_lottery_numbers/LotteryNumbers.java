package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random ran1 = new Random();
		Random ran2 = new Random();
		Random ran3 = new Random();
		Random ran4 = new Random();
		Random ran5 = new Random();
		Random ran6 = new Random();
		
		int randomNumber1 = ran1.nextInt(90) + 10;
		int randomNumber2 = ran2.nextInt(90) + 10;
		int randomNumber3 = ran3.nextInt(90) + 10;
		int randomNumber4 = ran4.nextInt(90) + 10;
		int randomNumber5 = ran5.nextInt(90) + 10;
		int randomNumber6 = ran6.nextInt(90) + 10;
	}
}
