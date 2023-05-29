package attendancemay22;

public class Vehicle {

	// Properties of the Vehicle class
	int speed;
	String color;
	double price;

	// Getter method for speed property
	public int getSpeed() {
		return speed;
	}

	// Setter method for speed property
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// Getter method for color property
	public String getColor() {
		return color;
	}

	// Setter method for color property
	public void setColor(String color) {
		this.color = color;
	}

	// Getter method for price property
	public double getPrice() {
		return price;
	}

	// Setter method for price property
	public void setPrice(double price) {
		this.price = price;
	}

	void run() {
		System.out.println("Vehicle runs.");
	}
	// Method to stop the vehicle
	void stop() {
		System.out.println("Vehicle stopped.");
	}
}
