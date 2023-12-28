package main;

public class Car {
	public int carId;
	public String Make;
	public String Model;
	public String Year;
	public String Mileage;
	public float Price;
	public String status;
	public Car() {
		
	}
	public Car(int carId,String Make, String Model, String Year,String Mileage,Float Price, String status) {
		this.carId = carId;
		this.Make = Make;
		this.Model = Model;
		this.Year = Year;
		this.Mileage = Mileage;
		this.Price = Price;
		this.status = status;
	}
	
	public String toString() {
        return "ID: " + carId + " Make: " + Make + " Model: " + Model + " Year: " + Year + "Mileage: " + Mileage + "Price: "+ Price;
    }
}
