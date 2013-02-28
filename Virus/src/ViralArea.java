import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class ViralArea extends JPanel {
	
	private Painter painter;
	private Victim c;
	
	public ViralArea(){
		
		this.setBounds(0, 0, 1000, 250);
		this.setBackground(Color.BLACK);
		c = new Victim();
		painter = new Painter(this);
		painter.start();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		c.paint(g);
		
	}
}
