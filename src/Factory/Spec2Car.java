package Factory;

public abstract class Spec2Car extends Car {
	WestCarFactory carfactory;
	
	public Spec2Car(WestCarFactory carfactory) {
		this.carfactory = carfactory;
	}
	
	public void prepare() {
		System.out.println("Developing " + name);
		suspension = carfactory.createSuspension();
		aero = carfactory.createAero();
		engine = carfactory.createEngine();
		tires = carfactory.createTires();
	}

}

	
	