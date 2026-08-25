package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection{
	public static void main(String[]args){

		String url="jdbc:mariadb://localhost:3306/jap89";
		String username="jdbcuser";
		String password="kRishna@1910";

		try{
			Connection con=DriverManager.getConnection(
				url,
				username,
				password  
			);

			System.out.println("DB Connected Successfully");

			con.close();

		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}
