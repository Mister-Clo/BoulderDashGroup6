package contract;

import java.sql.SQLException;
import java.util.Observable;



/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {
	
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
