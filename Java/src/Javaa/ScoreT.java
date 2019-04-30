package Javaa;

import java.util.Scanner;

public class ScoreT {

	public static void main(String[] args) {
		int maths = 0;
		int englishs = 0;
		int averages = 0;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Please enter the Math score:");
		    maths = Integer.parseInt(scanner.nextLine());
		    System.out.print("Please enter English score:");
		    englishs = Integer.parseInt(scanner.nextLine());
		    
		    averages = (maths + englishs)/2;
		    System.out.println("The total average is" + averages);
		}
		catch(ArithmeticException e) {
			
			System.out.print("The number of metic is wrong");
			
		}
		
		catch(Exception e) {
			
			System.out.print("Wrong type of number");
		}
		
		
		
		

	}

}
