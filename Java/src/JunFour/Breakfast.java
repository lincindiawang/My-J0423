package JunFour;

public class Breakfast extends Thread{

	@Override
	public void run() {
		
        try {
			
			System.out.println("Making Breakfast");
			Thread.sleep(3000);
			System.out.println("Finish Making Breakfast");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//super.run();
	}
	

}
