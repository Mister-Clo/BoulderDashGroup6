package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Ground extends GraphicElements {

	public Ground(int x, int y) {
		super(32, 32, x, y);
		super.icoObject= new ImageIcon(getClass().getResource("/images/sol.png"));
		super.imgObject= this.icoObject.getImage();
	}
	public Ground() {}
	@Override
	public Image shine() {
		
		return this.getImgObject();
	}

}
