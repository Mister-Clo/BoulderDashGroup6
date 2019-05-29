package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import contract.IModel;
import model.Diamond;
import model.GraphicElements;
import model.Ground;
import model.Model;
import model.Rock;
import model.Rockford;
import model.Wall;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer, ActionListener {

	/** The view frame. */
	private ViewFrame					viewFrame;
	private IModel model ;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	private Rockford rockford;
	
	public Timer chrono = new Timer(5, this);
	
	


	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 * @throws SQLException 
	 */
	public ViewPanel(final ViewFrame viewFrame) throws SQLException {
		this.model= new Model();
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
		
		rockford = new Rockford(260,194);
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

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		Graphics2D g2 = (Graphics2D)graphics;
		char[][] elements = null;
		GraphicElements[][] objects = new GraphicElements[25][51];
		try {
			elements = model.loadFind();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		/** Draw background*/
		for(int i=0; i<30;i++) {
			for(int j=0; j<50; j++) {
				g2.drawImage(model.getImgFond(), model.getXsolnoir(), model.getYsolnoir(), null);
				model.setXsolnoir(model.getXsolnoir()+32);
			}
			model.setXsolnoir(0);
			model.setYsolnoir(model.getYsolnoir()+32);
		}
		/**Draw graphic elements*/
		for(int i=0; i<25;i++) {
			for(int j=0; j<51; j++) {
			   if(elements[i][j]=='.') {
				   objects[i][j] = new Ground(j*32, i*32);
				   g2.drawImage(objects[i][j].getImgObjet(), j*32, i*32, null);
			   }
			   else if(elements[i][j]=='-') {
				   objects[i][j] = new Wall(j*32, i*32);
				   g2.drawImage(objects[i][j].getImgObjet(), j*32, i*32, null);
			   }
			   else if(elements[i][j]==' ') {
				   g2.drawImage(model.getImgFond(), j*32, i*32, null);
			   }
			   else if(elements[i][j]=='D') {
				   objects[i][j] = new Diamond(j*32, i*32);
				   g2.drawImage(objects[i][j].shine(), j*32, i*32, null);
			   }
			   else if(elements[i][j]=='X') {
				   objects[i][j] = new Rock(j*32, i*32);
				   g2.drawImage(objects[i][j].getImgObjet(), j*32, i*32, null);
			   }
			  }
			}
		g2.drawImage(rockford.getImgObjet(), rockford.getX(), rockford.getY(), null);
		
		
		
	}





	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		repaint();
		try {
	        Thread.sleep(10);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	}
}
