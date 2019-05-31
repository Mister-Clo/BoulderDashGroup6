package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/** The helloWorld. */
	//private HelloWorld helloWorld;
	private DAOLevel1 daolevel1;
	
	/**
	 * Instantiates a new model.
	 * @throws SQLException 
	 */
	public Model() throws SQLException {
		//this.helloWorld = new HelloWorld();
		
		
	}
	
	

	@Override
	public char[][] loadFind() throws SQLException {
		char[][] b = null;
		this.daolevel1 = new DAOLevel1(DBConnection.getInstance().getConnection());
		b=this.daolevel1.find();
		return b;
	}

	
	

	/**
     * Gets the hello world.
     *
     * @return the hello world
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	/*public HelloWorld getHelloWorld() {
		return this.helloWorld;
	}*/


	/**
     * Sets the hello world.
     *
     * @param helloWorld
     *            the new hello world
     */
/*	private void setHelloWorld(final HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
		this.setChanged();
		this.notifyObservers();
	}

	/**
     * Load hello world.
     *
     * @param code
     *            the code
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	/*public void loadHelloWorld(final String code) {
		try {
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			this.setHelloWorld(daoHelloWorld.find(code));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	
	public Observable getObservable() {
		return this;
	}

	}
