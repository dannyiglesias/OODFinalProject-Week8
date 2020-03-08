package Factory;

public class CarFactory {
	
	public Car createCar(String type) {
		Car car = null;
		
		if(type.equals("Spec1")) {
			car = new Spec1Car(null);
		} else if (type.equals("Spec2")) {
			car = new Spec2Car(null);
		}
		return car;
	}


}
