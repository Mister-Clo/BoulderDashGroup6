package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import javax.swing.JFrame;
import contract.IController;
import contract.IModel;
import model.Rockford;

/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
class ViewFrame extends JFrame implements KeyListener {

	/** The model. */
	private IModel						model;

	/** The controller. */
	private IController				controller;
	/** The Constant serialVersionUID. */
	private Rockford rockford;
	
	private static final long	serialVersionUID	= -697358409737458175L;

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @throws HeadlessException
	 *           the headless exception
	 */
	public ViewFrame(final IModel model) throws HeadlessException {
		this.buildViewFrame(model);
		this.rockford=new Rockford(256,192);
	
	}
	public Rockford getRockford() {return rockford;}
	public void setRockford(Rockford rockford) {this.rockford = rockford;}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param gc
	 *          the gc
	 */
	public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(model);
	
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param title
	 *          the title
	 * @throws HeadlessException
	 *           the headless exception
	 */
	public ViewFrame(final IModel model, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model
	 *          the model
	 * @param title
	 *          the title
	 * @param gc
	 *          the gc
	 */
	public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(model);
	}

	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	/*private IController getController() {
		return this.controller;
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	protected void setController(final IController controller) {
		this.controller = controller;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	protected IModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Builds the view frame.
	 *
	 * @param model
	 *          the model
	 */
	private void buildViewFrame(final IModel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setFocusable(true);
		this.requestFocusInWindow(true);
		try {
			this.setContentPane(new ViewPanel(this));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.setSize(1504, 828);
		this.setLocationRelativeTo(null);
		this.setTitle("BoulderDash");
	}

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 */
	/*public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}*/

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(final KeyEvent e) {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	public void keyPressed(final KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
			if(this.getRockford().isHasContactright()==false) {
				this.getRockford().setMove(true);
				this.getRockford().setMoveRight(true);
				this.getRockford().setX(this.getRockford().getX()+32);
			}				
		}
		 if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			 if(this.getRockford().isHasContactleft()==false) {
					this.getRockford().setMove(true);
					this.getRockford().setMoveRight(false);
					this.getRockford().setX(this.getRockford().getX()-32);
				}
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			if(this.getRockford().isHasContactabove()==false) {
				this.getRockford().setHasContactright(false);
				this.getRockford().setMove(true);
				this.getRockford().setMoveUp(true);
				this.getRockford().setY(this.getRockford().getY()-32);
			}
			
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			if(this.getRockford().isHasContactbelow()==false) {
				this.getRockford().setMove(true);
				this.getRockford().setMoveUp(false);
				this.getRockford().setY(this.getRockford().getY()+32);	
			}
		}
		
	//	this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyReleased(final KeyEvent e) {
		this.getRockford().setMove(false);
		this.getRockford().setHasContactright(false);
		this.getRockford().setHasContactleft(false);
		this.getRockford().setHasContactabove(false);
		this.getRockford().setHasContactbelow(false);
		
	}
}
