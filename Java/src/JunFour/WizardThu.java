package JunFour;

public class WizardThu extends Thread{

	public void thunder(){
		System.out.println("Thunder start");
		
		try {
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Thunder ended");
	}

	@Override
	public void run() {
		thunder();
	}
	
	public static void main(String[] args) {
		WizardThu w1 = new WizardThu();
		w1.start();
		try {
			w1.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		WizardThu w2 = new WizardThu();
		w2.start();
		
		try {
			w2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	

	

	}
