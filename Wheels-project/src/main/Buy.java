package main;

import java.sql.*;

public class Buy {
	public String setBuyerData(int userid,int carid,String Type) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/wheels","root","");
			Statement stmt=con.createStatement();
			
			
			long millis=System.currentTimeMillis();  
	        java.sql.Date date1=new java.sql.Date(millis);  
	        
	        
			stmt.executeUpdate("insert into transaction(UserID,CarID,TransactionType,TransactionDate) values('"+userid+"','"+carid+"','"+Type+"','"+date1+"')");
			stmt.executeUpdate("update cars set Status='Sold' where CarId='"+carid+"'");
			con.close();
		} catch(Exception e)
		{
			System.out.println(e);
		}
		return "";
	}
}