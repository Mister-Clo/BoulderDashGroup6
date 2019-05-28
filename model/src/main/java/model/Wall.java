package model;

import javax.swing.ImageIcon;

public class Wall extends GraphicElements {

	public Wall(int x, int y) {
		super(32,32, x, y);
		super.icoObjet= new ImageIcon(getClass().getResource("/images/mur.png"));
		super.imgObjet= this.icoObjet.getImage();
		
	}

}
