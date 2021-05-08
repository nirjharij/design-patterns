package commandPattern;

public class CeilingFanHighCommand implements Commands{
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}
		
	public void undo() {
		if (prevSpeed == ceilingFan.HIGH)
			ceilingFan.high();
		else if (prevSpeed == ceilingFan.MEDIUM)
			ceilingFan.medium();
		else if (prevSpeed == ceilingFan.LOW)
			ceilingFan.low();
		else if (prevSpeed == ceilingFan.OFF)
			ceilingFan.off();
	}
}
