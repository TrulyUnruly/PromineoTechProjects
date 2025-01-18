/**
 * 
 */
package projects;

import java.sql.Connection;

import projects.dao.DbConnection;

/**
 * 
 */
@SuppressWarnings("unused")
public class Projects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	DbConnection.getConnection();
	}

}
