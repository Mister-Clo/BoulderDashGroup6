package model;

import javax.swing.ImageIcon;

public class Rockford extends Character{
	
	public Rockford(int x, int y) {
		super(32, 32, x, y);
		super.icoChar= new ImageIcon(getClass().getResource("/images/persoface.png"));
		super.imgChar= this.icoChar.getImage();
	}
	
	public void ContactWall(Wall ge) {
		if((super.rightContact(ge)==true && this.isMoveRight()==true)) {
			this.setHasContactright(true);
		}
		else if((super.leftContact(ge)==true &&this.isMoveRight()==false)) {
			this.setHasContactleft(true);
		}
		else if((super.beneathContact(ge)==true && this.isMoveUp()==false)) {
			this.setHasContactbelow(true);
		}
		else if((super.aboveContact(ge)==true && this.isMoveUp()==true)) {
			this.setHasContactabove(true);
		}
			
	}
	public void ContactRock(Rock ge) {
		if((super.rightContact(ge)==true && this.isMoveRight()==true)) {
			this.setHasContactright(true);
		}
		else if((super.leftContact(ge)==true &&this.isMoveRight()==false)) {
			this.setHasContactleft(true);
		}
		else if((super.beneathContact(ge)==true && this.isMoveUp()==false)) {
			this.setHasContactbelow(true);
		}
		else if((super.aboveContact(ge)==true && this.isMoveUp()==true)) {
			this.setHasContactabove(true);
		}
			
	}
	

}

