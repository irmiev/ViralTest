package Viral;
public class VictimClock extends Thread {

	private Victim victim;
	private int dx;
	private int dy;
	private ViralArea world;
	
	public VictimClock(Victim victim) {
		this.victim = victim;
		this.dx = 1;
		this.dy = 1;
		world = victim.getWorld();
	}

	public void run() {
		while(victim.getAlive()){
			//System.out.println("Name: " + victim.getName() + " @ " + victim.getX() + "." + victim.getY());
			if(victim.getX() < 0 || victim.getX() > world.getWidth()){
				dx *= -1;
				victim.setXY(dx, 0);
			}
			if(victim.getY() < 0 || victim.getY() > world.getHeight()){
				dy *= -1;
				victim.setXY(0, dy);
			}
			victim.setXY(dx, dy);
			//victim.setXY(dx, dy);
			//System.out.println("This is the victim calling");
			try {
				this.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
