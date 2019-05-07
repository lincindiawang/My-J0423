package Javaa;

import java.io.File;
import java.io.FileReader;

public class TodayTest {

	public static void main(String[] args) {
		
		int n = Integer.parseInt("25");
		//FileReader frd = new FileReader("abc.txt");
		File dom = new File("C:\\AppServ");
		if(dom.exists() && dom.isDirectory()) {
			//System.out.println(file.exists());
			//System.out.println(file.getName());
			//System.out.println(file.getAbsolutePath());
			//System.out.println(file.length());
			File[] file = dom.listFiles();
			for(File d:file) {
				System.out.println(d.getName());
			}
			System.out.println(dom.mkdirs());
			File fif = new File(dom,"hahahah");
			System.out.println(fif.mkdir());
			//System.out.println(fif.delete());
		}
		//else {
			//System.out.println("Please enter the name again!");
		//}
		//if(file.exists() ) {
			//System.out.println(file.exists());
			//System.out.println(file.getName());
			//System.out.println(file.getAbsolutePath());
			//System.out.println(file.length());
			
		//}else {
			//System.out.println("Please enter the name again!");
		//}
		
		
	}

	

}
