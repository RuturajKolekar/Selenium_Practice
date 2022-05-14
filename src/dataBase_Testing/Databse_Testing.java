package dataBase_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

public class Databse_Testing {

	public static void main(String[] args) throws SQLException  {
	  
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/softwaretesting","root","1234");
	
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from members");
        
		 while(rs.next()) {
			 System.out.println(rs.getString(1)+"  "+rs.getString("name") +"  "+  rs.getString(3)+"  "+rs.getString(4));
		 }
		 stmt.close();
	}

}

