package adapterPattern;

public class MotorBikeAdapter implements Car{
	MotorBike mBike;
	
	@Override
	public void drive() {
		mBike.drive();
	}

	@Override
	public void playMusic() {
		throw new UnsupportedOperationException();
	}
	
}
