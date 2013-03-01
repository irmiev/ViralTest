import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;


public class ViralArea extends JPanel {
	
	private Painter painter;
	private Victim c;
	ArrayList<Carrier> victimList;
	
	public ViralArea(){
		victimList = new ArrayList<Carrier>();
		this.setBounds(0, 0, 1000, 500);
		this.setBackground(Color.BLACK);
		//c = new Victim(0, 200, "Josh", this);
		for(int i = 0; i < 10; i++){
			Random randomN = new Random();
			victimList.add(new Victim(randomN.nextInt(this.getWidth()), randomN.nextInt(this.getHeight()), "John" + Integer.toString(i), this));
		}
		painter = new Painter(this);
		painter.start();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		for(Carrier v : victimList)
			v.paint(g);
		
	}
}
