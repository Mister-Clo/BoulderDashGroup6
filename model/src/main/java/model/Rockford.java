package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Rockford extends Character{

	public Rockford(int x, int y) {
		super(32, 32, x, y);
		super.icoChar= new ImageIcon(getClass().getResource("/images/persoface.png"));
		super.imgChar= this.icoChar.getImage();
	}
	
	public void Contact(GraphicElements ge) {
		//horizontal contact
		if((super.rightContact(ge)==true && this.isMoveRight()==true) || (super.leftContact(ge)==true &&this.isMoveRight()==false)) {
			this.setMove(false);	
		}
		//beneath contact
		if(super.beneathContact(ge)==true && this.isMoveUp()==false){
			this.setMove(false);
		}
		//above contact
		if(super.aboveContact(ge)==true && this.isMoveUp()==true){
			this.setMove(false);
		}
		
	}
	
	public boolean groundContact(Ground ground) {
		if(this.leftContact(ground)==true || this.rightContact(ground)==true || this.beneathContact(ground)==true ||
				this.aboveContact(ground)==true) {
			return true;
		}else return true;
	}
	public boolean diamondContact(Diamond diam) {
		if(this.leftContact(diam)==true || this.rightContact(diam)==true || this.beneathContact(diam)==true ||
				this.aboveContact(diam)==true) {
			return true;
		}else return false;
	}

}
