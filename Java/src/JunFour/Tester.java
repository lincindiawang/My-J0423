package JunFour;

public class Tester {

	public static void main(String[] args) {
		System.out.println(" Hello World!");
		
		Breakfast bf = new Breakfast();
		bf.start();
        
		BrushTeeth bt = new BrushTeeth();
		Thread thread = new Thread(bt);
		thread.start();
		

	}

}
