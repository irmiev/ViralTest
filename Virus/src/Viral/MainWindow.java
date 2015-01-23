package Viral;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class MainWindow extends JFrame {

	ViralArea vA;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MainWindow();
	}
	
	public MainWindow(){
		vA = new ViralArea();
		this.setTitle("Infection area");
		this.setBounds(10, 10, 1100, 600);
		this.setBackground(Color.white);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.add(vA);
	}

	public void paint(Graphics g){
		//super.paint(g);
		//vA.paint(g);
	}
}
