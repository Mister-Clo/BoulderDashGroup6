package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * Class DarkGround
 * @author Group6
 *
 */
public class DarkGround extends GraphicElements {

	/**
	 * Instantiates a new DarkGround
	 * @param x
	 * @param y
	 */
	public DarkGround(int x, int y) {
		super(32, 32, x, y);
		super.icoObject= new ImageIcon(getClass().getResource("/images/solnoir.png"));
		super.imgObject= this.icoObject.getImage();
	}
	public DarkGround() {}

	@Override
	public Image shine() {
		
		return this.getImgObject();
	}


}
