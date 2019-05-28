package model;

import javax.swing.ImageIcon;

public class Rock extends GraphicElements {

	public Rock(int x, int y) {
		super(32,32, x, y);
		super.icoObjet= new ImageIcon(getClass().getResource("/images/roche.png"));
		super.imgObjet= this.icoObjet.getImage();
		
	}
}
