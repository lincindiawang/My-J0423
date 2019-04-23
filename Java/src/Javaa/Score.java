package Javaa;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		int maths = 0;
		int englishs = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the Math score:");
		try {
		    maths = Integer.parseInt(scanner.nextLine());
		    System.out.print("Please enter English score:");
		    englishs = Integer.parseInt(scanner.nextLine());
		    
		    int averages = (maths + englishs)/2;
		    System.out.println("The total average is" + averages);
		}
		catch(ArithmeticException e) {
			System.out.print("格式錯誤");
		}
		
		catch(NumberFormatException e) {
			System.out.print("The number of format is wrong");
		}
		
		
		

	}

}
