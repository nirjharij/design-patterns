package proxyPattern;

public class SoldState implements State{
	private static final long serialVersionUID = 2L;
	transient GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Gumball will be dispensed in a moment. Please wait....");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Gumball will be dispensed in a moment. Please wait....");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Gumball will be dispensed in a moment. Please wait....");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		
		if (gumballMachine.count > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		else {
			System.out.println("Gumballs finished....Try later...");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
