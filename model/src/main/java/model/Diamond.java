package model;

import javax.swing.ImageIcon;

public class Diamond extends GraphicElements implements Runnable {

	public Diamond(int x, int y) {
		super(32,32, x, y);
		super.icoObjet= new ImageIcon(getClass().getResource("/images/diam1.png"));
		super.imgObjet= this.icoObjet.getImage();
		
	}

	@Override
	public void run() {
		
		
	}
}
