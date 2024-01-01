package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Sell{
	public String sellCar(String make, String model,String year, String mileage, float price) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/wheels","root","");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("INSERT INTO cars(Make, Model, Year, Mileage, Price,Status) VALUES('"+make+"','"+model+"','"+year+"','"+mileage+"','"+price+"','Available')");
			con.close();
		} catch(Exception e){
			System.out.println(e);
		}
		return "";
	}
}