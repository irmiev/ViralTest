public class VictimClock extends Thread {

	private Victim victim;

	public VictimClock(Victim victim) {
		this.victim = victim;
	}

	public void run() {
		while(victim.getAlive()){
			victim.setXY(1, 0);
			//System.out.println("This is the victim calling");
			try {
				this.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
