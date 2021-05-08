package commandPattern;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl rControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		
		LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
		
		rControl.setCommand(0, lightOnCommand, lightOffCommand);
		rControl.onButtonPushed(0);
		rControl.offButtonPushed(0);
		rControl.undoButtonPushed();
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		rControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
		rControl.onButtonPushed(0);
		rControl.offButtonPushed(0);
		rControl.undoButtonPushed();
	}
}
