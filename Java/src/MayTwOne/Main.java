package MayTwOne;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		System.out.println("Hello World!");
		FileOutputStream fi = new FileOutputStream("ab.txt");
		fi.write(50);
		fi.write(84);
		fi.write(43);
		FileWriter fo = new FileWriter("aaa.txt");
		fo.write(22025);
		fo.write(29747);
		fo.write(0x65E9);
		fo.write(0x5B89);
		fo.flush();
		fo.close();
		
		

	}

}
