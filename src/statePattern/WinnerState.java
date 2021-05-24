package statePattern;

public class WinnerState implements State{
	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0)
			gumballMachine.setState(gumballMachine.getSoldOutState());
		else {
			gumballMachine.releaseBall();
			System.out.println("YOU ARE A WINNER!!!");
			if (gumballMachine.getCount() == 0)
				gumballMachine.setState(gumballMachine.getSoldOutState());
			else {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}
		}
	}
	
}
