package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


import javax.swing.JPanel;
import javax.swing.Timer;

import contract.IModel;
import model.DarkGround;
import model.Diamond;
import model.GraphicElements;
import model.Ground;
import model.Model;
import model.Rock;
import model.Wall;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer,ActionListener{

	/** The view frame. */
	private ViewFrame					viewFrame;
	private IModel model ;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	
	private ArrayList<Ground> tabGrounds;
	private ArrayList<Diamond> tabDiamonds;
	private ArrayList<Rock> tabRocks;
	private ArrayList<Wall> tabWalls;
	private ArrayList<DarkGround> tabDarkGrounds;
	private GraphicElements[][] objects = new GraphicElements[25][51];
	private char[][] elements = null;
    private Timer chrono;
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 * @throws SQLException 
	 */
	public ViewPanel(final ViewFrame viewFrame) throws SQLException {
		tabGrounds = new ArrayList<Ground>();
		tabDiamonds = new ArrayList<Diamond>();
		tabRocks = new ArrayList<Rock>();
		tabWalls = new ArrayList<Wall>();
		tabDarkGrounds= new ArrayList<DarkGround>();
		chrono = new Timer(10, this);
		
		this.model= new Model();
		this.setViewFrame(viewFrame);
		try {
			this.elements = this.model.loadFind();
		} catch (SQLException e) {e.printStackTrace();}
		/**Draw graphic elements*/
		for(int i=0; i<25;i++) {
			for(int j=0; j<51; j++) {
			   if(elements[i][j]=='.') {
				   objects[i][j] = new Ground(j*32, i*32);
				   this.tabGrounds.add((Ground) objects[i][j]);
			   }
			   else if(elements[i][j]=='-') {
				   objects[i][j] = new Wall(j*32, i*32);
				   this.tabWalls.add((Wall) objects[i][j]);
			   }
			   else if(elements[i][j]==' ') {
				   objects[i][j] = new DarkGround(j*32, i*32);
				   this.tabDarkGrounds.add((DarkGround) objects[i][j]);
			   }
			   else if(elements[i][j]=='D') {
				   objects[i][j] = new Diamond(j*32, i*32);
				   this.tabDiamonds.add((Diamond) objects[i][j]);
			   }
			   else if(elements[i][j]=='X') {
				   objects[i][j] = new Rock(j*32, i*32);
				   this.tabRocks.add((Rock) objects[i][j]); 
			   }
			  }
			}

		viewFrame.getModel().getObservable().addObserver(this);
		chrono.start();
	}
	
	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		//this.repaint();
		
	}
	/**
	 * Dig ground and collect diamonds
	 */
	private void dig() {
		for(int i=0; i<25;i++) {
			for(int j=0; j<51; j++) {
				if(objects[i][j].getClass().toString().equals(new Ground().getClass().toString())) {
					if(objects[i][j].getX()==this.viewFrame.getRockford().getX() && objects[i][j].getY()==this.viewFrame.getRockford().getY()) {
						this.tabGrounds.remove(objects[i][j]);
						objects[i][j]= new DarkGround(j*32, i*32);
			        	this.tabDarkGrounds.add((DarkGround) objects[i][j]);}
				}else if((objects[i][j].getClass().toString().equals(new Diamond().getClass().toString()))) {
					if(objects[i][j].getX()==this.viewFrame.getRockford().getX() && objects[i][j].getY()==this.viewFrame.getRockford().getY()) {
						this.tabDiamonds.remove(objects[i][j]);
						objects[i][j]= new DarkGround(j*32, i*32);
						this.tabDarkGrounds.add((DarkGround) objects[i][j]);
					}}}}}
	public void rockfall() {
		for(int i=0; i<25;i++) {
			for(int j=0; j<51; j++) {
				if((objects[i][j].getClass().toString().equals(new Rock().getClass().toString()))) {
						if((objects[i+1][j].getClass().toString().equals(new DarkGround().getClass().toString()))) {
					if(objects[i][j].getY()+32==objects[i+1][j].getY()) {
						tabRocks.remove(objects[i][j]);
						objects[i][j]= new DarkGround(j*32, i*32);
						objects[i+1][j]=new Rock(j*32, (i+1)*32);
						this.tabRocks.add((Rock) objects[i+1][j]);
						this.tabDarkGrounds.add((DarkGround) objects[i][j]);
					  }		
				  }
				}
			}
	   }
	}
	
	private void hitWall() {
		for(int i = 0; i< this.tabWalls.size(); i++) {
			 if(this.viewFrame.getRockford().isNear(this.tabWalls.get(i))) {
				 this.viewFrame.getRockford().ContactWall(this.tabWalls.get(i));
			 }}
	}
	private void hitRock() {
		for(int i = 0; i< this.tabRocks.size(); i++) {
			 if(this.viewFrame.getRockford().isNear(this.tabRocks.get(i))) {
				 this.viewFrame.getRockford().ContactRock(this.tabRocks.get(i));
			 } }
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		Graphics2D g2 = (Graphics2D)graphics;
		hitWall();
		hitRock();
		
	//Draw DarkGrounds
			for(int i = 0; i< this.tabDarkGrounds.size(); i++) {
			g2.drawImage(this.tabDarkGrounds.get(i).getImgObject(), this.tabDarkGrounds.get(i).getX(), this.tabDarkGrounds.get(i).getY(), null);
						}
	//Draw Grounds
		for(int i = 0; i< this.tabGrounds.size(); i++) {
			 g2.drawImage(this.tabGrounds.get(i).getImgObject(), this.tabGrounds.get(i).getX(), this.tabGrounds.get(i).getY(), null);
		 }
	//Draw Diamonds
		for(int i = 0; i< this.tabDiamonds.size(); i++) {
			 g2.drawImage(this.tabDiamonds.get(i).getImgObject(), this.tabDiamonds.get(i).getX(), this.tabDiamonds.get(i).getY(), null);
		 }	
    
	//Draw Walls
		for(int i = 0; i< this.tabWalls.size(); i++) {
			g2.drawImage(this.tabWalls.get(i).getImgObject(), this.tabWalls.get(i).getX(), this.tabWalls.get(i).getY(), null);
				 }
	//Draw Rocks
		for(int i = 0; i< this.tabRocks.size(); i++) {
			g2.drawImage(this.tabRocks.get(i).getImgObject(), this.tabRocks.get(i).getX(), this.tabRocks.get(i).getY(), null);
						}		
		
		g2.drawImage(this.viewFrame.getRockford().move(2), this.viewFrame.getRockford().getX(),this.viewFrame.getRockford().getY(), null); 
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		dig();
		hitWall();
		hitRock();
		rockfall();
		repaint();
		
		try {
		      Thread.sleep(20);
		    } catch (InterruptedException exc) {
		      exc .printStackTrace();
		    }
	}
	

}
