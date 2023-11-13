package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Conexion {

	public Connection con;
	public Statement stm;
	
	public Conexion (String usuario, String pass , String database) {
		
		
			try {
				this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ database,usuario,pass);
				this.stm = this.con.createStatement(); 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			
	}
}
