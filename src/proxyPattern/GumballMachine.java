package proxyPattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State soldOutState;
	State winnerState;
	
	State currentState;
	int count = 0;
	String location;
	
	private static final long serialVersionUID = 2L;
	
	public GumballMachine(String location, int numberOfGumballs) throws RemoteException{
		this.count = numberOfGumballs;
		this.location = location;
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

	@Override
	public String getLocation() throws RemoteException {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public State getState() throws RemoteException {
		// TODO Auto-generated method stub
		return currentState;
	}

}
