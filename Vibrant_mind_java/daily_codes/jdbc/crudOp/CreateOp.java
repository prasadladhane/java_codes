package crudOp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateOp{
	public static void main(String[]args){
		
		//Database Information
		String url="jdbc:mariadb://localhost:3306/JAP89";
		String username="jdbcuser";
		String password="kRishna@1910";

		//SQL Query
		String sql="INSERT INTO users(id,name,email) VALUES(?,?,?);";

		try{
			//Create DB Connection
			Connection con = DriverManager.getConnection(url,username,password);
			
			//Create Preapred Statement
			PreparedStatement ps=con.prepareStatement(sql);

			//Set values for ?
			ps.setInt(1,11);
			ps.setString(2,"Prasad");
			ps.setString(3,"prasad@gmail.com");

			//Execute INSERT query
			int rows = ps.executeUpdate();
			System.out.println(rows+"User Inserted in DB Successfully!");
			
			//Close Connections
			ps.close();
			con.close();


		}catch(SQLException e){
			e.printStackTrace();
		}

	}
}
