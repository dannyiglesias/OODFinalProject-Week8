package RaceSim;

import java.util.ArrayList;
import java.util.List;

public class AeroPackages2 implements Config {
	private List<String> Packages = new ArrayList<String>();
	
	public AeroPackages2() {
		//Packages.add("Aero Package 1: Reduced Drag in tight corners, slower speeds on straights");
		Packages.add("Spec 2 Aero Package A: Excellent on straights with decreased performance in cornering");
		Packages.add("Spec 2 Aero Package B: Best for overtaking on straights with minimal speed sacrificed in corners");
		
	}
	public Iterator getIterator() {
		return new aeroIterator();	
	}
	
	private class aeroIterator implements Iterator {
		
		private int position;
		
		@Override
		public boolean hasNext() {
			if(position < Packages.size())
				return true;
			return false;
			
		}
		
		@Override 
		public Object next() {
			if (this.hasNext())
				return Packages.get(position++);
			return null;
		}
		
	}

	public Iterator getIterator1() {
		// TODO Auto-generated method stub
		return null;
	}
			
			
	

}
