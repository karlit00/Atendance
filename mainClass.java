package attendancemay22;

public class mainClass {
	public static void main(String[] args) {
		
		//Declare subclasses types-------------------------------
		Car ToyotaVios = new Car();
		ToyotaVios.setColor("Black");
		ToyotaVios.setPrice(2000000);
		ToyotaVios.setSpeed(180);
		ToyotaVios.setTiretype("Continental");
		
		Plane U2SpyPlane = new Plane();
		U2SpyPlane.setColor("gray");
		U2SpyPlane.setPrice(100000);
		U2SpyPlane.setSpeed(1400);
		U2SpyPlane.setWingspan(40);
		
		Boat FandangoYacht = new Boat();
		FandangoYacht.setColor("white");
		FandangoYacht.setPrice(700000);
		FandangoYacht.setSpeed(400);
		FandangoYacht.setSailcolor("green");
		
		
		//Calls out subclasses-----------------------------------
		System.out.println("Eyo lemme check out your car\n\n");
		
		ToyotaVios.run();
		ToyotaVios.stop();
		
		System.out.println("\n\nCheck this out, homie.\n\n");
		
		System.out.println("Color " + ToyotaVios.color);
		System.out.println("Bought it for " + ToyotaVios.price + " pesos.");
		System.out.println("Runs " + ToyotaVios.speed + " mph");
		System.out.println("Has a " + ToyotaVios.tiretype + " tire on.\n\n");
		
		ToyotaVios.run();

		System.out.println("\nAight imma ride my plane now.\n\n");
		
		U2SpyPlane.stop();
		
		System.out.println("\nColor " + U2SpyPlane.color + " plane.");
		System.out.println("Bought it for " + U2SpyPlane.price + " dollars.");
		System.out.println("Runs " + U2SpyPlane.speed + " mph");
		System.out.println("Has a " + U2SpyPlane.wingspan + " meter wingspan.\n");
		
		U2SpyPlane.run();
		U2SpyPlane.stop();
		
		System.out.println("\n*Rode a boat for leisure*");
		
		System.out.println("\nColor " + FandangoYacht.color + " boat.");
		System.out.println("Bought it for " + FandangoYacht.price + " dollars.");
		System.out.println("Runs " + FandangoYacht.speed + " mph");
		System.out.println("Has a " + FandangoYacht.sailcolor + " sail color.\n");
		
		FandangoYacht.run();
		FandangoYacht.stop();
		
		

		

		}
}
