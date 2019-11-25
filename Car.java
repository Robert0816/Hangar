
public class Car extends Vehicle {

	public Car(String brand, int kilometers) {
		super(brand, kilometers);
	}

	@Override
	public String doStuff() {
		return "I am " + this.getBrand() + " the best car in the world!"; 
	}

}
