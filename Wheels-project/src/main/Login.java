package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
	public Details login_details(String email,String pass) {
		Details user = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wheels","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select UserID,UserName,Email,Password from user where Email='"+email+"' and Password='"+pass+"'");

			while(rs.next()){
				int userid = rs.getInt(1);
				String username = rs.getString(2);
				String email1 = rs.getString(3);
				String password = rs.getString(4);
				user = new Details(userid,username,email1,password);
				System.out.println(user);
			}
			con.close();
		} catch(Exception e){
			System.out.println(e);
		}
		return user;
	}
}
