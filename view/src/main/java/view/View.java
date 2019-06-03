package view;

import javax.swing.SwingUtilities;
import contract.IController;
import contract.IModel;
import contract.IView;


/**
 * The Class View.
 *
 * @author Group6
 */
public final class View implements IView, Runnable {

	/** The frame. */
	public final ViewFrame viewFrame;

	
	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}
    
	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewFrame.setVisible(true);
		
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}	
}
