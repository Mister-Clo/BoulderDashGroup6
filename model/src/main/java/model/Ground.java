package model;

import javax.swing.ImageIcon;

public class Ground extends GraphicElements {

	public Ground(int x, int y) {
		super(32, 32, x, y);
		super.icoObjet= new ImageIcon(getClass().getResource("/images/sol.png"));
		super.imgObjet= this.icoObjet.getImage();
	}

}
