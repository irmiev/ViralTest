import java.awt.Color;
import java.awt.Graphics;


public class Victim implements Carrier{

	VictimClock clock;
	private boolean alive;
	private int x;
	private int y;
	
	public Victim(){
		alive = true;
		this.x = 1;
		this.y = 1;
		
		clock = new VictimClock(this);
		clock.start();
	}
	@Override
	public void setAlive(boolean alive) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getAlive() {
		// TODO Auto-generated method stub
		return alive;
	}
	
	public void paint(Graphics g){
		g.setColor(Color.green);
		g.fillOval(this.x, this.y, 5, 5);
	}
	
	public void setXY(int x, int y){
		this.x += x;
		this.y += y;
	}

}
