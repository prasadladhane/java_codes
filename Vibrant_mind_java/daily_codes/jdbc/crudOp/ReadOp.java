package crudOp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadOp{
	public static void main(String[]args){

		final String url="jdbc:mariadb://localhost:3306/JAP89";
		final String username="jdbcuser";
		final String password="kRishna@1910";

		String sql="SELECT * FROM users;";

		try{
			//1.Establish connection
			Connection con=DriverManager.getConnection(url,username,password);

			//2.Create Prepared Statement
			PreparedStatement ps=con.prepareStatement(sql);

			//3.Execute Select Query
			ResultSet rs=ps.executeQuery();

			//4.Read data from Result Set
			while(rs.next()){
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String email=rs.getString("email");

				System.out.println(id+"|"+name+"|"+email);
			}
			//5.Close the resources
			rs.close();
			ps.close();
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}


