package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import contract.IModel;
import model.Model;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	private IModel model ;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	
	


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
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		Graphics2D g2 = (Graphics2D)graphics;
		/** Draw background*/
		for(int i=0; i<30;i++) {
			for(int j=0; j<50; j++) {
				g2.drawImage(model.getImgFond(), model.getXsolnoir(), model.getYsolnoir(), null);
				model.setXsolnoir(model.getXsolnoir()+32);
			}
			model.setXsolnoir(0);
			model.setYsolnoir(model.getYsolnoir()+32);
		}
		//g2.clearRect(0, 0, this.getWidth(), this.getHeight());
		//graphics.drawString(this.getViewFrame().getModel().getHelloWorld().getMessage(), 10, 20);
		
	}
}
