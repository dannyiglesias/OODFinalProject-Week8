package RaceSim;

public class EngineeringTest2 {
	
	public static void main(String[] arg) {
		EngineeringTest2 engineeringTest = new EngineeringTest2();
		AeroPackages aero = new AeroPackages();
		EngineConfig engine = new EngineConfig();
		TireSelection tire = new TireSelection();
		AeroPackages2 aero2 = new AeroPackages2();
		EngineConfig2 engine2 = new EngineConfig2();
		TireSelection2 tire2 = new TireSelection2(); 
		
		System.out.println("VEHICLE COMPONENT CONFIGURATIONS FOR RACE DAY");
		System.out.println("");
		
		System.out.println("Aero Packages Available");
		System.out.println("==============================");
		
		for (Iterator iterator = aero.getIterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		
		System.out.println("");
		System.out.println("Engine Configurations Available");
		System.out.println("==============================");
		for (Iterator iterator = engine.getIterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
		
		System.out.println("");
		System.out.println("Tire Compounds Available");
		System.out.println("==============================");
		for (Iterator iterator = tire.getIterator(); iterator.hasNext(); ) {
			System.out.println(iterator.next());
		}
	}

}
