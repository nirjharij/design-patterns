package adapterPattern;

public class CarAdapter implements MotorBike{
	Car car;
	
	@Override
	public void drive() {
		car.drive();
	}
}
