package Javaa;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		while(true){
		try {
			System.out.print("Pizza想切幾片？");
		    int piece = Integer.parseInt(scanner.nextLine());
		    String a ;
		    
		    if(piece == 0 ){
		    	System.out.println("你確定不要切？");
		    }
		    
		    else if (piece>=1 && piece<=7 || piece>=9 && piece<=11 || piece>=13 && piece<=15) {
		    	System.out.println("數量錯誤！！");
		    	
		    }
		    else if(piece==8 || piece==12 || piece == 16){
		    	System.out.println("謝謝選購～");
		    	break;
		    
		    }
		    
		    else {
		    
	
		    System.out.println("超出範圍！！");}
		    	
		}
		
		catch(Exception e) {
			
			System.out.println("格式錯誤！！！");
			
		}
		
		
		
		
	

}




	}
}


