package crudOp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateOp{
	public static void main(String[]args){
		//DB details
		final String url="jdbc:mariadb://localhost:3306/JAP89";
		final String username="jdbcuser";
		final String password="kRishna@1910";

		//SQL query
		String sql="UPDATE users SET id=?, name=?, email=?;";

		try{
			//1.Establish Connecion
			Connection con=DriverManager.getConnection(url,username,password);
			
			//2.Create PreparedStatement
			PreparedStatement ps=con.prepareStatement(sql);

			//3.Set values for ?
			ps.setInt(1,1);
			ps.setString(2,"steve");
			ps.setString(3,"steve@gmail.com");

			//4.ExecuteUpdte
			int rows=ps.executeUpdate();

			//5.Output
			System.out.println(rows+" updated successfully!");
			
			//6.Close the resources
			ps.close();
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
