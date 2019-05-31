package model;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;


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
	
	
	
	@Override
	public Image shine() {
		if(i>3) {i=1;}
		this.setIcoObject(new ImageIcon(getClass().getResource("/images/diam"+i+".png")));
		this.setImgObject(this.getIcoObject().getImage());
		i++;
		
		return this.getImgObject();
		
	}
	
		
	}
	

		
	

	
