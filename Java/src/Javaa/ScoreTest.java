package Javaa;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
			try {
				System.out.print("Please enter the Math score:");
			    int maths = Integer.parseInt(scanner.nextLine());
			    if (maths<0 || maths>100) {
			    	System.out.print("The Score is wrong!");
			    	
			    }
			    else {
			    	System.out.print("Please enter English score:");
			    
			    }
			    int englishs = Integer.parseInt(scanner.nextLine());
			    if(englishs<0 || englishs>0 ){
			    	
			    	System.out.print("The score is wrong~");
			    	
			    }
			    else {
			    
		
			    System.out.println("The total average is" + (englishs + maths)/2);}
			    	
			}
			
			catch(ArithmeticException e) {
				
				System.out.print("The number of metic is wrong");
				
			}
			
			catch(NumberFormatException e) {
				
				System.out.print("The number of format is wrong");
				
			}
			
			
		

	}

}
