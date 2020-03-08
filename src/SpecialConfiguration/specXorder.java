package SpecialConfiguration;

import java.util.Scanner;

public class specXorder {
	
	public static void main(String args[]) {
		
		SpecX specXa = new xAero();
		SpecX specXe = new xEngine();
		SpecX specXs = new xSuspension();
		SpecX specXt = new xTires();
		
		Scanner select = new Scanner(System.in);
		System.out.println("Please select which component you would like to configure: \n" + "Aero[1] \n" + "Engine[2] \n" + "Suspension[3] \n" + "Tires[4]");
		int selectx = select.nextInt();
		
		if (selectx == 1) {
			System.out.println("Our engineers have developed some winglets to include on the front wing which will generate a vortex to increase downforce and grip");
			System.out.println(specXa.getDescription() + "\n" + "Total cost of the configuration is: \n"  + "$ " + specXa.cost());
			System.out.println("");
			System.out.println("========================================================================================================================");
			System.out.println("Modifcations will be performed to the current Spec for a cost of $" + specXa.cost() + " and a System Test will commence shortly");
			System.out.println("========================================================================================================================");
		}
		else if (selectx == 2) {
			System.out.println("Our engineers have discovered a legal loophole in the FIA regulations surrounding KERS");
			System.out.println(specXe.getDescription() + "\n" + "Total cost of the configuration is: \n"  + "$ " + specXe.cost());
			System.out.println("");
			System.out.println("========================================================================================================================");
			System.out.println("Modifcations will be performed to the current Spec for a cost of $" + specXe.cost() + " and a System Test will commence shortly");
			System.out.println("========================================================================================================================");
		} 
		else if (selectx == 3) {
			System.out.println("Our engineers have developed a creative solution to maximize toe angle benefits for each sector of the track");
			System.out.println(specXs.getDescription() + "\n" + "Total cost of the configuration is: \n"  + "$ " + specXs.cost());
			System.out.println("");
			System.out.println("========================================================================================================================");
			System.out.println("Modifcations will be performed to the current Spec for a cost of $" + specXs.cost() + " and a System Test will commence shortly");
			System.out.println("========================================================================================================================");
		} 
		else if (selectx == 4) {
			System.out.println("Pirelli has provided all F1 grid teams with the C5 tire compound for use this season");
			System.out.println(specXt.getDescription() + "\n" + "Total cost of the configuration is: \n"  + "$ " + specXt.cost());
			System.out.println("");
			System.out.println("========================================================================================================================");
			System.out.println("Modifcations will be performed to the current Spec for a cost of $" + specXt.cost() + " and a System Test will commence shortly");
			System.out.println("========================================================================================================================");
		} 

	} 
		
}


