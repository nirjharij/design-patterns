package proxyPattern;

import java.util.Random;

public class HasQuarterState implements State{
	private static final long serialVersionUID = 2L;
	transient GumballMachine gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter already inserted....");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Ejecting quarter....");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turning crank to get gumball....");
		int winner = randomWinner.nextInt();
		if ((winner == 0) && (gumballMachine.getCount() > 1))
			gumballMachine.setState(gumballMachine.getWinnerState());
		else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed....");
	}

}
