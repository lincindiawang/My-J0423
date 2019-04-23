package Javaa;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int money = 1000000;
		int getmoney = 0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many people in the game?");
		String people = scanner.nextLine();
		try{
		    int p = Integer.parseInt(people);
		    getmoney = money/p;
		    System.out.println("Each one earned" + "" + getmoney + "" + "dollars");
		}
		
		catch(Exception e){
			System.out.print("Wrong type of answer");
		}
		
		

	}

}
