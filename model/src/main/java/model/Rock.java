package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Rock extends GraphicElements {

	public Rock(int x, int y) {
		super(32,32, x, y);
		super.icoObject= new ImageIcon(getClass().getResource("/images/roche.png"));
		super.imgObject= this.icoObject.getImage();
		
	}
	public Rock() {}
	@Override
	public Image shine() {
		
		return this.getImgObject();
	}
}
