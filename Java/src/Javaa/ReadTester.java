package Javaa;

import java.io.*;
public class ReadTester {

	public static void main(String[] args) {
		FileInputStream fil = null;
		try {
			fil = new FileInputStream( " result.txt");
			int w = fil.read();
			while (w != -1) {
				System.out.println(w);
				w= fil.read();
			}
		}
		catch( FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fil != null) {
				try {
					fil.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				
			}
			
		}

	}

}
