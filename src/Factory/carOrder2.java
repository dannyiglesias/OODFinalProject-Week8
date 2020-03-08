package Factory;

public class carOrder2 {
 
	public static void main(String[] args) {
		Garage spec1garage = new EastGarage();
		Garage spec2garage = new WestGarage();
 
		Car car2 = spec2garage.orderCar("Spec2");
		System.out.println("Principal ordered " + car + " for this race" + "\n");
		
	

}}

	
	


