package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * Class Ground
 * @author Group6
 *
 */
public class Ground extends GraphicElements {
	/**
	 * Instantiates a ground
	 * @param x
	 * @param y
	 */
	public Ground(int x, int y) {
		super(32, 32, x, y);
		super.icoObject= new ImageIcon(getClass().getResource("/images/sol.png"));
		super.imgObject= this.icoObject.getImage();
	}
	public Ground() {}
	
	/* (non-Javadoc)
	 * @see model.GraphicElements#shine()
	 */
	public Image shine() {
		return this.getImgObject();
	}

}
