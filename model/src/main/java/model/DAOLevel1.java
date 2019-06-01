package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.transform.Result;

import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

import entity.Level1;

public class DAOLevel1 extends DAOEntity<Level1> {
	private char[][] elements; 

	public DAOLevel1(Connection connection) throws SQLException {
		super(connection);
	}

	@Override
	public boolean create(Level1 entity) {
		// Not implemented
		return false;
	}

	@Override
	public boolean delete(Level1 entity) {
		// Not implemented
		return false;
	}

	@Override
	public boolean update(Level1 entity) {
		// Not implemented
		return false;
	}

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
			/**Filling a 2-Dimensional char Array with the characters from the database*/  
			while(resultSet.next()) {
				strCurrentline=resultSet.getString("map");
				for(int j=0; j<51;j++) {
					elements[i][j]=strCurrentline.charAt(j);
				}
				i++;
				  /*Output map for level
				for(int a=0; a<resultSet.getMetaData().getColumnCount();a++) {
					System.out.println(resultSet.getObject(a+1));
				}*/
				System.out.print("");
			}
			
		}catch (final SQLException e) {
			e.printStackTrace();
		}
		return elements;		
	}

	@Override
	public Level1 find(String code) {
		//Not implemented
		return null;
	}

	@Override
	public Level1 find(int id) {
		//Not implemented
		return null;
	}

}
