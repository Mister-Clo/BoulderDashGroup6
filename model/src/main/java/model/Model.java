package model;

import java.awt.Image;
import java.sql.SQLException;
import java.util.Observable;

import javax.swing.ImageIcon;

import contract.IModel;
import entity.Level1;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/** The helloWorld. */
	//private HelloWorld helloWorld;
	private DAOLevel1 daolevel1;
	
	/** The Frame background image.*/
	private int xsolnoir, ysolnoir;
	private ImageIcon iFond;
	private Image imgFond; 
	
	/**
	 * Instantiates a new model.
	 * @throws SQLException 
	 */
	public Model() throws SQLException {
		//this.helloWorld = new HelloWorld();
		
		this.xsolnoir=0;
		this.ysolnoir=0;
		this.iFond= new ImageIcon(getClass().getResource("/images/solnoir.png"));
		this.imgFond= this.iFond.getImage();
	}
	
	public int getXsolnoir() {return xsolnoir;}

	public void setXsolnoir(int xsolnoir) {this.xsolnoir = xsolnoir;}

	public int getYsolnoir() {return ysolnoir;}

	public void setYsolnoir(int ysolnoir) {this.ysolnoir = ysolnoir;}

	public Image getImgFond() {return imgFond;}
	
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
