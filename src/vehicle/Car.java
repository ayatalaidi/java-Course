package vehicle;

public class Car implements Vehicle {

	@Override
	public String maxyumumSpeed() {
		return "250km/h";
	}

	@Override
	public String ignitionMethod() {
		return "diesel";
	}

}
