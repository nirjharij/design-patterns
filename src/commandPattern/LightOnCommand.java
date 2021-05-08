package commandPattern;

public class LightOnCommand implements Commands{
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}
	
	public void undo() {
		light.off();
	}
}
