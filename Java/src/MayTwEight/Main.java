package MayTwEight;

public class Main {

	public static void main(String[] args) {
		Horse h = new Horse();
		h.start();
		//for(int a = 1; a <= 950 ;  a ++) {
			//System.out.println("Horse 1 :" + a );
		//}
		HorseRunnable ha = new HorseRunnable();
		Thread th = new Thread(ha);
		th.start();
		System.out.println("end game");

	}

}
