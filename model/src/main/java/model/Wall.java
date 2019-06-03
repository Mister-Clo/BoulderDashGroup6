package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * Class Wall
 * @author Group6
 *
 */
public class Wall extends GraphicElements {
	public Wall(int x, int y) {
		super(32,32, x, y);
		super.icoObject= new ImageIcon(getClass().getResource("/images/mur.png"));
		super.imgObject= this.icoObject.getImage();
	}
	public Wall() {}
	@Override
	public Image shine() {
		//Not implemented
		return this.getImgObject();
	}

}
