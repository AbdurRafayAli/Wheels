package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Search {
	public Car[] searchCar(String make) {
		Car[] cars = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wheels","root","");
			Statement stmt=con.createStatement();
			ResultSet r=stmt.executeQuery("select Count(*) from cars where Make='"+make+"'");
			r.next();
			int count =r.getInt(1);
			if(count>0) {				
				ResultSet rs=stmt.executeQuery("select * from cars where Make='"+make+"'");
				
				int noOfCars;
				
				rs.last();
				noOfCars = rs.getRow();
				rs.beforeFirst();
				
				cars = new Car[noOfCars];
				
				int i = 0;
				
				while(rs.next()){
					int carId = rs.getInt(1);
					String Make = rs.getString(2);
					String Model = rs.getString(3);
					String Year = rs.getString(4);
					String Mileage = rs.getString(5);
					float Price = rs.getFloat(6);
					String status = rs.getString(7);
					cars[i] = new Car(carId,Make,Model,Year,Mileage,Price,status);
					System.out.println(cars);
					
					i++;
				}
			}
			else {
				System.out.println("car not found");
			}
			con.close();
		} catch(Exception e){
			System.out.println(e);
		}
		return cars;
	}
}