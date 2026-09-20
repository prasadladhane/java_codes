package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo{
	public static void main(String[]args){
		String url="jdbc:mariadb://localhost:3306/JAP89";
		String username="jdbcuser";
		String password="kRishna@1910";

		try{
			Class.forName("org.mariadb.jdbc.Driver");

			Connection con=DriverManager.getConnection(url,username,password);
			String sql="insert into students values(?,?)";

			PreparedStatement ps= con.prepareStatement(sql);

			ps.setInt(1,8);
			ps.setString(2,"Kiran");

			int rowsAffected=ps.executeUpdate();

			System.out.println("Rows Inserted:"+rowsAffected);

			ps.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
