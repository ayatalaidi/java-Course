package vehicle;

public class Truck implements Vehicle{

	@Override
	public String maxyumumSpeed() {
		return "100km/h";
	}

	@Override
	public String ignitionMethod() {
		return "gaz";
	}

}
