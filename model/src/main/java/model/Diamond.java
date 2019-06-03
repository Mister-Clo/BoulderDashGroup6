package model;

import java.awt.Image;

import javax.swing.ImageIcon;


/**
 * Class Diamond
 * @author Group6
 *
 */
public class Diamond extends GraphicElements  {
	
	private int i=1;
	public Diamond(int x, int y)  {
		super(32,32, x, y);
		super.icoObject= new ImageIcon(getClass().getResource("/images/diam1.png"));
		super.imgObject= this.icoObject.getImage();	
	}
	
	public Diamond() {}
	/** 
	 * Shine method 
	 * enables the diamond to have a shiny effect
	 * @return
	 */
	public Image shine() {
		if((i==1)||(i>1 && i<5)) {
			this.setIcoObject(new ImageIcon(getClass().getResource("/images/diam"+i+".png")));
			this.setImgObject(this.getIcoObject().getImage());
			i++;
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {} 	
		}else {
			i=1;
		}
		return this.getImgObject();
	 }	
	}
	

		
	

	
