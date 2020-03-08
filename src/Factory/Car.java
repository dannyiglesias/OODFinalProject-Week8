package Factory;

public abstract class Car {
	String name;
	protected String description = "Unknown Spec";
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

	SuspensionConfig suspension;
	AeroConfig aero;
	EngineConfig engine;
	TireSelection[] tires;

	public abstract void prepare();

	public void Coordinate() {
		System.out.println("Coordinating engineering and manufacturing of componenets");
	}

	public void Assemble() {
		System.out.println("Assembling components to form Spec Car");
		
	}
	
	public void Test() {
		System.out.println("Testing out Spec Car through simulation");
	}
	
	public void Ship() {
		System.out.println("Shipping Spec Car to the track");
	}

	public void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (suspension != null) {
			result.append(suspension);
			result.append("\n");
		}
		if (aero != null) {
			result.append(aero);
			result.append("\n"); 
		}
		if (engine != null) {
			result.append(engine);
			result.append("\n");
		}
		if (tires != null) {
			result.append(tires);
			result.append("\n");
		}
		
		return result.toString();
	}
}