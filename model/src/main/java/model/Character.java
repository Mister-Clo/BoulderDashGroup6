package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * Class Character
 * @author Group6
 *
 */
public class Character {
	protected int width, height,x, y;
	protected boolean move=true;
	protected boolean moveRight=true;
	protected boolean moveUp=true;
	protected boolean hasContactright=false;
	protected boolean hasContactleft=false;
	protected boolean hasContactabove=false;
	protected boolean hasContactbelow=false;
	protected int count;
	
	protected Image imgChar;
	protected ImageIcon icoChar;
	
	public Character(int width, int height, int x, int y) {
		super();
		this.width = 32;
		this.height = 32;
		this.x = x;
		this.y = y;
	}
	/**
	 * @return width
	 */
	public int getWidth() {return width;}
	/**
	 * Sets the width
	 * @param width
	 */
	public void setWidth(int width) {this.width = width;}
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	/**
	 * @return Charcter's image
	 */
	public Image getImgChar() {return imgChar;}
	/**
	 * Sets the image of character
	 * @param imgChar
	 */
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
	public void setIcoChar(ImageIcon icoChar) {this.icoChar = icoChar;}
	public ImageIcon getIcoChar() {return icoChar;}
	

	
	
	
    /**
     * Detection of contact at the right of Rockford
     * @param ge
     * @return true when rightContact if not false
     */
    protected boolean rightContact(GraphicElements ge) {
    	if(this.x+32==ge.getX()&& this.y==ge.getY()) {
    		this.setHasContactright(true);
    		return true;
    	}else {this.setHasContactright(false);
    		return false;		
    	}
    }
  
    /**
     * Detection of contact at the left of Rockford
     * @param ge
     * @return true when leftContact if not false
     */
    protected boolean leftContact(GraphicElements ge) { 
    	if(this.x-32==ge.getX()&& this.y==ge.getY() ) {
    		this.setHasContactleft(true);
    		return true;
    	}else {this.setHasContactleft(false);
    		return false;		
    	}
}
  
    /**
     * Detection of contact beneath Rockford
     * @param ge
     * @return true when beneathContact if not false
     */
    protected boolean beneathContact(GraphicElements ge) { 
		if(this.x==ge.getX() && this.y+32==ge.getY()) {
			this.setHasContactbelow(true);
			return true;
		}else {this.setHasContactbelow(false);
			return false;		
		}
}  
  
    /**
     * Detection of contact above Rockford
     * @param ge
     * @return true when aboveContact if not false
     */
    public boolean aboveContact(GraphicElements ge) { 
    	if(this.x==ge.getX() && this.y-32==ge.getY()) {
    		this.setHasContactabove(true);
			return true;
		}else {this.setHasContactabove(false);
			return false;		
		}
}
	
     /**
      * Verify Rockford is near a graphic element
      * @param ge
      * @return true if near if not false 
      */
    public boolean isNear(GraphicElements ge) {
    	 if((this.x-32==ge.getX()&& this.y==ge.getY()) || (this.x+32==ge.getX()&& this.y==ge.getY()) || (this.x==ge.getX() && this.y-32==ge.getY()) || (this.x==ge.getX() && this.y+32==ge.getY())  ) {
     		return true;
     	}else return false;	
     }
     /**
      *  Verify Rockford is near a monster
      * @param ge
      * @return true if near if not false 
      */
    public boolean isNearMonster(Character ge) {
    	 if((this.x-32==ge.getX()&& this.y==ge.getY()) || (this.x+32==ge.getX()&& this.y==ge.getY()) || (this.x==ge.getX() && this.y-32==ge.getY()) || (this.x==ge.getX() && this.y+32==ge.getY())  ) {
     		return true;
     	}else return false;	
     }
     

}
