package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Character {
	private int width, height,x, y;
	private boolean move=true;
	private boolean moveRight=true;
	private boolean moveUp=true;
	private boolean hasContactright=false;
	private boolean hasContactleft=false;
	private boolean hasContactabove=false;
	private boolean hasContactbelow=false;
	public int count;
	
	protected Image imgChar;
	protected ImageIcon icoChar;
	
	public Character(int width, int height, int x, int y) {
		super();
		this.width = 32;
		this.height = 32;
		this.x = x;
		this.y = y;
	}
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	public Image getImgChar() {return imgChar;}
	public void setImgChar(Image imgChar) {this.imgChar = imgChar;} 
	public int getCounter() {return count;}
	public void setCounter(int count) {this.count = count;}
	public boolean isMove() {return move;}
	public void setMove(boolean move) {this.move = move;}
	public boolean isMoveRight() {return moveRight;}
	public void setMoveRight(boolean moveRight) {this.moveRight = moveRight;}
	public boolean isMoveUp() {return moveUp;}
	public void setMoveUp(boolean moveUp) {this.moveUp = moveUp;}
	public boolean isHasContactright() {return hasContactright;}
	public void setHasContactright(boolean hasContactright) {this.hasContactright = hasContactright;}
	public boolean isHasContactleft() {return hasContactleft;}
	public void setHasContactleft(boolean hasContactleft) {this.hasContactleft = hasContactleft;}
	public boolean isHasContactabove() {return hasContactabove;}
	public void setHasContactabove(boolean hasContactabove) {this.hasContactabove = hasContactabove;}
	public boolean isHasContactbelow() {return hasContactbelow;}
	public void setHasContactbelow(boolean hasContactbelow) {this.hasContactbelow = hasContactbelow;}
	public Image move(int freq) {
		String str = new String();
		ImageIcon ico;
		Image img;
		if(this.move==false) {str="/images/persoface2.png";}
		if(this.move==true) {str="/images/persoface.png";}
		
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
	}
	
	//Detection of contact at the right of Rockford
    protected boolean rightContact(GraphicElements ge) {
    	if(this.x+32==ge.getX()&& this.y==ge.getY()) {
    		this.setHasContactright(true);
    		return true;
    	}else {this.setHasContactright(false);
    		return false;		
    	}
    }
  //Detection of contact at the left of Rockford
    protected boolean leftContact(GraphicElements ge) { 
    	if(this.x-32==ge.getX()&& this.y==ge.getY() ) {
    		this.setHasContactleft(true);
    		return true;
    	}else {this.setHasContactleft(false);
    		return false;		
    	}
}
  //Detection of contact beneath Rockford
    protected boolean beneathContact(GraphicElements ge) { 
		if(this.x==ge.getX() && this.y+32==ge.getY()) {
			this.setHasContactbelow(true);
			return true;
		}else {this.setHasContactbelow(false);
			return false;		
		}
}  
  //Detection of contact above Rockford
    protected boolean aboveContact(GraphicElements ge) { 
    	if(this.x==ge.getX() && this.y-32==ge.getY()) {
    		this.setHasContactabove(true);
			return true;
		}else {this.setHasContactabove(false);
			return false;		
		}
}
	
     public boolean isNear(GraphicElements ge) {
    	 if((this.x-32==ge.getX()&& this.y==ge.getY()) || (this.x+32==ge.getX()&& this.y==ge.getY()) || (this.x==ge.getX() && this.y-32==ge.getY()) || (this.x==ge.getX() && this.y+32==ge.getY())  ) {
     		return true;
     	}else return false;	
     }
   
     

}
