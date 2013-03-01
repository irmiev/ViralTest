import java.awt.Color;
import java.awt.Graphics;


public class Victim implements Carrier{

	ViralArea world;
	VictimClock clock;
	private String name;
	private boolean alive;
	private int x;
	private int y;
	
	public Victim(int x, int y, String name, ViralArea world){
		alive = true;
		this.name = name;
		this.x = x;
		this.y = y;
		this.world = world;
		
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
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	public void paint(Graphics g){
		g.setColor(Color.green);
		g.fillOval(this.x, this.y, 5, 5);
		g.drawString(getName(), getX() - 20, getY() - 20);
		g.drawString("L=" + this.getX() + "." + this.getY(), getX() - 20, getY() - 5);
	}
	
	public void setXY(int x, int y){
		this.x += x;
		this.y += y;
	}
	
	public ViralArea getWorld(){
		return this.world;
	}
	
	public String getName(){
		return this.name;
	}
	@Override
	public boolean isInfected() {
		// TODO Auto-generated method stub
		return false;
	}

}
