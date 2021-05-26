package proxyPattern;

public class NoQuarterState implements State{
	private static final long serialVersionUID = 2L;
	transient GumballMachine gumballMachine;

	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		System.out.println("Please insert quarter first to turn the crank...");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter not inserted...");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Please insert quarter first to turn the crank...");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Please insert quarter first to dispense the balls...");
	}

}
