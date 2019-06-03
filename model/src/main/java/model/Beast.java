package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * Class Beast
 * @author Group6
 *
 */
public class Beast extends Character {
	/**
	 * Instantiate a monster
	 * @param x
	 * @param y
	 */
	public Beast(int x, int y) {
		super(32, 32, x, y);
		super.icoChar= new ImageIcon(getClass().getResource("/images/monster.png"));
		super.imgChar= this.icoChar.getImage();
	}
	/*public Image movebeast() {
		
	}*/
	
}

 