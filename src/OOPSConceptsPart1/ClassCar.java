package OOPSConceptsPart1;

public class ClassCar {
	// Global variable : which is available throughout , and should be defined
	// inside the class
	int model;
	int wheel;

	public static void main(String[] args) {

		ClassCar a = new ClassCar();
		ClassCar b = new ClassCar();

		a.model = 12333;
		a.wheel = 7;

		System.out.println(a.model + "  " + a.wheel);

	}

}
