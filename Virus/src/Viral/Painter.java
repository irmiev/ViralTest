package Viral;
public class Painter extends Thread {

	ViralArea vA;

	public Painter(ViralArea vA) {
		this.vA = vA;
	}

	public void run() {
		while (true) {
			//System.out.println("I am painting!!");
			vA.repaint();
			
			try {
				this.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
