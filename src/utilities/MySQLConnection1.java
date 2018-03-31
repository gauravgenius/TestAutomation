package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection1 {

	private static Connection connection;
	private String sql;
	private String database;
	private String user;
	private String password;

	public MySQLConnection1(String databaseURL, String user, String password) {
		
		this.database = databaseURL;
		this.user = user;
		this.password = password;
	}
	
	public boolean connect() throws SQLException {
		connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(database, user, password);
            return (connection != null) ? true : false;
        } 
        catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
        return true;
	}
	
	public ResultSet runQuery(String query) throws SQLException {
		this.sql = query;
		ResultSet rs = null;
		if (connection != null) {
            Statement st = connection.createStatement();
            rs = st.executeQuery(sql);  
        }
		return rs;
	}		      
}
