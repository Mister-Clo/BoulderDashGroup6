package contract;

import java.awt.Image;
import java.sql.SQLException;
import java.util.Observable;

import entity.HelloWorld;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	
	public int getXsolnoir();

	public void setXsolnoir(int xsolnoir);

	public int getYsolnoir();

	public void setYsolnoir(int ysolnoir);

	public Image getImgFond();
	public char[][] loadFind() throws SQLException;
	
	/**
	 * Gets the hello world.
	 *
	 * @return the helloworld entity
	 */
	//HelloWorld getHelloWorld();

	/**
	 * Load the message.
	 *
	 * @param code
	 *          the code
	 */
	//void loadHelloWorld(String code);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}
