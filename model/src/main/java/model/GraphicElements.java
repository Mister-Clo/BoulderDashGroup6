package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class GraphicElements {
	private int width, height;
	private int x, y;
	
	protected Image imgObject;
	protected ImageIcon icoObject;
	
	public GraphicElements(int width, int height, int x, int y) {
		super();
		this.width = 32;
		this.height = 32;
		this.x = x;
		this.y = y;
	}
	
	public GraphicElements() {};
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	public Image getImgObject() {return imgObject;}
	public void setImgObject(Image imgObject) {this.imgObject = imgObject;} 
	public void setIcoObject(ImageIcon icoObject) {this.icoObject = icoObject;}
	public ImageIcon getIcoObject() {return icoObject;}

	public abstract Image shine();

}
