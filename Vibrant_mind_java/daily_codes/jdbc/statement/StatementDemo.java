package statement;

import java.sql.*;

public class StatementDemo{
	public static void main(String[]args){
		String url = "jdbc:mariadb://localhost:3306/JAP89";
		String username = "jdbcuser";
		String password = "kRishna@1910";

		try{
			Class.forName("org.mariadb.jdbc.Driver");

			Connection con=DriverManager.getConnection(url,username,password);
			Statement stmt=con.createStatement();

			String sql = "insert into students values(5,'Rakesh')";
			int rowsAffected = stmt.executeUpdate(sql);

			System.out.println("Rows Inserted:"+rowsAffected);
			stmt.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
