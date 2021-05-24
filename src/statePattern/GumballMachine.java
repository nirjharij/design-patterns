package statePattern;

public class GumballMachine {
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State soldOutState;
	State winnerState;
	
	State currentState;
	int count = 0;
	
	public GumballMachine(int numberOfGumballs) {
		this.count = numberOfGumballs;
		
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);
		
		
	}
	
	public void insertQuarter() {
		currentState.insertQuarter();
	}

	public void ejectQuarter() {
		currentState.ejectQuarter();
		
	}

	public void turnCrank() {
		currentState.turnCrank();
		
	}

	public void dispense() {
		currentState.dispense();
	}
	
	public void setState(State state) {
		this.currentState = state;
	}
	
	public void releaseBall() {
		System.out.println("Dispensing ball...");
		if (count != 0)
			count = count - 1;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public int getCount() {
		return count;
	}

}
