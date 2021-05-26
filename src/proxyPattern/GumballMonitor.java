package proxyPattern;

public class GumballMonitor {
	GumballMachineRemote machineRemote;
	
	public GumballMonitor(GumballMachineRemote machine) {
		this.machineRemote = machine;
	}
	
	public void report() {
		try {
			System.out.println(machineRemote.getLocation());
			System.out.println(machineRemote.getCount());
			System.out.println(machineRemote.getState());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
