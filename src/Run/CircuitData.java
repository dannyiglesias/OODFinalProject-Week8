package Run;
import java.util.Scanner;

import RaceEngineer.TestLoader;
import RaceSim.EngineeringTest;
import RaceSim.EngineeringTest2;
import Factory.*;
import Factory.Garage;
import SpecialConfiguration.specXorder;

public class CircuitData {
	
	public static void main(String[] args) throws InterruptedException {
		Garage spec1garage = new EastGarage();
		Garage spec2garage = new WestGarage();
		
		String Circuit = null;
		String CircuitType = null;
		String Condition = null;
		int Temp = 0;
		String carspec = null;
		
		Scanner round = new Scanner(System.in);
		System.out.println("To begin please enter the round number of the Formula 1 2020 Calendar (1-21): ");
		
		int roundNum = round.nextInt();
		System.out.println("The round you have selected for development is the following: " + roundNum);
	
	
		//================================================
		//Factory Pattern feeds this method
		//================================================

		if (roundNum == 1) {
				Circuit = "Austrailian Grand Prix";
				CircuitType = "Fast";
				Condition = "Dry";
				Temp = 81;
				carspec = "Spec 1";
		}
		else if(roundNum == 2) {
			Circuit = "Bahrain Grand Prix";
			CircuitType = "Fast";
			Condition = "Windy";
			Temp = 77;
			carspec = "Spec 1";
		}
		else if (roundNum == 3) {
			Circuit = "Chinese Grand Prix";
			CircuitType = "Fast";
			Condition = "Dry";
			Temp = 66;
			carspec = "Spec 1";
		}
		else if(roundNum == 4) {
			Circuit = "Azerbaijan Grand Prix";
			CircuitType = "Fast";
			Condition = "Windy";
			Temp = 66;
			carspec = "Spec 1";
		}
		else if (roundNum == 5) {
			Circuit = "Spanish Grand Prix";
			CircuitType = "Technical";
			Condition = "Dry";
			Temp = 64;
			carspec = "Spec 2";
		}
		else if(roundNum == 6) {
			Circuit = "Monaco Grand Prix";
			CircuitType = "Technical";
			Condition = "Wet";
			Temp = 68;
			carspec = "Spec 2";
		}
		else if (roundNum == 7) {
			Circuit = "Canadian Grand Prix";
			CircuitType = "Fast";
			Condition = "Dry";
			Temp = 82;
			carspec = "Spec 1";
		}
		else if(roundNum == 8) {
			Circuit = "French Grand Prix";
			CircuitType = "Fast";
			Condition = "Dry";
			Temp = 77;
			carspec = "Spec 1";
		}
		else if (roundNum == 9) {
			Circuit = "Austrian Grand Prix";
			CircuitType = "Fast";
			Condition = "Dry";
			Temp = 84;
			carspec = "Spec 1";
		}
		else if(roundNum == 10) {
			Circuit = "British Grand Prix";
			CircuitType = "Fast";
			Condition = "Dry";
			Temp = 68;
			carspec = "Spec 1";
		}
		else if (roundNum == 11) {
			Circuit = "German Grand Prix";
			CircuitType = "Technical";
			Condition = "Wet";
			Temp = 73;
			carspec = "Spec 2";
		}
		else if(roundNum == 12) {
			Circuit = "Hungarian Grand Prix";
			CircuitType = "Technical";
			Condition = "Dry";
			Temp = 75;
			carspec = "Spec 2";
		}
		else if (roundNum == 13) {
			Circuit = "Belgian Grand Prix";
			CircuitType = "Technical";
			Condition = "Dry";
			Temp = 64;
			carspec = "Spec 2";
		}
		else if(roundNum == 14) {
			Circuit = "Italian Grand Prix";
			CircuitType = "Fast";
			Condition = "Dry";
			Temp = 77;
			carspec = "Spec 1";
		}
		else if (roundNum == 15) {
			Circuit = "Singapore Grand Prix";
			CircuitType = "Technical";
			Condition = "Wet";
			Temp = 86;
			carspec = "Spec 2";
		}
		else if(roundNum == 16) {
			Circuit = "Russian Grand Prix";
			CircuitType = "Fast";
			Condition = "Dry";
			Temp = 70;
			carspec = "Spec 1";
		}
		else if (roundNum == 17) {
			Circuit = "Japanese Grand Prix";
			CircuitType = "Technical";
			Condition = "Windy";
			Temp = 75;
			carspec = "Spec 2";
		}
		else if(roundNum == 18) {
			Circuit = "Mexican Grand Prix";
			CircuitType = "Technical";
			Condition = "Dry";
			Temp = 73;
			carspec = "Spec 2";
		}
		else if (roundNum == 19) {
			Circuit = "United States Grand Prix";
			CircuitType = "Fast";
			Condition = "Dry";
			Temp = 72;
			carspec = "Spec 1";
		}
		else if(roundNum == 20) {
			Circuit = "Brazilian Grand Prix";
			CircuitType = "Technical";
			Condition = "Dry";
			Temp = 70;
			carspec = "Spec 2";
		}
		else if (roundNum == 21) {
			Circuit = "Abu Dhabi Grand Prix";
			CircuitType = "Technical";
			Condition = "Dry";
			Temp = 82;
			carspec = "Spec 2";
		}
		
		System.out.println("Round " + roundNum + " of the FIA Formula 1 calendar takes place at the: " + Circuit + "\nThe " + Circuit + " is known for being a  " + CircuitType + " circuit and will have " + Condition + " conditions,\nwith an external temperature of " + Temp + " degrees Farhenheit.");
		System.out.println("The factory Car spec to be ordered for this circuit and it's conditions is: " + carspec);
		Thread.sleep(2000);
		System.out.println("");
		System.out.println("INITIATING ORDER....");
		Thread.sleep(2000);
		System.out.println("");
		
		
		//=====================================================
		//Factory Pattern
		//=====================================================
		if(carspec == "Spec 1") {
			carOrder.main(args);
		}else if (carspec == "Spec 2") {
			carOrder2.main(args);
		}
			
		
		System.out.println("");
		System.out.println("The following race day configurations will be available from the factory for Practice, Qualifying, and the Race");
		System.out.println("");
		
		//======================================================
		//List of configurations available - Iterator Pattern
		//======================================================
		if (carspec == "Spec 1") {
			EngineeringTest.main(args);
		} else {
			EngineeringTest2.main(args);
		}
		
		//====================================
		//Decorator Pattern is next 
		//====================================
		System.out.println("");
		System.out.println("Loading ADVANCED CONFIGURATIONS OPTIONS....");
		Thread.sleep(2000);
		System.out.println("");
		specXorder.main(args);
		System.out.println("");
		
		
		//=====================================================
		//System Test is Next - Command Pattern
		//=====================================================
		System.out.println("=======================================================");
		System.out.println("Computers will now commence Spec car shakedown test....");
		System.out.println("=======================================================");
		Thread.sleep(2000);
		System.out.println("");
		try {
			TestLoader.main(args);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("");
		System.out.println("You are now ready to begin Test runs, and qualifying laps!");
		System.out.println("");
		
	
	}
		
		
}
	
