package proxyPattern;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
	public static void main(String[] args) {
		String[] locationStrings = {"rmi://newdelhi.mightygumball.com/gumballmachine",
				"rmi://mumbai.mightygumball.com/gumballmachine",
				"rmi://chennai.mightygumball.com/gumballmachine"};
		
		GumballMonitor[] monitor = new GumballMonitor[locationStrings.length];
		
		for (int i=0; i<locationStrings.length; i++) {
			try {
				GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(locationStrings[i]);
				monitor[i] = new GumballMonitor(machineRemote);
				System.out.println(monitor[i]);
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		for (int i=0; i<monitor.length; i++) {
			monitor[i].report();
		}
	}
}
