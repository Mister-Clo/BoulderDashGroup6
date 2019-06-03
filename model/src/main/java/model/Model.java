package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import contract.IModel;

/**
 * The Class Model.
 *
 * @author Group6
 */
public final class Model extends Observable implements IModel {
	/** The DAOLevel */
	private DAOLevel daolevel;
	public ArrayList<Ground> tabGrounds;
	/**
	 * Instantiates a new model.
	 *  
	 */
	public Model()  {
		this.tabGrounds = new ArrayList<Ground>();
		
	}
	
	public char[][] loadFind() throws SQLException {
		char[][] b = null;
		this.daolevel = new DAOLevel(DBConnection.getInstance().getConnection());
		b=this.daolevel.findlevel(2);
		return b;
	}


	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/**
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	
	public Observable getObservable() {
		return this;
	}

	}
