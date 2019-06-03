package model;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Class Rock
 * @author Group6
 *
 */
public class Rock extends GraphicElements {
	private int i=1;

	/**
	 * Instantiates a rock
	 * @param x
	 * @param y
	 */
	public Rock(int x, int y) {
		super(32,32, x, y);
		super.icoObject= new ImageIcon(getClass().getResource("/images/roche.png"));
		super.imgObject= this.icoObject.getImage();
		
	}
	public Rock() {}
	@Override
	public Image shine() {
		if((i==1)||(i>1 && i<4)) {
			this.setIcoObject(new ImageIcon(getClass().getResource("/images/roche"+i+".png")));
			this.setImgObject(this.getIcoObject().getImage());
			i++;
		}else {
			i=1;
			this.setIcoObject(new ImageIcon(getClass().getResource("/images/roche"+i+".png")));
			this.setImgObject(this.getIcoObject().getImage());
		}
		return this.getImgObject();
	}
}
