package attendancemay22;

public class Boat extends Vehicle {

	String sailcolor;  // Property to represent the color of the sail

	public String getSailcolor() {  // Getter method for the sailcolor property
		return sailcolor;
	}

	public void setSailcolor(String sailcolor) {  // Setter method for the sailcolor property
		this.sailcolor = sailcolor;
	}

	@Override
	void run() {  // Method to simulate the boat floating
		System.out.println("Boat go wheeesh.");
	}

}