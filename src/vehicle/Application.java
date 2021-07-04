package vehicle;

public class Application {

	public static void main(String[] args) {
		Car bmw=new Car();
		Truck volvo=new Truck();
		Vehicle marsedez=new Car();
		
		System.out.println(bmw.ignitionMethod()); //dynmaic polymorphisim
		System.out.println(bmw.maxyumumSpeed());
		System.out.println("******************");
		
		System.out.println(volvo.ignitionMethod());
		System.out.println(volvo.maxyumumSpeed());
		System.out.println("******************");

		System.out.println(marsedez.ignitionMethod());
		System.out.println(marsedez.maxyumumSpeed());
		System.out.println("******************");

	}

}
