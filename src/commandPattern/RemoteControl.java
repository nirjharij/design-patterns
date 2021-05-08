package commandPattern;

public class RemoteControl {
	Commands[] onCommands;
	Commands[] offCommands;
	Commands undoCommand;
	
	public RemoteControl() {
		this.onCommands = new Commands[7];
		this.offCommands = new Commands[7];
		
		Commands noCommand = new NoCommand();
		for(int i=0; i<7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Commands onCommand, Commands offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonPushed() {
		undoCommand.undo();
	}
}
