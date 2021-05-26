package proxyPattern;

public class SoldOutState implements State{
	private static final long serialVersionUID = 2L;
	transient GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Gumballs finished... Try later....");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Gumballs finished... Try later....");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Gumballs finished... Try later....");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Gumballs finished... Try later....");
	}

}
