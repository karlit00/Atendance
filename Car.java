package attendancemay22;

public class Car extends Vehicle {
	
	String tiretype;  // Property to represent the type of tires on the car

	public String getTiretype() {  // Getter method for the tiretype property
		return tiretype;
	}

	public void setTiretype(String tiretype) {  // Setter method for the tiretype property
		this.tiretype = tiretype;
	}
	
	@Override
	void run() {  // Method to simulate the car running
		System.out.println("Car go vroom.");
	}
}