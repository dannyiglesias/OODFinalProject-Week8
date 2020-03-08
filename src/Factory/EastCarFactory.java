package Factory;

public class EastCarFactory implements HomeFactory {

	@Override
	public SuspensionConfig createSuspension() {
		// TODO Auto-generated method stub
		return new SuspensionSpec1();
	}

	@Override
	public AeroConfig createAero() {
		// TODO Auto-generated method stub
		return new AeroSpec1();
	}

	@Override
	public EngineConfig createEngine() {
		// TODO Auto-generated method stub
		return new EngineSpec1();
	}

	@Override
	public TireSelection[] createTires() {
		// TODO Auto-generated method stub
		return null ;
	}

}
