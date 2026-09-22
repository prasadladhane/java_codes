package crudOp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteOp{
	public static void main(String[]args){

		//Database Details
		final String url="jdbc:mariadb://localhost:3306/JAP89";
		final String username="jdbcuser";
		final String password="kRishna@1910";

		String sql="DELETE FROM users WHERE id=?;";

		try{
			//1.Establish Connection
			Connection con=DriverManager.getConnection(url,username,password);

			//2.Create PreparedStatement
			PreparedStatement ps=con.prepareStatement(sql);

			//3.Set Value for ?
			ps.setInt(1,11);

			//4.Execute the Query
			int rows=ps.executeUpdate();


			//5.Output
			System.out.println(rows+" Rows Deleted Successfully!");

			//5.close the resources
			ps.close();
			con.close();

		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
