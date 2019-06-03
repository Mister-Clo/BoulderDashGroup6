package model;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Class Rockford
 * @author Group6
 *
 */
public class Rockford extends Character{
	
	/**
	 * Instatiates a new Rockford
	 * @param x
	 * @param y
	 */
	public Rockford(int x, int y) {
		super(32, 32, x, y);
		super.icoChar= new ImageIcon(getClass().getResource("/images/persoface.png"));
		super.imgChar= this.icoChar.getImage();
	}
	
	/**
	 * Controls the movement of the player
	 * @param freq
	 * @return
	 */
	public Image moveplayer(int freq) {
		String str = new String();
		ImageIcon ico;
		Image img;

		if(this.move==false) {
			if(this.count==0) {
				str="/images/lookdown.png";
			}
			if(this.isMoveUp()==true)
			{str="/images/creusegauche2.png";}
			if(this.isMoveUp()==false)
			{str="/images/lookdown.png";}
			if(this.isMoveRight()==true)
			{str="/images/marchedroitemain.png";}
			else if(this.isMoveRight()==false) 
			{str="/images/marchegauchemain.png";}
		}
		else {
			this.count++;
			if(this.count/freq ==0) {
				if(this.isMoveRight()==true)
				{str="/images/marchedroitepied.png";}
				else if(this.isMoveRight()==false) {str="/images/marchegauchepied.png";}
				else if(this.isMoveUp()==false) {str="/images/lookdown.png";}
			}else {
				 if(this.isMoveUp()==false) {str="/images/lookdown.png";}
				else if(this.isMoveRight()==true) {str="/images/marchedroitepied.png";}
				else if(this.isMoveRight()==false) {str="/images/creusegauche.png";}
				else if(this.isMoveUp()==true) {str="/images/creusegauche2.png";}
			}	
		}
		if(this.isHasContactabove()||this.isHasContactbelow()||this.isHasContactleft()||this.isHasContactright()) {
			this.count=0;
		}
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
	}
	/**
	 * Verifies Contact with a Wall 
	 * @param ge
	 */
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
	
	/**
	 * Verifies Contact with a Rock
	 * @param ge
	 */
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

