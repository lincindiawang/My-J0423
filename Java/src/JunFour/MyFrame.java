package JunFour;
import java.awt.BorderLayout;

import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		
		setSize(500,500);
		JButton  okay = new JButton("Okay");
		JPanel north = new JPanel();
		north.add(okay);
		add(north, BorderLayout.NORTH);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		MyFrame f = new MyFrame();
	

	}

}
