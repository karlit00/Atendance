package attendancemay22;

public class Plane extends Vehicle {
	
	double wingspan;  // Property to represent the wingspan of the plane

	public double getWingspan() {  // Getter method for the wingspan property
		return wingspan;
	}

	public void setWingspan(double wingspan) {  // Setter method for the wingspan property
		this.wingspan = wingspan;
	}
	@Override
	void run() {  // Static method to simulate the plane flying
		System.out.println("Plane go weeee.");
	}
}
