package Viral;
import java.awt.Graphics;


public interface Carrier {
	public void setAlive(boolean alive);
	public boolean getAlive();
	public boolean isInfected();
	public void paint(Graphics g);
}
