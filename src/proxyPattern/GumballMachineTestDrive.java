package proxyPattern;

import java.rmi.Naming;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		int count;
		
		if (args.length < 2) {
			System.out.println("Gumball Machine");
			System.exit(1);
		}
		
		try {
			count = Integer.parseInt(args[1]);
			gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//"+args[0]+ "/gumballmachine", gumballMachine);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
