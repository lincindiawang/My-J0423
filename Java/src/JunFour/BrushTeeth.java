package JunFour;

public class BrushTeeth implements Runnable {

	@Override
	public void run() {
    try {
			
			System.out.println("Brushing Teeth");
			Thread.sleep(2000);
			System.out.println("Finish Brushing Teeth");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	

}
