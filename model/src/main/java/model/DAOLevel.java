package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

import entity.Level;

/**
 * Class DAOLevel
 * @author Group6
 *
 */
public class DAOLevel extends DAOEntity<Level> {
 

	public DAOLevel(Connection connection) throws SQLException {
		super(connection);
	}

	@Override
	public boolean create(Level entity) {
		// Not implemented
		return false;
	}

	@Override
	public boolean delete(Level entity) {
		// Not implemented
		return false;
	}

	@Override
	public boolean update(Level entity) {
		// Not implemented
		return false;
	}
	
	 
	/**
	 * method findlevel Fills a 2-Dimensional char Array with the characters from the database 
	 * @param id
	 * @return char[][]
	 */
	public char[][] findlevel(final int id) {
		 char[][] elements = new char[25][51];
		 String strCurrentline = null;
		 int i= 0;
		
		try {
			final String sql= "{call FetchLevel(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			call.getMoreResults(Statement.KEEP_CURRENT_RESULT); 
			while(resultSet.next()) {
				strCurrentline=resultSet.getString("map");
				for(int j=0; j<51;j++) {
					elements[i][j]=strCurrentline.charAt(j);
				}
				i++;
				System.out.print("");
			}
		}catch (final SQLException e) {e.printStackTrace();}
		return elements;}

	@Override
	public Level find(String code) {
		//Not implemented
		return null;}

	@Override
	public Level find(int id) {
		//Not implemented
		return null;}

}
