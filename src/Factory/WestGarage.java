package Factory;

public class WestGarage extends Garage {

	protected Car createCar(String item) {
		Car car = null;
		Spec2Factory factory = new Spec2Factory();
 
		if (item.equals("Spec1")) {
  
			car = new Spec1Car(factory);
			car.setName("Spec 1 Car");
  
		} else if (item.equals("Spec2")) {
 
			car = new Spec2Car(factory);
			car.setName("Spec 2 Car");
 
		} 
		return car;
	}

}

