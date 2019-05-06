package Javaa;

import java.util.Scanner;

public class ScoreT {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Please enter the Math score:");
		    Score maths = new Score();
		    System.out.print("Please enter English score:");
		    Score englishs =  new Score();
		    
		    
		    System.out.println("The total average is:" + (maths.value + englishs.value)/2);
		}
		catch(ScoreeeFormatException e) {
			e.printStackTrace();
			
		}
		
		
		
		

	}

}
