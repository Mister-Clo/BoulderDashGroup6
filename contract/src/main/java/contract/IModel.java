package contract;

import java.sql.SQLException;
import java.util.Observable;



/**
 * The Interface IModel.
 *
 * @author Group6
 */
public interface IModel {
	/**
	 * Gets the characters of a level
	 * @return the 2-dimensional array containing each character of a level
	 * @throws SQLException
	 */
	public char[][] loadFind() throws SQLException;
	
	Observable getObservable();
}
